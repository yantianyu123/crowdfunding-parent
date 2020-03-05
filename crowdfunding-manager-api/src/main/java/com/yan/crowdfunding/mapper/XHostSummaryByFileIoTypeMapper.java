package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.XHostSummaryByFileIoType;
import com.yan.crowdfunding.entity.XHostSummaryByFileIoTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XHostSummaryByFileIoTypeMapper {
    int countByExample(XHostSummaryByFileIoTypeExample example);

    int deleteByExample(XHostSummaryByFileIoTypeExample example);

    int insert(XHostSummaryByFileIoType record);

    int insertSelective(XHostSummaryByFileIoType record);

    List<XHostSummaryByFileIoType> selectByExample(XHostSummaryByFileIoTypeExample example);

    int updateByExampleSelective(@Param("record") XHostSummaryByFileIoType record, @Param("example") XHostSummaryByFileIoTypeExample example);

    int updateByExample(@Param("record") XHostSummaryByFileIoType record, @Param("example") XHostSummaryByFileIoTypeExample example);
}