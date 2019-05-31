package com.hsd.service.impl;

import com.hsd.mapper.RMemberMapper;
import com.hsd.model.RMember;
import com.hsd.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private RMemberMapper rMemberMapper;


    public List<RMember> GetALLList(){
        return rMemberMapper.GetALLList();
    }
    public int ChangeMember(RMember rMember){
        return rMemberMapper.updateByPrimaryKeySelective(rMember);
    }
}
