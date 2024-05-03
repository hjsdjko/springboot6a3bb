package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuqiufankuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuqiufankuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuqiufankuiView;


/**
 * 需求反馈
 *
 * @author 
 * @email 
 * @date 2023-01-29 09:14:27
 */
public interface XuqiufankuiService extends IService<XuqiufankuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuqiufankuiVO> selectListVO(Wrapper<XuqiufankuiEntity> wrapper);
   	
   	XuqiufankuiVO selectVO(@Param("ew") Wrapper<XuqiufankuiEntity> wrapper);
   	
   	List<XuqiufankuiView> selectListView(Wrapper<XuqiufankuiEntity> wrapper);
   	
   	XuqiufankuiView selectView(@Param("ew") Wrapper<XuqiufankuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuqiufankuiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<XuqiufankuiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<XuqiufankuiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<XuqiufankuiEntity> wrapper);



}

