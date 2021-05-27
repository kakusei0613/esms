package com.example.esms.mapper;

import com.example.esms.domain.Admin;
import org.apache.ibatis.annotations.Param;

public interface IAdminMapper {
    public Admin selectByUserName(@Param("username") String username, @Param("password") String password);
}
