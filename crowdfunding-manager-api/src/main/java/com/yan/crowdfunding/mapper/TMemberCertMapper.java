package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TMemberCert;
import com.yan.crowdfunding.entity.TMemberCertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMemberCertMapper {
    int countByExample(TMemberCertExample example);

    int deleteByExample(TMemberCertExample example);

    int insert(TMemberCert record);

    int insertSelective(TMemberCert record);

    List<TMemberCert> selectByExample(TMemberCertExample example);

    int updateByExampleSelective(@Param("record") TMemberCert record, @Param("example") TMemberCertExample example);

    int updateByExample(@Param("record") TMemberCert record, @Param("example") TMemberCertExample example);
}