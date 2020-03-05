package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.Mytable01;
import com.yan.crowdfunding.entity.Mytable01Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Mytable01Mapper {
    int countByExample(Mytable01Example example);

    int deleteByExample(Mytable01Example example);

    int insert(Mytable01 record);

    int insertSelective(Mytable01 record);

    List<Mytable01> selectByExample(Mytable01Example example);

    int updateByExampleSelective(@Param("record") Mytable01 record, @Param("example") Mytable01Example example);

    int updateByExample(@Param("record") Mytable01 record, @Param("example") Mytable01Example example);
}