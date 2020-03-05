package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TPermissionResource;
import com.yan.crowdfunding.entity.TPermissionResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPermissionResourceMapper {
    int countByExample(TPermissionResourceExample example);

    int deleteByExample(TPermissionResourceExample example);

    int insert(TPermissionResource record);

    int insertSelective(TPermissionResource record);

    List<TPermissionResource> selectByExample(TPermissionResourceExample example);

    int updateByExampleSelective(@Param("record") TPermissionResource record, @Param("example") TPermissionResourceExample example);

    int updateByExample(@Param("record") TPermissionResource record, @Param("example") TPermissionResourceExample example);
}