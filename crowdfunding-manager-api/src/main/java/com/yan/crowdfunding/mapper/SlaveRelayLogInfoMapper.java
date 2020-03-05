package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.SlaveRelayLogInfo;
import com.yan.crowdfunding.entity.SlaveRelayLogInfoExample;
import com.yan.crowdfunding.entity.SlaveRelayLogInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SlaveRelayLogInfoMapper {
    int countByExample(SlaveRelayLogInfoExample example);

    int deleteByExample(SlaveRelayLogInfoExample example);

    int insert(SlaveRelayLogInfoWithBLOBs record);

    int insertSelective(SlaveRelayLogInfoWithBLOBs record);

    List<SlaveRelayLogInfoWithBLOBs> selectByExampleWithBLOBs(SlaveRelayLogInfoExample example);

    List<SlaveRelayLogInfo> selectByExample(SlaveRelayLogInfoExample example);

    int updateByExampleSelective(@Param("record") SlaveRelayLogInfoWithBLOBs record, @Param("example") SlaveRelayLogInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") SlaveRelayLogInfoWithBLOBs record, @Param("example") SlaveRelayLogInfoExample example);

    int updateByExample(@Param("record") SlaveRelayLogInfo record, @Param("example") SlaveRelayLogInfoExample example);
}