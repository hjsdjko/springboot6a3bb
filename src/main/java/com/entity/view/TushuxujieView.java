package com.entity.view;

import com.entity.TushuxujieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 图书续借
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-29 09:14:27
 */
@TableName("tushuxujie")
public class TushuxujieView  extends TushuxujieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TushuxujieView(){
	}
 
 	public TushuxujieView(TushuxujieEntity tushuxujieEntity){
 	try {
			BeanUtils.copyProperties(this, tushuxujieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
