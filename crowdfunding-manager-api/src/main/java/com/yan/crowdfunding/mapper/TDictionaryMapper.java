package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TDictionary;
import com.yan.crowdfunding.entity.TDictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDictionaryMapper {
    int countByExample(TDictionaryExample example);

    int deleteByExample(TDictionaryExample example);

    int insert(TDictionary record);

    int insertSelective(TDictionary record);

    List<TDictionary> selectByExample(TDictionaryExample example);

    int updateByExampleSelective(@Param("record") TDictionary record, @Param("example") TDictionaryExample example);

    int updateByExample(@Param("record") TDictionary record, @Param("example") TDictionaryExample example);
}