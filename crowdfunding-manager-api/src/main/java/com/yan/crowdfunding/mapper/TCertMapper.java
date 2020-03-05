package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TCert;
import com.yan.crowdfunding.entity.TCertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCertMapper {
    int countByExample(TCertExample example);

    int deleteByExample(TCertExample example);

    int insert(TCert record);

    int insertSelective(TCert record);

    List<TCert> selectByExample(TCertExample example);

    int updateByExampleSelective(@Param("record") TCert record, @Param("example") TCertExample example);

    int updateByExample(@Param("record") TCert record, @Param("example") TCertExample example);
}