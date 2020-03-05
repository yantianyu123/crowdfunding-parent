package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.SchemaRedundantIndexes;
import com.yan.crowdfunding.entity.SchemaRedundantIndexesExample;
import com.yan.crowdfunding.entity.SchemaRedundantIndexesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaRedundantIndexesMapper {
    int countByExample(SchemaRedundantIndexesExample example);

    int deleteByExample(SchemaRedundantIndexesExample example);

    int insert(SchemaRedundantIndexesWithBLOBs record);

    int insertSelective(SchemaRedundantIndexesWithBLOBs record);

    List<SchemaRedundantIndexesWithBLOBs> selectByExampleWithBLOBs(SchemaRedundantIndexesExample example);

    List<SchemaRedundantIndexes> selectByExample(SchemaRedundantIndexesExample example);

    int updateByExampleSelective(@Param("record") SchemaRedundantIndexesWithBLOBs record, @Param("example") SchemaRedundantIndexesExample example);

    int updateByExampleWithBLOBs(@Param("record") SchemaRedundantIndexesWithBLOBs record, @Param("example") SchemaRedundantIndexesExample example);

    int updateByExample(@Param("record") SchemaRedundantIndexes record, @Param("example") SchemaRedundantIndexesExample example);
}