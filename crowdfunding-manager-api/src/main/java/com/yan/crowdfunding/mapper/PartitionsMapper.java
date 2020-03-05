package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.Partitions;
import com.yan.crowdfunding.entity.PartitionsExample;
import com.yan.crowdfunding.entity.PartitionsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartitionsMapper {
    int countByExample(PartitionsExample example);

    int deleteByExample(PartitionsExample example);

    int insert(PartitionsWithBLOBs record);

    int insertSelective(PartitionsWithBLOBs record);

    List<PartitionsWithBLOBs> selectByExampleWithBLOBs(PartitionsExample example);

    List<Partitions> selectByExample(PartitionsExample example);

    int updateByExampleSelective(@Param("record") PartitionsWithBLOBs record, @Param("example") PartitionsExample example);

    int updateByExampleWithBLOBs(@Param("record") PartitionsWithBLOBs record, @Param("example") PartitionsExample example);

    int updateByExample(@Param("record") Partitions record, @Param("example") PartitionsExample example);
}