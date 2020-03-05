package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.Db;
import com.yan.crowdfunding.entity.DbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbMapper {
    int countByExample(DbExample example);

    int deleteByExample(DbExample example);

    int insert(Db record);

    int insertSelective(Db record);

    List<Db> selectByExample(DbExample example);

    int updateByExampleSelective(@Param("record") Db record, @Param("example") DbExample example);

    int updateByExample(@Param("record") Db record, @Param("example") DbExample example);
}