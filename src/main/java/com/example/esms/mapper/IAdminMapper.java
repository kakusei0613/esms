package com.example.esms.mapper;

import com.example.esms.domain.Admin;
import com.example.esms.domain.UserActionRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IAdminMapper {
    public Admin selectByUserName(@Param("username") String username, @Param("password") String password);
    public List<Admin> selectAll();
    public void insert(Admin record);
    public void deleteById(Integer id);
    public void recorder(@Param("username") String username, @Param("action") String action, @Param("ipaddress") String ipaddress);
    public List<UserActionRecord> selectAction(Integer id);
}
