package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.FileSummaryByEventName;
import com.yan.crowdfunding.entity.FileSummaryByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileSummaryByEventNameMapper {
    int countByExample(FileSummaryByEventNameExample example);

    int deleteByExample(FileSummaryByEventNameExample example);

    int insert(FileSummaryByEventName record);

    int insertSelective(FileSummaryByEventName record);

    List<FileSummaryByEventName> selectByExample(FileSummaryByEventNameExample example);

    int updateByExampleSelective(@Param("record") FileSummaryByEventName record, @Param("example") FileSummaryByEventNameExample example);

    int updateByExample(@Param("record") FileSummaryByEventName record, @Param("example") FileSummaryByEventNameExample example);
}