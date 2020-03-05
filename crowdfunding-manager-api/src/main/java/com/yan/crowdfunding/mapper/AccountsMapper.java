package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.Accounts;
import com.yan.crowdfunding.entity.AccountsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountsMapper {
    int countByExample(AccountsExample example);

    int deleteByExample(AccountsExample example);

    int insert(Accounts record);

    int insertSelective(Accounts record);

    List<Accounts> selectByExample(AccountsExample example);

    int updateByExampleSelective(@Param("record") Accounts record, @Param("example") AccountsExample example);

    int updateByExample(@Param("record") Accounts record, @Param("example") AccountsExample example);
}