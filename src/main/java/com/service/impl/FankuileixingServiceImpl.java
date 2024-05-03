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


import com.dao.FankuileixingDao;
import com.entity.FankuileixingEntity;
import com.service.FankuileixingService;
import com.entity.vo.FankuileixingVO;
import com.entity.view.FankuileixingView;

@Service("fankuileixingService")
public class FankuileixingServiceImpl extends ServiceImpl<FankuileixingDao, FankuileixingEntity> implements FankuileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FankuileixingEntity> page = this.selectPage(
                new Query<FankuileixingEntity>(params).getPage(),
                new EntityWrapper<FankuileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FankuileixingEntity> wrapper) {
		  Page<FankuileixingView> page =new Query<FankuileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FankuileixingVO> selectListVO(Wrapper<FankuileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FankuileixingVO selectVO(Wrapper<FankuileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FankuileixingView> selectListView(Wrapper<FankuileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FankuileixingView selectView(Wrapper<FankuileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
