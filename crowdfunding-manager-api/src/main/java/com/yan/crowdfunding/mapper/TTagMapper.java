package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TTag;
import com.yan.crowdfunding.entity.TTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTagMapper {
    int countByExample(TTagExample example);

    int deleteByExample(TTagExample example);

    int insert(TTag record);

    int insertSelective(TTag record);

    List<TTag> selectByExample(TTagExample example);

    int updateByExampleSelective(@Param("record") TTag record, @Param("example") TTagExample example);

    int updateByExample(@Param("record") TTag record, @Param("example") TTagExample example);
}