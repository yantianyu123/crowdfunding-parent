package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.NdbBinlogIndex;
import com.yan.crowdfunding.entity.NdbBinlogIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NdbBinlogIndexMapper {
    int countByExample(NdbBinlogIndexExample example);

    int deleteByExample(NdbBinlogIndexExample example);

    int insert(NdbBinlogIndex record);

    int insertSelective(NdbBinlogIndex record);

    List<NdbBinlogIndex> selectByExample(NdbBinlogIndexExample example);

    int updateByExampleSelective(@Param("record") NdbBinlogIndex record, @Param("example") NdbBinlogIndexExample example);

    int updateByExample(@Param("record") NdbBinlogIndex record, @Param("example") NdbBinlogIndexExample example);
}