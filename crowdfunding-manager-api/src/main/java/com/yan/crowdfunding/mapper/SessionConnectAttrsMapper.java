package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.SessionConnectAttrs;
import com.yan.crowdfunding.entity.SessionConnectAttrsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionConnectAttrsMapper {
    int countByExample(SessionConnectAttrsExample example);

    int deleteByExample(SessionConnectAttrsExample example);

    int insert(SessionConnectAttrs record);

    int insertSelective(SessionConnectAttrs record);

    List<SessionConnectAttrs> selectByExample(SessionConnectAttrsExample example);

    int updateByExampleSelective(@Param("record") SessionConnectAttrs record, @Param("example") SessionConnectAttrsExample example);

    int updateByExample(@Param("record") SessionConnectAttrs record, @Param("example") SessionConnectAttrsExample example);
}