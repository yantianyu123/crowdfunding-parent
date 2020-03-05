package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.XInnodbLockWaits;
import com.yan.crowdfunding.entity.XInnodbLockWaitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XInnodbLockWaitsMapper {
    int countByExample(XInnodbLockWaitsExample example);

    int deleteByExample(XInnodbLockWaitsExample example);

    int insert(XInnodbLockWaits record);

    int insertSelective(XInnodbLockWaits record);

    List<XInnodbLockWaits> selectByExample(XInnodbLockWaitsExample example);

    int updateByExampleSelective(@Param("record") XInnodbLockWaits record, @Param("example") XInnodbLockWaitsExample example);

    int updateByExample(@Param("record") XInnodbLockWaits record, @Param("example") XInnodbLockWaitsExample example);
}