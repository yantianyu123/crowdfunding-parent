package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbSysForeignCols;
import com.yan.crowdfunding.entity.InnodbSysForeignColsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbSysForeignColsMapper {
    int countByExample(InnodbSysForeignColsExample example);

    int deleteByExample(InnodbSysForeignColsExample example);

    int insert(InnodbSysForeignCols record);

    int insertSelective(InnodbSysForeignCols record);

    List<InnodbSysForeignCols> selectByExample(InnodbSysForeignColsExample example);

    int updateByExampleSelective(@Param("record") InnodbSysForeignCols record, @Param("example") InnodbSysForeignColsExample example);

    int updateByExample(@Param("record") InnodbSysForeignCols record, @Param("example") InnodbSysForeignColsExample example);
}