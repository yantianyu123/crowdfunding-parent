package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.HelpTopic;
import com.yan.crowdfunding.entity.HelpTopicExample;
import com.yan.crowdfunding.entity.HelpTopicWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpTopicMapper {
    int countByExample(HelpTopicExample example);

    int deleteByExample(HelpTopicExample example);

    int insert(HelpTopicWithBLOBs record);

    int insertSelective(HelpTopicWithBLOBs record);

    List<HelpTopicWithBLOBs> selectByExampleWithBLOBs(HelpTopicExample example);

    List<HelpTopic> selectByExample(HelpTopicExample example);

    int updateByExampleSelective(@Param("record") HelpTopicWithBLOBs record, @Param("example") HelpTopicExample example);

    int updateByExampleWithBLOBs(@Param("record") HelpTopicWithBLOBs record, @Param("example") HelpTopicExample example);

    int updateByExample(@Param("record") HelpTopic record, @Param("example") HelpTopicExample example);
}