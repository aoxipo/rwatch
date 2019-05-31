package com.hsd.service.impl;

import com.hsd.mapper.RDeviceInforMapper;
import com.hsd.model.RDeviceInfor;
import com.hsd.service.DeviceInforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceInforServiceImpl implements DeviceInforService {

    @Autowired
    private RDeviceInforMapper rDeviceInforMapper;
    public List<RDeviceInfor> GetdeviceinforALLList(){
        // TODO 自动生成的方法存根
        return rDeviceInforMapper.GetdeviceinforALLList();
    }
}
