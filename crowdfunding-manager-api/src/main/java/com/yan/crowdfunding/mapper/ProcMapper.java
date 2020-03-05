package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.Proc;
import com.yan.crowdfunding.entity.ProcExample;
import com.yan.crowdfunding.entity.ProcWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcMapper {
    int countByExample(ProcExample example);

    int deleteByExample(ProcExample example);

    int insert(ProcWithBLOBs record);

    int insertSelective(ProcWithBLOBs record);

    List<ProcWithBLOBs> selectByExampleWithBLOBs(ProcExample example);

    List<Proc> selectByExample(ProcExample example);

    int updateByExampleSelective(@Param("record") ProcWithBLOBs record, @Param("example") ProcExample example);

    int updateByExampleWithBLOBs(@Param("record") ProcWithBLOBs record, @Param("example") ProcExample example);

    int updateByExample(@Param("record") Proc record, @Param("example") ProcExample example);
}