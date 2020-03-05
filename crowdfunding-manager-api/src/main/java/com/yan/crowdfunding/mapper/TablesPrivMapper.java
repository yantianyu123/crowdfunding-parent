package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TablesPriv;
import com.yan.crowdfunding.entity.TablesPrivExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TablesPrivMapper {
    int countByExample(TablesPrivExample example);

    int deleteByExample(TablesPrivExample example);

    int insert(TablesPriv record);

    int insertSelective(TablesPriv record);

    List<TablesPriv> selectByExample(TablesPrivExample example);

    int updateByExampleSelective(@Param("record") TablesPriv record, @Param("example") TablesPrivExample example);

    int updateByExample(@Param("record") TablesPriv record, @Param("example") TablesPrivExample example);
}