package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.IoGlobalByWaitByBytes;
import com.yan.crowdfunding.entity.IoGlobalByWaitByBytesExample;
import com.yan.crowdfunding.entity.IoGlobalByWaitByBytesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IoGlobalByWaitByBytesMapper {
    int countByExample(IoGlobalByWaitByBytesExample example);

    int deleteByExample(IoGlobalByWaitByBytesExample example);

    int insert(IoGlobalByWaitByBytesWithBLOBs record);

    int insertSelective(IoGlobalByWaitByBytesWithBLOBs record);

    List<IoGlobalByWaitByBytesWithBLOBs> selectByExampleWithBLOBs(IoGlobalByWaitByBytesExample example);

    List<IoGlobalByWaitByBytes> selectByExample(IoGlobalByWaitByBytesExample example);

    int updateByExampleSelective(@Param("record") IoGlobalByWaitByBytesWithBLOBs record, @Param("example") IoGlobalByWaitByBytesExample example);

    int updateByExampleWithBLOBs(@Param("record") IoGlobalByWaitByBytesWithBLOBs record, @Param("example") IoGlobalByWaitByBytesExample example);

    int updateByExample(@Param("record") IoGlobalByWaitByBytes record, @Param("example") IoGlobalByWaitByBytesExample example);
}