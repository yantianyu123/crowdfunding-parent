package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbSysFields;
import com.yan.crowdfunding.entity.InnodbSysFieldsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbSysFieldsMapper {
    int countByExample(InnodbSysFieldsExample example);

    int deleteByExample(InnodbSysFieldsExample example);

    int insert(InnodbSysFields record);

    int insertSelective(InnodbSysFields record);

    List<InnodbSysFields> selectByExample(InnodbSysFieldsExample example);

    int updateByExampleSelective(@Param("record") InnodbSysFields record, @Param("example") InnodbSysFieldsExample example);

    int updateByExample(@Param("record") InnodbSysFields record, @Param("example") InnodbSysFieldsExample example);
}