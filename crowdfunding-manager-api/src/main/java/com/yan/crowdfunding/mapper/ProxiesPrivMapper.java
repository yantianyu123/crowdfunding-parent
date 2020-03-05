package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.ProxiesPriv;
import com.yan.crowdfunding.entity.ProxiesPrivExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProxiesPrivMapper {
    int countByExample(ProxiesPrivExample example);

    int deleteByExample(ProxiesPrivExample example);

    int insert(ProxiesPriv record);

    int insertSelective(ProxiesPriv record);

    List<ProxiesPriv> selectByExample(ProxiesPrivExample example);

    int updateByExampleSelective(@Param("record") ProxiesPriv record, @Param("example") ProxiesPrivExample example);

    int updateByExample(@Param("record") ProxiesPriv record, @Param("example") ProxiesPrivExample example);
}