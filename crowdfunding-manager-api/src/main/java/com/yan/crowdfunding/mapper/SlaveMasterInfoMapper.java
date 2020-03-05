package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.SlaveMasterInfo;
import com.yan.crowdfunding.entity.SlaveMasterInfoExample;
import com.yan.crowdfunding.entity.SlaveMasterInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SlaveMasterInfoMapper {
    int countByExample(SlaveMasterInfoExample example);

    int deleteByExample(SlaveMasterInfoExample example);

    int insert(SlaveMasterInfoWithBLOBs record);

    int insertSelective(SlaveMasterInfoWithBLOBs record);

    List<SlaveMasterInfoWithBLOBs> selectByExampleWithBLOBs(SlaveMasterInfoExample example);

    List<SlaveMasterInfo> selectByExample(SlaveMasterInfoExample example);

    int updateByExampleSelective(@Param("record") SlaveMasterInfoWithBLOBs record, @Param("example") SlaveMasterInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") SlaveMasterInfoWithBLOBs record, @Param("example") SlaveMasterInfoExample example);

    int updateByExample(@Param("record") SlaveMasterInfo record, @Param("example") SlaveMasterInfoExample example);
}