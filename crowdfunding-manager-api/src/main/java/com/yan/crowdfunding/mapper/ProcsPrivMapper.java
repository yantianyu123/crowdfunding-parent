package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.ProcsPriv;
import com.yan.crowdfunding.entity.ProcsPrivExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcsPrivMapper {
    int countByExample(ProcsPrivExample example);

    int deleteByExample(ProcsPrivExample example);

    int insert(ProcsPriv record);

    int insertSelective(ProcsPriv record);

    List<ProcsPriv> selectByExample(ProcsPrivExample example);

    int updateByExampleSelective(@Param("record") ProcsPriv record, @Param("example") ProcsPrivExample example);

    int updateByExample(@Param("record") ProcsPriv record, @Param("example") ProcsPrivExample example);
}