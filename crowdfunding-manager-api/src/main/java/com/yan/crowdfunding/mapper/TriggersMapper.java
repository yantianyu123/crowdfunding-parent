package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.Triggers;
import com.yan.crowdfunding.entity.TriggersExample;
import com.yan.crowdfunding.entity.TriggersWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TriggersMapper {
    int countByExample(TriggersExample example);

    int deleteByExample(TriggersExample example);

    int insert(TriggersWithBLOBs record);

    int insertSelective(TriggersWithBLOBs record);

    List<TriggersWithBLOBs> selectByExampleWithBLOBs(TriggersExample example);

    List<Triggers> selectByExample(TriggersExample example);

    int updateByExampleSelective(@Param("record") TriggersWithBLOBs record, @Param("example") TriggersExample example);

    int updateByExampleWithBLOBs(@Param("record") TriggersWithBLOBs record, @Param("example") TriggersExample example);

    int updateByExample(@Param("record") Triggers record, @Param("example") TriggersExample example);
}