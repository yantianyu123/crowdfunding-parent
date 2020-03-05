package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.Collations;
import com.yan.crowdfunding.entity.CollationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollationsMapper {
    int countByExample(CollationsExample example);

    int deleteByExample(CollationsExample example);

    int insert(Collations record);

    int insertSelective(Collations record);

    List<Collations> selectByExample(CollationsExample example);

    int updateByExampleSelective(@Param("record") Collations record, @Param("example") CollationsExample example);

    int updateByExample(@Param("record") Collations record, @Param("example") CollationsExample example);
}