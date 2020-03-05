package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.SlaveWorkerInfo;
import com.yan.crowdfunding.entity.SlaveWorkerInfoExample;
import com.yan.crowdfunding.entity.SlaveWorkerInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SlaveWorkerInfoMapper {
    int countByExample(SlaveWorkerInfoExample example);

    int deleteByExample(SlaveWorkerInfoExample example);

    int insert(SlaveWorkerInfoWithBLOBs record);

    int insertSelective(SlaveWorkerInfoWithBLOBs record);

    List<SlaveWorkerInfoWithBLOBs> selectByExampleWithBLOBs(SlaveWorkerInfoExample example);

    List<SlaveWorkerInfo> selectByExample(SlaveWorkerInfoExample example);

    int updateByExampleSelective(@Param("record") SlaveWorkerInfoWithBLOBs record, @Param("example") SlaveWorkerInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") SlaveWorkerInfoWithBLOBs record, @Param("example") SlaveWorkerInfoExample example);

    int updateByExample(@Param("record") SlaveWorkerInfo record, @Param("example") SlaveWorkerInfoExample example);
}