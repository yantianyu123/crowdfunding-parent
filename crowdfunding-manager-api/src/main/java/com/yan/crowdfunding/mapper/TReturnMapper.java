package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TReturn;
import com.yan.crowdfunding.entity.TReturnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TReturnMapper {
    int countByExample(TReturnExample example);

    int deleteByExample(TReturnExample example);

    int insert(TReturn record);

    int insertSelective(TReturn record);

    List<TReturn> selectByExample(TReturnExample example);

    int updateByExampleSelective(@Param("record") TReturn record, @Param("example") TReturnExample example);

    int updateByExample(@Param("record") TReturn record, @Param("example") TReturnExample example);
}