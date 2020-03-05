package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.Func;
import com.yan.crowdfunding.entity.FuncExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FuncMapper {
    int countByExample(FuncExample example);

    int deleteByExample(FuncExample example);

    int insert(Func record);

    int insertSelective(Func record);

    List<Func> selectByExample(FuncExample example);

    int updateByExampleSelective(@Param("record") Func record, @Param("example") FuncExample example);

    int updateByExample(@Param("record") Func record, @Param("example") FuncExample example);
}