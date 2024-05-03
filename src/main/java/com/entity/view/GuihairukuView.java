package com.entity.view;

import com.entity.GuihairukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 归还入库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-29 09:14:27
 */
@TableName("guihairuku")
public class GuihairukuView  extends GuihairukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuihairukuView(){
	}
 
 	public GuihairukuView(GuihairukuEntity guihairukuEntity){
 	try {
			BeanUtils.copyProperties(this, guihairukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
