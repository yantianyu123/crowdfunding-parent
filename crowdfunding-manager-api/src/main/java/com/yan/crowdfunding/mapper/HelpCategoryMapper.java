package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.HelpCategory;
import com.yan.crowdfunding.entity.HelpCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpCategoryMapper {
    int countByExample(HelpCategoryExample example);

    int deleteByExample(HelpCategoryExample example);

    int insert(HelpCategory record);

    int insertSelective(HelpCategory record);

    List<HelpCategory> selectByExampleWithBLOBs(HelpCategoryExample example);

    List<HelpCategory> selectByExample(HelpCategoryExample example);

    int updateByExampleSelective(@Param("record") HelpCategory record, @Param("example") HelpCategoryExample example);

    int updateByExampleWithBLOBs(@Param("record") HelpCategory record, @Param("example") HelpCategoryExample example);

    int updateByExample(@Param("record") HelpCategory record, @Param("example") HelpCategoryExample example);
}