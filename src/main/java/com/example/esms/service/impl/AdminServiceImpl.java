package com.example.esms.service.impl;

import com.example.esms.domain.Admin;
import com.example.esms.mapper.IAdminMapper;
import com.example.esms.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements IAdminService {
    @Autowired
    IAdminMapper adminMapper;
    @Override
    public Admin selectUser(String username, String password) {
        return adminMapper.selectByUserName(username, password);
    }
}
