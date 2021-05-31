package com.example.esms.service;

import com.example.esms.domain.Admin;

import java.util.List;

public interface IAdminService {
    public Admin selectUser(String username, String password);
    public List<Admin> selectAll();
    public void insert(Admin record);
    public void deleteById(Integer id);
    public void logout();
    public Boolean login(String username, String password);
}
