package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbFtConfig;
import com.yan.crowdfunding.entity.InnodbFtConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbFtConfigMapper {
    int countByExample(InnodbFtConfigExample example);

    int deleteByExample(InnodbFtConfigExample example);

    int insert(InnodbFtConfig record);

    int insertSelective(InnodbFtConfig record);

    List<InnodbFtConfig> selectByExample(InnodbFtConfigExample example);

    int updateByExampleSelective(@Param("record") InnodbFtConfig record, @Param("example") InnodbFtConfigExample example);

    int updateByExample(@Param("record") InnodbFtConfig record, @Param("example") InnodbFtConfigExample example);
}