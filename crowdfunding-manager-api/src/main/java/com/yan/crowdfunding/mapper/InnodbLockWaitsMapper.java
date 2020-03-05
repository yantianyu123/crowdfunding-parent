package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbLockWaits;
import com.yan.crowdfunding.entity.InnodbLockWaitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbLockWaitsMapper {
    int countByExample(InnodbLockWaitsExample example);

    int deleteByExample(InnodbLockWaitsExample example);

    int insert(InnodbLockWaits record);

    int insertSelective(InnodbLockWaits record);

    List<InnodbLockWaits> selectByExample(InnodbLockWaitsExample example);

    int updateByExampleSelective(@Param("record") InnodbLockWaits record, @Param("example") InnodbLockWaitsExample example);

    int updateByExample(@Param("record") InnodbLockWaits record, @Param("example") InnodbLockWaitsExample example);
}