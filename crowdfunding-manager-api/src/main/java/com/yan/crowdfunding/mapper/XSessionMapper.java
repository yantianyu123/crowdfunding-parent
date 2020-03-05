package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.XSession;
import com.yan.crowdfunding.entity.XSessionExample;
import com.yan.crowdfunding.entity.XSessionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XSessionMapper {
    int countByExample(XSessionExample example);

    int deleteByExample(XSessionExample example);

    int insert(XSessionWithBLOBs record);

    int insertSelective(XSessionWithBLOBs record);

    List<XSessionWithBLOBs> selectByExampleWithBLOBs(XSessionExample example);

    List<XSession> selectByExample(XSessionExample example);

    int updateByExampleSelective(@Param("record") XSessionWithBLOBs record, @Param("example") XSessionExample example);

    int updateByExampleWithBLOBs(@Param("record") XSessionWithBLOBs record, @Param("example") XSessionExample example);

    int updateByExample(@Param("record") XSession record, @Param("example") XSessionExample example);
}