package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.ColumnsPriv;
import com.yan.crowdfunding.entity.ColumnsPrivExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnsPrivMapper {
    int countByExample(ColumnsPrivExample example);

    int deleteByExample(ColumnsPrivExample example);

    int insert(ColumnsPriv record);

    int insertSelective(ColumnsPriv record);

    List<ColumnsPriv> selectByExample(ColumnsPrivExample example);

    int updateByExampleSelective(@Param("record") ColumnsPriv record, @Param("example") ColumnsPrivExample example);

    int updateByExample(@Param("record") ColumnsPriv record, @Param("example") ColumnsPrivExample example);
}