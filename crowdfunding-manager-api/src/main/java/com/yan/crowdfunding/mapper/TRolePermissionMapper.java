package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TRolePermission;
import com.yan.crowdfunding.entity.TRolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRolePermissionMapper {
    int countByExample(TRolePermissionExample example);

    int deleteByExample(TRolePermissionExample example);

    int insert(TRolePermission record);

    int insertSelective(TRolePermission record);

    List<TRolePermission> selectByExample(TRolePermissionExample example);

    int updateByExampleSelective(@Param("record") TRolePermission record, @Param("example") TRolePermissionExample example);

    int updateByExample(@Param("record") TRolePermission record, @Param("example") TRolePermissionExample example);
}