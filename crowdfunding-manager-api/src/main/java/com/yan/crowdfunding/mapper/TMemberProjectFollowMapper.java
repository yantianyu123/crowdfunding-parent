package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TMemberProjectFollow;
import com.yan.crowdfunding.entity.TMemberProjectFollowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMemberProjectFollowMapper {
    int countByExample(TMemberProjectFollowExample example);

    int deleteByExample(TMemberProjectFollowExample example);

    int insert(TMemberProjectFollow record);

    int insertSelective(TMemberProjectFollow record);

    List<TMemberProjectFollow> selectByExample(TMemberProjectFollowExample example);

    int updateByExampleSelective(@Param("record") TMemberProjectFollow record, @Param("example") TMemberProjectFollowExample example);

    int updateByExample(@Param("record") TMemberProjectFollow record, @Param("example") TMemberProjectFollowExample example);
}