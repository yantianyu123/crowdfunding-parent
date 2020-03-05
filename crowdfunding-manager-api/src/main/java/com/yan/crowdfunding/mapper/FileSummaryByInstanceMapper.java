package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.FileSummaryByInstance;
import com.yan.crowdfunding.entity.FileSummaryByInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileSummaryByInstanceMapper {
    int countByExample(FileSummaryByInstanceExample example);

    int deleteByExample(FileSummaryByInstanceExample example);

    int insert(FileSummaryByInstance record);

    int insertSelective(FileSummaryByInstance record);

    List<FileSummaryByInstance> selectByExample(FileSummaryByInstanceExample example);

    int updateByExampleSelective(@Param("record") FileSummaryByInstance record, @Param("example") FileSummaryByInstanceExample example);

    int updateByExample(@Param("record") FileSummaryByInstance record, @Param("example") FileSummaryByInstanceExample example);
}