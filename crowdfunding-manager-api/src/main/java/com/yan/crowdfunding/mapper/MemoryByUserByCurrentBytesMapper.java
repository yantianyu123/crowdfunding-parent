package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.MemoryByUserByCurrentBytes;
import com.yan.crowdfunding.entity.MemoryByUserByCurrentBytesExample;
import com.yan.crowdfunding.entity.MemoryByUserByCurrentBytesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemoryByUserByCurrentBytesMapper {
    int countByExample(MemoryByUserByCurrentBytesExample example);

    int deleteByExample(MemoryByUserByCurrentBytesExample example);

    int insert(MemoryByUserByCurrentBytesWithBLOBs record);

    int insertSelective(MemoryByUserByCurrentBytesWithBLOBs record);

    List<MemoryByUserByCurrentBytesWithBLOBs> selectByExampleWithBLOBs(MemoryByUserByCurrentBytesExample example);

    List<MemoryByUserByCurrentBytes> selectByExample(MemoryByUserByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") MemoryByUserByCurrentBytesWithBLOBs record, @Param("example") MemoryByUserByCurrentBytesExample example);

    int updateByExampleWithBLOBs(@Param("record") MemoryByUserByCurrentBytesWithBLOBs record, @Param("example") MemoryByUserByCurrentBytesExample example);

    int updateByExample(@Param("record") MemoryByUserByCurrentBytes record, @Param("example") MemoryByUserByCurrentBytesExample example);
}