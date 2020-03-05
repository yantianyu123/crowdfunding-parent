package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TProjectType;
import com.yan.crowdfunding.entity.TProjectTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProjectTypeMapper {
    int countByExample(TProjectTypeExample example);

    int deleteByExample(TProjectTypeExample example);

    int insert(TProjectType record);

    int insertSelective(TProjectType record);

    List<TProjectType> selectByExample(TProjectTypeExample example);

    int updateByExampleSelective(@Param("record") TProjectType record, @Param("example") TProjectTypeExample example);

    int updateByExample(@Param("record") TProjectType record, @Param("example") TProjectTypeExample example);
}