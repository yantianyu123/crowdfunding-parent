package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbSysForeign;
import com.yan.crowdfunding.entity.InnodbSysForeignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbSysForeignMapper {
    int countByExample(InnodbSysForeignExample example);

    int deleteByExample(InnodbSysForeignExample example);

    int insert(InnodbSysForeign record);

    int insertSelective(InnodbSysForeign record);

    List<InnodbSysForeign> selectByExample(InnodbSysForeignExample example);

    int updateByExampleSelective(@Param("record") InnodbSysForeign record, @Param("example") InnodbSysForeignExample example);

    int updateByExample(@Param("record") InnodbSysForeign record, @Param("example") InnodbSysForeignExample example);
}