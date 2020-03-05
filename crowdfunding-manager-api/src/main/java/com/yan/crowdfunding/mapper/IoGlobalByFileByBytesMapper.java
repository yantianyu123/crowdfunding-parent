package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.IoGlobalByFileByBytes;
import com.yan.crowdfunding.entity.IoGlobalByFileByBytesExample;
import com.yan.crowdfunding.entity.IoGlobalByFileByBytesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IoGlobalByFileByBytesMapper {
    int countByExample(IoGlobalByFileByBytesExample example);

    int deleteByExample(IoGlobalByFileByBytesExample example);

    int insert(IoGlobalByFileByBytesWithBLOBs record);

    int insertSelective(IoGlobalByFileByBytesWithBLOBs record);

    List<IoGlobalByFileByBytesWithBLOBs> selectByExampleWithBLOBs(IoGlobalByFileByBytesExample example);

    List<IoGlobalByFileByBytes> selectByExample(IoGlobalByFileByBytesExample example);

    int updateByExampleSelective(@Param("record") IoGlobalByFileByBytesWithBLOBs record, @Param("example") IoGlobalByFileByBytesExample example);

    int updateByExampleWithBLOBs(@Param("record") IoGlobalByFileByBytesWithBLOBs record, @Param("example") IoGlobalByFileByBytesExample example);

    int updateByExample(@Param("record") IoGlobalByFileByBytes record, @Param("example") IoGlobalByFileByBytesExample example);
}