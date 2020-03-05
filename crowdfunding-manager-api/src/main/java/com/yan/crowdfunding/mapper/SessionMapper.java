package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.Session;
import com.yan.crowdfunding.entity.SessionExample;
import com.yan.crowdfunding.entity.SessionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionMapper {
    int countByExample(SessionExample example);

    int deleteByExample(SessionExample example);

    int insert(SessionWithBLOBs record);

    int insertSelective(SessionWithBLOBs record);

    List<SessionWithBLOBs> selectByExampleWithBLOBs(SessionExample example);

    List<Session> selectByExample(SessionExample example);

    int updateByExampleSelective(@Param("record") SessionWithBLOBs record, @Param("example") SessionExample example);

    int updateByExampleWithBLOBs(@Param("record") SessionWithBLOBs record, @Param("example") SessionExample example);

    int updateByExample(@Param("record") Session record, @Param("example") SessionExample example);
}