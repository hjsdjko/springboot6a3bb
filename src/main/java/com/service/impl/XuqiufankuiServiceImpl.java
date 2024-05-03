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


import com.dao.XuqiufankuiDao;
import com.entity.XuqiufankuiEntity;
import com.service.XuqiufankuiService;
import com.entity.vo.XuqiufankuiVO;
import com.entity.view.XuqiufankuiView;

@Service("xuqiufankuiService")
public class XuqiufankuiServiceImpl extends ServiceImpl<XuqiufankuiDao, XuqiufankuiEntity> implements XuqiufankuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuqiufankuiEntity> page = this.selectPage(
                new Query<XuqiufankuiEntity>(params).getPage(),
                new EntityWrapper<XuqiufankuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuqiufankuiEntity> wrapper) {
		  Page<XuqiufankuiView> page =new Query<XuqiufankuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuqiufankuiVO> selectListVO(Wrapper<XuqiufankuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuqiufankuiVO selectVO(Wrapper<XuqiufankuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuqiufankuiView> selectListView(Wrapper<XuqiufankuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuqiufankuiView selectView(Wrapper<XuqiufankuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<XuqiufankuiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<XuqiufankuiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<XuqiufankuiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
