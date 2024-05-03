package com.dao;

import com.entity.XuqiufankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuqiufankuiVO;
import com.entity.view.XuqiufankuiView;


/**
 * 需求反馈
 * 
 * @author 
 * @email 
 * @date 2023-01-29 09:14:27
 */
public interface XuqiufankuiDao extends BaseMapper<XuqiufankuiEntity> {
	
	List<XuqiufankuiVO> selectListVO(@Param("ew") Wrapper<XuqiufankuiEntity> wrapper);
	
	XuqiufankuiVO selectVO(@Param("ew") Wrapper<XuqiufankuiEntity> wrapper);
	
	List<XuqiufankuiView> selectListView(@Param("ew") Wrapper<XuqiufankuiEntity> wrapper);

	List<XuqiufankuiView> selectListView(Pagination page,@Param("ew") Wrapper<XuqiufankuiEntity> wrapper);
	
	XuqiufankuiView selectView(@Param("ew") Wrapper<XuqiufankuiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XuqiufankuiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XuqiufankuiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XuqiufankuiEntity> wrapper);



}
