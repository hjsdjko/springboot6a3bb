package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TushuxujieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TushuxujieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TushuxujieView;


/**
 * 图书续借
 *
 * @author 
 * @email 
 * @date 2023-01-29 09:14:27
 */
public interface TushuxujieService extends IService<TushuxujieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TushuxujieVO> selectListVO(Wrapper<TushuxujieEntity> wrapper);
   	
   	TushuxujieVO selectVO(@Param("ew") Wrapper<TushuxujieEntity> wrapper);
   	
   	List<TushuxujieView> selectListView(Wrapper<TushuxujieEntity> wrapper);
   	
   	TushuxujieView selectView(@Param("ew") Wrapper<TushuxujieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TushuxujieEntity> wrapper);
   	

}

