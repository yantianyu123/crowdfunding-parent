package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TProjectTag;
import com.yan.crowdfunding.entity.TProjectTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProjectTagMapper {
    int countByExample(TProjectTagExample example);

    int deleteByExample(TProjectTagExample example);

    int insert(TProjectTag record);

    int insertSelective(TProjectTag record);

    List<TProjectTag> selectByExample(TProjectTagExample example);

    int updateByExampleSelective(@Param("record") TProjectTag record, @Param("example") TProjectTagExample example);

    int updateByExample(@Param("record") TProjectTag record, @Param("example") TProjectTagExample example);
}