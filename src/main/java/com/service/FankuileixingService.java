package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FankuileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FankuileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FankuileixingView;


/**
 * 反馈类型
 *
 * @author 
 * @email 
 * @date 2023-01-29 09:14:27
 */
public interface FankuileixingService extends IService<FankuileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FankuileixingVO> selectListVO(Wrapper<FankuileixingEntity> wrapper);
   	
   	FankuileixingVO selectVO(@Param("ew") Wrapper<FankuileixingEntity> wrapper);
   	
   	List<FankuileixingView> selectListView(Wrapper<FankuileixingEntity> wrapper);
   	
   	FankuileixingView selectView(@Param("ew") Wrapper<FankuileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FankuileixingEntity> wrapper);
   	

}

