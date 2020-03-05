package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.HelpKeyword;
import com.yan.crowdfunding.entity.HelpKeywordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpKeywordMapper {
    int countByExample(HelpKeywordExample example);

    int deleteByExample(HelpKeywordExample example);

    int insert(HelpKeyword record);

    int insertSelective(HelpKeyword record);

    List<HelpKeyword> selectByExample(HelpKeywordExample example);

    int updateByExampleSelective(@Param("record") HelpKeyword record, @Param("example") HelpKeywordExample example);

    int updateByExample(@Param("record") HelpKeyword record, @Param("example") HelpKeywordExample example);
}