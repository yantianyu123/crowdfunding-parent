package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.CharacterSets;
import com.yan.crowdfunding.entity.CharacterSetsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CharacterSetsMapper {
    int countByExample(CharacterSetsExample example);

    int deleteByExample(CharacterSetsExample example);

    int insert(CharacterSets record);

    int insertSelective(CharacterSets record);

    List<CharacterSets> selectByExample(CharacterSetsExample example);

    int updateByExampleSelective(@Param("record") CharacterSets record, @Param("example") CharacterSetsExample example);

    int updateByExample(@Param("record") CharacterSets record, @Param("example") CharacterSetsExample example);
}