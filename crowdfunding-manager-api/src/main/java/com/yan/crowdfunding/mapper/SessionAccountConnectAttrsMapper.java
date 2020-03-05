package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.SessionAccountConnectAttrs;
import com.yan.crowdfunding.entity.SessionAccountConnectAttrsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionAccountConnectAttrsMapper {
    int countByExample(SessionAccountConnectAttrsExample example);

    int deleteByExample(SessionAccountConnectAttrsExample example);

    int insert(SessionAccountConnectAttrs record);

    int insertSelective(SessionAccountConnectAttrs record);

    List<SessionAccountConnectAttrs> selectByExample(SessionAccountConnectAttrsExample example);

    int updateByExampleSelective(@Param("record") SessionAccountConnectAttrs record, @Param("example") SessionAccountConnectAttrsExample example);

    int updateByExample(@Param("record") SessionAccountConnectAttrs record, @Param("example") SessionAccountConnectAttrsExample example);
}