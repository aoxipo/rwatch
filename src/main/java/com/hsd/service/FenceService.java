package com.hsd.service;

import com.hsd.model.RFence;

public interface FenceService {
    int InsertFence(RFence rFence);
    int SubFence(int primaryKey);
    int ChangeFence(RFence record);
    RFence SelectFence(int primaryKey);
}
