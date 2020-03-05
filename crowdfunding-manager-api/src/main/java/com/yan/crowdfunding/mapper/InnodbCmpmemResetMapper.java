package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbCmpmemReset;
import com.yan.crowdfunding.entity.InnodbCmpmemResetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbCmpmemResetMapper {
    int countByExample(InnodbCmpmemResetExample example);

    int deleteByExample(InnodbCmpmemResetExample example);

    int insert(InnodbCmpmemReset record);

    int insertSelective(InnodbCmpmemReset record);

    List<InnodbCmpmemReset> selectByExample(InnodbCmpmemResetExample example);

    int updateByExampleSelective(@Param("record") InnodbCmpmemReset record, @Param("example") InnodbCmpmemResetExample example);

    int updateByExample(@Param("record") InnodbCmpmemReset record, @Param("example") InnodbCmpmemResetExample example);
}