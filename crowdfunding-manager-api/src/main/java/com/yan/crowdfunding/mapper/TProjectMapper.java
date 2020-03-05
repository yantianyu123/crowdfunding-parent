package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TProject;
import com.yan.crowdfunding.entity.TProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProjectMapper {
    int countByExample(TProjectExample example);

    int deleteByExample(TProjectExample example);

    int insert(TProject record);

    int insertSelective(TProject record);

    List<TProject> selectByExample(TProjectExample example);

    int updateByExampleSelective(@Param("record") TProject record, @Param("example") TProjectExample example);

    int updateByExample(@Param("record") TProject record, @Param("example") TProjectExample example);
}