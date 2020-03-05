package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TPermissionMenu;
import com.yan.crowdfunding.entity.TPermissionMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPermissionMenuMapper {
    int countByExample(TPermissionMenuExample example);

    int deleteByExample(TPermissionMenuExample example);

    int insert(TPermissionMenu record);

    int insertSelective(TPermissionMenu record);

    List<TPermissionMenu> selectByExample(TPermissionMenuExample example);

    int updateByExampleSelective(@Param("record") TPermissionMenu record, @Param("example") TPermissionMenuExample example);

    int updateByExample(@Param("record") TPermissionMenu record, @Param("example") TPermissionMenuExample example);
}