package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.MemoryByHostByCurrentBytes;
import com.yan.crowdfunding.entity.MemoryByHostByCurrentBytesExample;
import com.yan.crowdfunding.entity.MemoryByHostByCurrentBytesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemoryByHostByCurrentBytesMapper {
    int countByExample(MemoryByHostByCurrentBytesExample example);

    int deleteByExample(MemoryByHostByCurrentBytesExample example);

    int insert(MemoryByHostByCurrentBytesWithBLOBs record);

    int insertSelective(MemoryByHostByCurrentBytesWithBLOBs record);

    List<MemoryByHostByCurrentBytesWithBLOBs> selectByExampleWithBLOBs(MemoryByHostByCurrentBytesExample example);

    List<MemoryByHostByCurrentBytes> selectByExample(MemoryByHostByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") MemoryByHostByCurrentBytesWithBLOBs record, @Param("example") MemoryByHostByCurrentBytesExample example);

    int updateByExampleWithBLOBs(@Param("record") MemoryByHostByCurrentBytesWithBLOBs record, @Param("example") MemoryByHostByCurrentBytesExample example);

    int updateByExample(@Param("record") MemoryByHostByCurrentBytes record, @Param("example") MemoryByHostByCurrentBytesExample example);
}