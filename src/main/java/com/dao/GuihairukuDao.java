package com.dao;

import com.entity.GuihairukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuihairukuVO;
import com.entity.view.GuihairukuView;


/**
 * 归还入库
 * 
 * @author 
 * @email 
 * @date 2023-01-29 09:14:27
 */
public interface GuihairukuDao extends BaseMapper<GuihairukuEntity> {
	
	List<GuihairukuVO> selectListVO(@Param("ew") Wrapper<GuihairukuEntity> wrapper);
	
	GuihairukuVO selectVO(@Param("ew") Wrapper<GuihairukuEntity> wrapper);
	
	List<GuihairukuView> selectListView(@Param("ew") Wrapper<GuihairukuEntity> wrapper);

	List<GuihairukuView> selectListView(Pagination page,@Param("ew") Wrapper<GuihairukuEntity> wrapper);
	
	GuihairukuView selectView(@Param("ew") Wrapper<GuihairukuEntity> wrapper);
	

}
