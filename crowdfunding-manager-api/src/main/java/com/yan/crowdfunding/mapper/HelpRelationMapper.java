package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.HelpRelation;
import com.yan.crowdfunding.entity.HelpRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpRelationMapper {
    int countByExample(HelpRelationExample example);

    int deleteByExample(HelpRelationExample example);

    int insert(HelpRelation record);

    int insertSelective(HelpRelation record);

    List<HelpRelation> selectByExample(HelpRelationExample example);

    int updateByExampleSelective(@Param("record") HelpRelation record, @Param("example") HelpRelationExample example);

    int updateByExample(@Param("record") HelpRelation record, @Param("example") HelpRelationExample example);
}