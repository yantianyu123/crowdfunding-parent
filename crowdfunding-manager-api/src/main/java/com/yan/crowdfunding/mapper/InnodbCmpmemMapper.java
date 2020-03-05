package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbCmpmem;
import com.yan.crowdfunding.entity.InnodbCmpmemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbCmpmemMapper {
    int countByExample(InnodbCmpmemExample example);

    int deleteByExample(InnodbCmpmemExample example);

    int insert(InnodbCmpmem record);

    int insertSelective(InnodbCmpmem record);

    List<InnodbCmpmem> selectByExample(InnodbCmpmemExample example);

    int updateByExampleSelective(@Param("record") InnodbCmpmem record, @Param("example") InnodbCmpmemExample example);

    int updateByExample(@Param("record") InnodbCmpmem record, @Param("example") InnodbCmpmemExample example);
}