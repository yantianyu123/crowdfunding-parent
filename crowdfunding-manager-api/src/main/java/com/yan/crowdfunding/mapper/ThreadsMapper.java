package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.Threads;
import com.yan.crowdfunding.entity.ThreadsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThreadsMapper {
    int countByExample(ThreadsExample example);

    int deleteByExample(ThreadsExample example);

    int insert(Threads record);

    int insertSelective(Threads record);

    List<Threads> selectByExampleWithBLOBs(ThreadsExample example);

    List<Threads> selectByExample(ThreadsExample example);

    int updateByExampleSelective(@Param("record") Threads record, @Param("example") ThreadsExample example);

    int updateByExampleWithBLOBs(@Param("record") Threads record, @Param("example") ThreadsExample example);

    int updateByExample(@Param("record") Threads record, @Param("example") ThreadsExample example);
}