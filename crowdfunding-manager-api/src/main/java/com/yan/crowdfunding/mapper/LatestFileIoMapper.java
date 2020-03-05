package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.LatestFileIo;
import com.yan.crowdfunding.entity.LatestFileIoExample;
import com.yan.crowdfunding.entity.LatestFileIoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LatestFileIoMapper {
    int countByExample(LatestFileIoExample example);

    int deleteByExample(LatestFileIoExample example);

    int insert(LatestFileIoWithBLOBs record);

    int insertSelective(LatestFileIoWithBLOBs record);

    List<LatestFileIoWithBLOBs> selectByExampleWithBLOBs(LatestFileIoExample example);

    List<LatestFileIo> selectByExample(LatestFileIoExample example);

    int updateByExampleSelective(@Param("record") LatestFileIoWithBLOBs record, @Param("example") LatestFileIoExample example);

    int updateByExampleWithBLOBs(@Param("record") LatestFileIoWithBLOBs record, @Param("example") LatestFileIoExample example);

    int updateByExample(@Param("record") LatestFileIo record, @Param("example") LatestFileIoExample example);
}