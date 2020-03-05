package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.StatusByHost;
import com.yan.crowdfunding.entity.StatusByHostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatusByHostMapper {
    int countByExample(StatusByHostExample example);

    int deleteByExample(StatusByHostExample example);

    int insert(StatusByHost record);

    int insertSelective(StatusByHost record);

    List<StatusByHost> selectByExample(StatusByHostExample example);

    int updateByExampleSelective(@Param("record") StatusByHost record, @Param("example") StatusByHostExample example);

    int updateByExample(@Param("record") StatusByHost record, @Param("example") StatusByHostExample example);
}