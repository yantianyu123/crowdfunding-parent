package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.StatusByThread;
import com.yan.crowdfunding.entity.StatusByThreadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatusByThreadMapper {
    int countByExample(StatusByThreadExample example);

    int deleteByExample(StatusByThreadExample example);

    int insert(StatusByThread record);

    int insertSelective(StatusByThread record);

    List<StatusByThread> selectByExample(StatusByThreadExample example);

    int updateByExampleSelective(@Param("record") StatusByThread record, @Param("example") StatusByThreadExample example);

    int updateByExample(@Param("record") StatusByThread record, @Param("example") StatusByThreadExample example);
}