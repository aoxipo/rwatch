package com.hsd.service;

import com.hsd.model.RDevice;

import java.util.List;


public interface DeviceService {

    List<RDevice> GetDeviceList();
    List<RDevice> MultiTableq();
    List<RDevice> MultiTableqBymemberName(String membername);
}
