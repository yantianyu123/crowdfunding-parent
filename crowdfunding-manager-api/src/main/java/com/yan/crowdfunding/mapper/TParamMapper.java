package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TParam;
import com.yan.crowdfunding.entity.TParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TParamMapper {
    int countByExample(TParamExample example);

    int deleteByExample(TParamExample example);

    int insert(TParam record);

    int insertSelective(TParam record);

    List<TParam> selectByExample(TParamExample example);

    int updateByExampleSelective(@Param("record") TParam record, @Param("example") TParamExample example);

    int updateByExample(@Param("record") TParam record, @Param("example") TParamExample example);
}