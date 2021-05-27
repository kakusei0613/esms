package com.example.esms.service;

import com.example.esms.domain.Admin;

public interface IAdminService {
    public Admin selectUser(String username, String password);
}
