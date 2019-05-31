package com.hsd.service.impl;

import com.hsd.mapper.RFenceMapper;
import com.hsd.model.RFence;
import com.hsd.service.FenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FenceServiceImpl implements FenceService {
    @Autowired
    private RFenceMapper rFenceMapper;

    public int InsertFence(RFence rFence){
        return rFenceMapper.insert(rFence);
    }
    public int SubFence(int primaryKey){
        return rFenceMapper.deleteByPrimaryKey(primaryKey);
    }
    public int ChangeFence(RFence rFence) {
        return rFenceMapper.updateByPrimaryKeySelective(rFence);
    }
    public RFence SelectFence(int primaryKey){
        return rFenceMapper.selectByPrimaryKey(primaryKey);
    }
}



