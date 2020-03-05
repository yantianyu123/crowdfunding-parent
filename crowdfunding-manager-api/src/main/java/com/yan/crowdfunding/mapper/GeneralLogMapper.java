package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.GeneralLog;
import com.yan.crowdfunding.entity.GeneralLogExample;
import com.yan.crowdfunding.entity.GeneralLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GeneralLogMapper {
    int countByExample(GeneralLogExample example);

    int deleteByExample(GeneralLogExample example);

    int insert(GeneralLogWithBLOBs record);

    int insertSelective(GeneralLogWithBLOBs record);

    List<GeneralLogWithBLOBs> selectByExampleWithBLOBs(GeneralLogExample example);

    List<GeneralLog> selectByExample(GeneralLogExample example);

    int updateByExampleSelective(@Param("record") GeneralLogWithBLOBs record, @Param("example") GeneralLogExample example);

    int updateByExampleWithBLOBs(@Param("record") GeneralLogWithBLOBs record, @Param("example") GeneralLogExample example);

    int updateByExample(@Param("record") GeneralLog record, @Param("example") GeneralLogExample example);
}