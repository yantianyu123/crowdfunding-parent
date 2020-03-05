package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.MemoryByThreadByCurrentBytes;
import com.yan.crowdfunding.entity.MemoryByThreadByCurrentBytesExample;
import com.yan.crowdfunding.entity.MemoryByThreadByCurrentBytesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemoryByThreadByCurrentBytesMapper {
    int countByExample(MemoryByThreadByCurrentBytesExample example);

    int deleteByExample(MemoryByThreadByCurrentBytesExample example);

    int insert(MemoryByThreadByCurrentBytesWithBLOBs record);

    int insertSelective(MemoryByThreadByCurrentBytesWithBLOBs record);

    List<MemoryByThreadByCurrentBytesWithBLOBs> selectByExampleWithBLOBs(MemoryByThreadByCurrentBytesExample example);

    List<MemoryByThreadByCurrentBytes> selectByExample(MemoryByThreadByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") MemoryByThreadByCurrentBytesWithBLOBs record, @Param("example") MemoryByThreadByCurrentBytesExample example);

    int updateByExampleWithBLOBs(@Param("record") MemoryByThreadByCurrentBytesWithBLOBs record, @Param("example") MemoryByThreadByCurrentBytesExample example);

    int updateByExample(@Param("record") MemoryByThreadByCurrentBytes record, @Param("example") MemoryByThreadByCurrentBytesExample example);
}