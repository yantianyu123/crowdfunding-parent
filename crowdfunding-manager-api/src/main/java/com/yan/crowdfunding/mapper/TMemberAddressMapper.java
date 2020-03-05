package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TMemberAddress;
import com.yan.crowdfunding.entity.TMemberAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMemberAddressMapper {
    int countByExample(TMemberAddressExample example);

    int deleteByExample(TMemberAddressExample example);

    int insert(TMemberAddress record);

    int insertSelective(TMemberAddress record);

    List<TMemberAddress> selectByExample(TMemberAddressExample example);

    int updateByExampleSelective(@Param("record") TMemberAddress record, @Param("example") TMemberAddressExample example);

    int updateByExample(@Param("record") TMemberAddress record, @Param("example") TMemberAddressExample example);
}