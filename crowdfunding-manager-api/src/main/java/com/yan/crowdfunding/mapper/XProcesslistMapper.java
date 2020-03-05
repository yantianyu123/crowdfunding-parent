package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.XProcesslist;
import com.yan.crowdfunding.entity.XProcesslistExample;
import com.yan.crowdfunding.entity.XProcesslistWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XProcesslistMapper {
    int countByExample(XProcesslistExample example);

    int deleteByExample(XProcesslistExample example);

    int insert(XProcesslistWithBLOBs record);

    int insertSelective(XProcesslistWithBLOBs record);

    List<XProcesslistWithBLOBs> selectByExampleWithBLOBs(XProcesslistExample example);

    List<XProcesslist> selectByExample(XProcesslistExample example);

    int updateByExampleSelective(@Param("record") XProcesslistWithBLOBs record, @Param("example") XProcesslistExample example);

    int updateByExampleWithBLOBs(@Param("record") XProcesslistWithBLOBs record, @Param("example") XProcesslistExample example);

    int updateByExample(@Param("record") XProcesslist record, @Param("example") XProcesslistExample example);
}