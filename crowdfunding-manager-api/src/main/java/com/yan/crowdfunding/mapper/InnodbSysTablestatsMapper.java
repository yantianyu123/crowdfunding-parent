package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbSysTablestats;
import com.yan.crowdfunding.entity.InnodbSysTablestatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbSysTablestatsMapper {
    int countByExample(InnodbSysTablestatsExample example);

    int deleteByExample(InnodbSysTablestatsExample example);

    int insert(InnodbSysTablestats record);

    int insertSelective(InnodbSysTablestats record);

    List<InnodbSysTablestats> selectByExample(InnodbSysTablestatsExample example);

    int updateByExampleSelective(@Param("record") InnodbSysTablestats record, @Param("example") InnodbSysTablestatsExample example);

    int updateByExample(@Param("record") InnodbSysTablestats record, @Param("example") InnodbSysTablestatsExample example);
}