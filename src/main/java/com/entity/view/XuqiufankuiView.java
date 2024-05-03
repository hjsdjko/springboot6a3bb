package com.entity.view;

import com.entity.XuqiufankuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 需求反馈
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-29 09:14:27
 */
@TableName("xuqiufankui")
public class XuqiufankuiView  extends XuqiufankuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuqiufankuiView(){
	}
 
 	public XuqiufankuiView(XuqiufankuiEntity xuqiufankuiEntity){
 	try {
			BeanUtils.copyProperties(this, xuqiufankuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
