package com.hsd.service;

import com.hsd.model.RMember;

import java.util.List;

public interface MemberService {
    List<RMember> GetALLList();
    int ChangeMember(RMember rMember);
}
