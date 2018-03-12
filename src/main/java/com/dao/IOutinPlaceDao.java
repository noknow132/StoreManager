package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.entity.OutinPlace;

public interface IOutinPlaceDao {
	
	/**
	 * 添加出入口配置
	 * @param outinPlace 出入口实体
	 * @return
	 */
	int insertOutPlace(OutinPlace outinPlace);
	
	/**
	 * 修改出入口配置
	 * @param outinPlace 出入口实体
	 * @return
	 */
	int updateOutPlace(OutinPlace outinPlace);
	
	/**
	 * 通过id查找出入口配置
	 * @param id 
	 * @return
	 */
	OutinPlace searchOutinPlaceById(String id);
	
	/**
	 * 通过根据类型查找出入口配置
	 * @param type 类型
	 * @return
	 */
	OutinPlace selectOutinPlaceByType(@Param("type") Integer type);
	
	/**
	 * 根据出口编号查找取货台
	 * @param outNo 出口
	 * @return
	 */
	OutinPlace selectOutinPlaceByOutNo(@Param("outNo") String outNo);
	
	/**
	 * 通过id删除出入口配置
	 * @param id
	 * @return
	 */
	int deleteOutPlaceById(String id);
	
	/**
	 * 查询所有出入口配置
	 * @return
	 */
	List<Map<String,Object>> searchOutPlace();
	
    
}