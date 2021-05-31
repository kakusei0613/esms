package com.example.esms.service.impl;

import com.example.esms.domain.Admin;
import com.example.esms.mapper.IAdminMapper;
import com.example.esms.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.List;

@Service
public class AdminServiceImpl implements IAdminService {
    @Autowired
    IAdminMapper adminMapper;
    @Override
    public Admin selectUser(String username, String password) {
        return adminMapper.selectByUserName(username, password);
    }

    @Override
    public List<Admin> selectAll() {
        return adminMapper.selectAll();
    }

    @Override
    public void insert(Admin record) {
        adminMapper.insert(record);
    }

    @Override
    public void deleteById(Integer id) {
        if(id == 1) {
            return;
        }
        else{
            adminMapper.deleteById(id);
        }
    }

    @Override
    public void logout() {
        ServletRequestAttributes rqa = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        adminMapper.recorder();
        rqa.removeAttribute("USER_IN_SESSION",rqa.SCOPE_SESSION);
    }

    @Override
    public Boolean login(String username, String password) {
        Admin loginUser = adminMapper.selectByUserName(username, password);
        if(loginUser == null) {
            return Boolean.FALSE;
        }
        ServletRequestAttributes rqa = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        rqa.getRequest().getSession().setAttribute("USER_IN_SESSION", loginUser);
        adminMapper.recorder(username, "user:Login",rqa.getRequest().getRemoteAddr());
        return Boolean.TRUE;
    }
}
