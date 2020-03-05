package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TResource;
import com.yan.crowdfunding.entity.TResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TResourceMapper {
    int countByExample(TResourceExample example);

    int deleteByExample(TResourceExample example);

    int insert(TResource record);

    int insertSelective(TResource record);

    List<TResource> selectByExample(TResourceExample example);

    int updateByExampleSelective(@Param("record") TResource record, @Param("example") TResourceExample example);

    int updateByExample(@Param("record") TResource record, @Param("example") TResourceExample example);
}