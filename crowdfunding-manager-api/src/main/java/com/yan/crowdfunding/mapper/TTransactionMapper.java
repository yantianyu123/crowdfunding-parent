package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TTransaction;
import com.yan.crowdfunding.entity.TTransactionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTransactionMapper {
    int countByExample(TTransactionExample example);

    int deleteByExample(TTransactionExample example);

    int insert(TTransaction record);

    int insertSelective(TTransaction record);

    List<TTransaction> selectByExample(TTransactionExample example);

    int updateByExampleSelective(@Param("record") TTransaction record, @Param("example") TTransactionExample example);

    int updateByExample(@Param("record") TTransaction record, @Param("example") TTransactionExample example);
}