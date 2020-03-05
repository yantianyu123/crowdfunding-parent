package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbCmp;
import com.yan.crowdfunding.entity.InnodbCmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbCmpMapper {
    int countByExample(InnodbCmpExample example);

    int deleteByExample(InnodbCmpExample example);

    int insert(InnodbCmp record);

    int insertSelective(InnodbCmp record);

    List<InnodbCmp> selectByExample(InnodbCmpExample example);

    int updateByExampleSelective(@Param("record") InnodbCmp record, @Param("example") InnodbCmpExample example);

    int updateByExample(@Param("record") InnodbCmp record, @Param("example") InnodbCmpExample example);
}