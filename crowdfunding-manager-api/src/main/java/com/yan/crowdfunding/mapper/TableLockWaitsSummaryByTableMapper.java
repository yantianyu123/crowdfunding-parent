package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TableLockWaitsSummaryByTable;
import com.yan.crowdfunding.entity.TableLockWaitsSummaryByTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableLockWaitsSummaryByTableMapper {
    int countByExample(TableLockWaitsSummaryByTableExample example);

    int deleteByExample(TableLockWaitsSummaryByTableExample example);

    int insert(TableLockWaitsSummaryByTable record);

    int insertSelective(TableLockWaitsSummaryByTable record);

    List<TableLockWaitsSummaryByTable> selectByExample(TableLockWaitsSummaryByTableExample example);

    int updateByExampleSelective(@Param("record") TableLockWaitsSummaryByTable record, @Param("example") TableLockWaitsSummaryByTableExample example);

    int updateByExample(@Param("record") TableLockWaitsSummaryByTable record, @Param("example") TableLockWaitsSummaryByTableExample example);
}