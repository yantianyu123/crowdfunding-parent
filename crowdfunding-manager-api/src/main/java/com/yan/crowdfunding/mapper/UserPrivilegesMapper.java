package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.UserPrivileges;
import com.yan.crowdfunding.entity.UserPrivilegesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPrivilegesMapper {
    int countByExample(UserPrivilegesExample example);

    int deleteByExample(UserPrivilegesExample example);

    int insert(UserPrivileges record);

    int insertSelective(UserPrivileges record);

    List<UserPrivileges> selectByExample(UserPrivilegesExample example);

    int updateByExampleSelective(@Param("record") UserPrivileges record, @Param("example") UserPrivilegesExample example);

    int updateByExample(@Param("record") UserPrivileges record, @Param("example") UserPrivilegesExample example);
}