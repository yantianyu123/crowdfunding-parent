package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.StatementsWithSorting;
import com.yan.crowdfunding.entity.StatementsWithSortingExample;
import com.yan.crowdfunding.entity.StatementsWithSortingWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatementsWithSortingMapper {
    int countByExample(StatementsWithSortingExample example);

    int deleteByExample(StatementsWithSortingExample example);

    int insert(StatementsWithSortingWithBLOBs record);

    int insertSelective(StatementsWithSortingWithBLOBs record);

    List<StatementsWithSortingWithBLOBs> selectByExampleWithBLOBs(StatementsWithSortingExample example);

    List<StatementsWithSorting> selectByExample(StatementsWithSortingExample example);

    int updateByExampleSelective(@Param("record") StatementsWithSortingWithBLOBs record, @Param("example") StatementsWithSortingExample example);

    int updateByExampleWithBLOBs(@Param("record") StatementsWithSortingWithBLOBs record, @Param("example") StatementsWithSortingExample example);

    int updateByExample(@Param("record") StatementsWithSorting record, @Param("example") StatementsWithSortingExample example);
}