package com.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.dao.IOutinPlaceDao;
import com.entity.OutinPlace;
import com.mchange.v2.codegen.bean.GeneratorExtension;
import com.service.IOutinPlaceService;

@Service
public class OutinPlaceServiceImpl implements IOutinPlaceService{
	@Autowired
	private IOutinPlaceDao  outinPlaceDao;

	//添加出入口配置
	@Override
	public Map<String,Object> saveOutPlace(OutinPlace outinPlace) {
		Map<String,Object> result = new HashMap<String,Object>();
		try {
			if(outinPlace.getId() == "") {
				//新增
				OutinPlace op = new OutinPlace();
				op.setId(UUID.randomUUID().toString().replaceAll("-", ""));
				op.setCreatestorehouseId(outinPlace.getCreatestorehouseId());
				op.setCreatestoreareaId(outinPlace.getCreatestoreareaId());
				op.setType(outinPlace.getType());
				op.setOutNo(outinPlace.getOutNo());
				op.setPlaceHeight(outinPlace.getPlaceHeight());
				//op.setColumn(outinPlace.getColumn());
				op.setPlaceColumn(outinPlace.getPlaceColumn());
				op.setIsUsed(outinPlace.getIsUsed());
				outinPlaceDao.insertOutPlace(op);
			}else {
				//修改
				OutinPlace op = outinPlaceDao.searchOutinPlaceById(outinPlace.getId());
				op.setId(UUID.randomUUID().toString().replaceAll("-", ""));
				op.setCreatestorehouseId(outinPlace.getCreatestorehouseId());
				op.setCreatestoreareaId(outinPlace.getCreatestoreareaId());
				op.setType(outinPlace.getType());
				op.setOutNo(outinPlace.getOutNo());
				op.setPlaceHeight(outinPlace.getPlaceHeight());
				op.setPlaceColumn(outinPlace.getPlaceColumn());
				op.setIsUsed(outinPlace.getIsUsed());
				outinPlaceDao.updateOutPlace(op);
			}
			result.put("stus", 200);
		} catch (Exception e) {
			e.printStackTrace();
			result.put("stus", 500);
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		}
		
		return result;
	}

	//通过id查找出入口配置
	@Override
	@Transactional
	public Map<String,Object> deleteOutPlaceById(String id) {
		Map<String,Object> result = new HashMap<String,Object>();
		try {
			outinPlaceDao.deleteOutPlaceById(id);
			result.put("stus", 200);
		} catch (Exception e) {
			e.printStackTrace();
			result.put("stus", 500);
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		}
		
		return result;
	}

	//查询所有出入口配置
	@Override
	public List<Map<String, Object>> searchOutPlace() {
		return outinPlaceDao.searchOutPlace();
	}

}
