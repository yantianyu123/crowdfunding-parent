package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TAdminRole;
import com.yan.crowdfunding.entity.TAdminRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAdminRoleMapper {
    int countByExample(TAdminRoleExample example);

    int deleteByExample(TAdminRoleExample example);

    int insert(TAdminRole record);

    int insertSelective(TAdminRole record);

    List<TAdminRole> selectByExample(TAdminRoleExample example);

    int updateByExampleSelective(@Param("record") TAdminRole record, @Param("example") TAdminRoleExample example);

    int updateByExample(@Param("record") TAdminRole record, @Param("example") TAdminRoleExample example);
}