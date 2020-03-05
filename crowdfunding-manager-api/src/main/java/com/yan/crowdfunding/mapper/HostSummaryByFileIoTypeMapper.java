package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.HostSummaryByFileIoType;
import com.yan.crowdfunding.entity.HostSummaryByFileIoTypeExample;
import com.yan.crowdfunding.entity.HostSummaryByFileIoTypeWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostSummaryByFileIoTypeMapper {
    int countByExample(HostSummaryByFileIoTypeExample example);

    int deleteByExample(HostSummaryByFileIoTypeExample example);

    int insert(HostSummaryByFileIoTypeWithBLOBs record);

    int insertSelective(HostSummaryByFileIoTypeWithBLOBs record);

    List<HostSummaryByFileIoTypeWithBLOBs> selectByExampleWithBLOBs(HostSummaryByFileIoTypeExample example);

    List<HostSummaryByFileIoType> selectByExample(HostSummaryByFileIoTypeExample example);

    int updateByExampleSelective(@Param("record") HostSummaryByFileIoTypeWithBLOBs record, @Param("example") HostSummaryByFileIoTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") HostSummaryByFileIoTypeWithBLOBs record, @Param("example") HostSummaryByFileIoTypeExample example);

    int updateByExample(@Param("record") HostSummaryByFileIoType record, @Param("example") HostSummaryByFileIoTypeExample example);
}