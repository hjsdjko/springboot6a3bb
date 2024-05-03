package com.dao;

import com.entity.FankuileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FankuileixingVO;
import com.entity.view.FankuileixingView;


/**
 * 反馈类型
 * 
 * @author 
 * @email 
 * @date 2023-01-29 09:14:27
 */
public interface FankuileixingDao extends BaseMapper<FankuileixingEntity> {
	
	List<FankuileixingVO> selectListVO(@Param("ew") Wrapper<FankuileixingEntity> wrapper);
	
	FankuileixingVO selectVO(@Param("ew") Wrapper<FankuileixingEntity> wrapper);
	
	List<FankuileixingView> selectListView(@Param("ew") Wrapper<FankuileixingEntity> wrapper);

	List<FankuileixingView> selectListView(Pagination page,@Param("ew") Wrapper<FankuileixingEntity> wrapper);
	
	FankuileixingView selectView(@Param("ew") Wrapper<FankuileixingEntity> wrapper);
	

}
