package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GuihairukuDao;
import com.entity.GuihairukuEntity;
import com.service.GuihairukuService;
import com.entity.vo.GuihairukuVO;
import com.entity.view.GuihairukuView;

@Service("guihairukuService")
public class GuihairukuServiceImpl extends ServiceImpl<GuihairukuDao, GuihairukuEntity> implements GuihairukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuihairukuEntity> page = this.selectPage(
                new Query<GuihairukuEntity>(params).getPage(),
                new EntityWrapper<GuihairukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuihairukuEntity> wrapper) {
		  Page<GuihairukuView> page =new Query<GuihairukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuihairukuVO> selectListVO(Wrapper<GuihairukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuihairukuVO selectVO(Wrapper<GuihairukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuihairukuView> selectListView(Wrapper<GuihairukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuihairukuView selectView(Wrapper<GuihairukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
