package com.hsd.service.impl;

import com.hsd.mapper.RDeviceMapper;
import com.hsd.model.RDevice;
import com.hsd.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    private RDeviceMapper deviceMapper;
    public List<RDevice> GetDeviceList() {
        // TODO 自动生成的方法存根
        return deviceMapper.GetDeviceList();
    }

    public List<RDevice>MultiTableq(){
        return deviceMapper.MultiTableq();
    }
    public List<RDevice>MultiTableqBymemberName(String membername){
        return  deviceMapper.MultiTableqBymemberName(membername);
    }
}


