package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.XStatementsWithErrorsOrWarnings;
import com.yan.crowdfunding.entity.XStatementsWithErrorsOrWarningsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XStatementsWithErrorsOrWarningsMapper {
    int countByExample(XStatementsWithErrorsOrWarningsExample example);

    int deleteByExample(XStatementsWithErrorsOrWarningsExample example);

    int insert(XStatementsWithErrorsOrWarnings record);

    int insertSelective(XStatementsWithErrorsOrWarnings record);

    List<XStatementsWithErrorsOrWarnings> selectByExampleWithBLOBs(XStatementsWithErrorsOrWarningsExample example);

    List<XStatementsWithErrorsOrWarnings> selectByExample(XStatementsWithErrorsOrWarningsExample example);

    int updateByExampleSelective(@Param("record") XStatementsWithErrorsOrWarnings record, @Param("example") XStatementsWithErrorsOrWarningsExample example);

    int updateByExampleWithBLOBs(@Param("record") XStatementsWithErrorsOrWarnings record, @Param("example") XStatementsWithErrorsOrWarningsExample example);

    int updateByExample(@Param("record") XStatementsWithErrorsOrWarnings record, @Param("example") XStatementsWithErrorsOrWarningsExample example);
}