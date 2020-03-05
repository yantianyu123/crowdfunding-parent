package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TAccountTypeCert;
import com.yan.crowdfunding.entity.TAccountTypeCertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAccountTypeCertMapper {
    int countByExample(TAccountTypeCertExample example);

    int deleteByExample(TAccountTypeCertExample example);

    int insert(TAccountTypeCert record);

    int insertSelective(TAccountTypeCert record);

    List<TAccountTypeCert> selectByExample(TAccountTypeCertExample example);

    int updateByExampleSelective(@Param("record") TAccountTypeCert record, @Param("example") TAccountTypeCertExample example);

    int updateByExample(@Param("record") TAccountTypeCert record, @Param("example") TAccountTypeCertExample example);
}