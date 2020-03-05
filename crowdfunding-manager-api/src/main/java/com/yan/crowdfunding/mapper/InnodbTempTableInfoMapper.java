package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbTempTableInfo;
import com.yan.crowdfunding.entity.InnodbTempTableInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbTempTableInfoMapper {
    int countByExample(InnodbTempTableInfoExample example);

    int deleteByExample(InnodbTempTableInfoExample example);

    int insert(InnodbTempTableInfo record);

    int insertSelective(InnodbTempTableInfo record);

    List<InnodbTempTableInfo> selectByExample(InnodbTempTableInfoExample example);

    int updateByExampleSelective(@Param("record") InnodbTempTableInfo record, @Param("example") InnodbTempTableInfoExample example);

    int updateByExample(@Param("record") InnodbTempTableInfo record, @Param("example") InnodbTempTableInfoExample example);
}