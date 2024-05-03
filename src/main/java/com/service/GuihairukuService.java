package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuihairukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuihairukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuihairukuView;


/**
 * 归还入库
 *
 * @author 
 * @email 
 * @date 2023-01-29 09:14:27
 */
public interface GuihairukuService extends IService<GuihairukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuihairukuVO> selectListVO(Wrapper<GuihairukuEntity> wrapper);
   	
   	GuihairukuVO selectVO(@Param("ew") Wrapper<GuihairukuEntity> wrapper);
   	
   	List<GuihairukuView> selectListView(Wrapper<GuihairukuEntity> wrapper);
   	
   	GuihairukuView selectView(@Param("ew") Wrapper<GuihairukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuihairukuEntity> wrapper);
   	

}

