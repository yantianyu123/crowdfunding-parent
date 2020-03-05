package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TMessage;
import com.yan.crowdfunding.entity.TMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMessageMapper {
    int countByExample(TMessageExample example);

    int deleteByExample(TMessageExample example);

    int insert(TMessage record);

    int insertSelective(TMessage record);

    List<TMessage> selectByExample(TMessageExample example);

    int updateByExampleSelective(@Param("record") TMessage record, @Param("example") TMessageExample example);

    int updateByExample(@Param("record") TMessage record, @Param("example") TMessageExample example);
}