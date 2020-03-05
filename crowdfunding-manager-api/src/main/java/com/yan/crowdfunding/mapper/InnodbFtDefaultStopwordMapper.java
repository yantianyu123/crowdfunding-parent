package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbFtDefaultStopword;
import com.yan.crowdfunding.entity.InnodbFtDefaultStopwordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbFtDefaultStopwordMapper {
    int countByExample(InnodbFtDefaultStopwordExample example);

    int deleteByExample(InnodbFtDefaultStopwordExample example);

    int insert(InnodbFtDefaultStopword record);

    int insertSelective(InnodbFtDefaultStopword record);

    List<InnodbFtDefaultStopword> selectByExample(InnodbFtDefaultStopwordExample example);

    int updateByExampleSelective(@Param("record") InnodbFtDefaultStopword record, @Param("example") InnodbFtDefaultStopwordExample example);

    int updateByExample(@Param("record") InnodbFtDefaultStopword record, @Param("example") InnodbFtDefaultStopwordExample example);
}