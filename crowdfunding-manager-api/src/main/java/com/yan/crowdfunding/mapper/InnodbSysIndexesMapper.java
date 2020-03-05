package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbSysIndexes;
import com.yan.crowdfunding.entity.InnodbSysIndexesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbSysIndexesMapper {
    int countByExample(InnodbSysIndexesExample example);

    int deleteByExample(InnodbSysIndexesExample example);

    int insert(InnodbSysIndexes record);

    int insertSelective(InnodbSysIndexes record);

    List<InnodbSysIndexes> selectByExample(InnodbSysIndexesExample example);

    int updateByExampleSelective(@Param("record") InnodbSysIndexes record, @Param("example") InnodbSysIndexesExample example);

    int updateByExample(@Param("record") InnodbSysIndexes record, @Param("example") InnodbSysIndexesExample example);
}