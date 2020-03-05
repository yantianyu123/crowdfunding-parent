package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.Tables;
import com.yan.crowdfunding.entity.TablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TablesMapper {
    int countByExample(TablesExample example);

    int deleteByExample(TablesExample example);

    int insert(Tables record);

    int insertSelective(Tables record);

    List<Tables> selectByExample(TablesExample example);

    int updateByExampleSelective(@Param("record") Tables record, @Param("example") TablesExample example);

    int updateByExample(@Param("record") Tables record, @Param("example") TablesExample example);
}