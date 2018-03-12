package com.service;

import java.util.List;
import java.util.Map;

import com.entity.OutinPlace;

public interface IOutinPlaceService {
	/**
	 * 添加出入口配置
	 * @param outinPlace 出入口实体
	 * @return
	 */
	Map<String,Object> saveOutPlace(OutinPlace outinPlace);
	
	/**
	 * 通过id删除出入口配置
	 * @param id
	 * @return
	 */
	Map<String,Object> deleteOutPlaceById(String id);
	
	/**
	 * 查询所有出入口配置
	 * @return
	 */
	List<Map<String,Object>> searchOutPlace();
	
	
}
