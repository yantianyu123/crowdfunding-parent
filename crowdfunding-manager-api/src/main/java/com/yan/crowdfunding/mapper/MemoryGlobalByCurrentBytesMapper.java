package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.MemoryGlobalByCurrentBytes;
import com.yan.crowdfunding.entity.MemoryGlobalByCurrentBytesExample;
import com.yan.crowdfunding.entity.MemoryGlobalByCurrentBytesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemoryGlobalByCurrentBytesMapper {
    int countByExample(MemoryGlobalByCurrentBytesExample example);

    int deleteByExample(MemoryGlobalByCurrentBytesExample example);

    int insert(MemoryGlobalByCurrentBytesWithBLOBs record);

    int insertSelective(MemoryGlobalByCurrentBytesWithBLOBs record);

    List<MemoryGlobalByCurrentBytesWithBLOBs> selectByExampleWithBLOBs(MemoryGlobalByCurrentBytesExample example);

    List<MemoryGlobalByCurrentBytes> selectByExample(MemoryGlobalByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") MemoryGlobalByCurrentBytesWithBLOBs record, @Param("example") MemoryGlobalByCurrentBytesExample example);

    int updateByExampleWithBLOBs(@Param("record") MemoryGlobalByCurrentBytesWithBLOBs record, @Param("example") MemoryGlobalByCurrentBytesExample example);

    int updateByExample(@Param("record") MemoryGlobalByCurrentBytes record, @Param("example") MemoryGlobalByCurrentBytesExample example);
}