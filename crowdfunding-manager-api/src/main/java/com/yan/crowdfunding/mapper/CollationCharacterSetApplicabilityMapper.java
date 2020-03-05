package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.CollationCharacterSetApplicability;
import com.yan.crowdfunding.entity.CollationCharacterSetApplicabilityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollationCharacterSetApplicabilityMapper {
    int countByExample(CollationCharacterSetApplicabilityExample example);

    int deleteByExample(CollationCharacterSetApplicabilityExample example);

    int insert(CollationCharacterSetApplicability record);

    int insertSelective(CollationCharacterSetApplicability record);

    List<CollationCharacterSetApplicability> selectByExample(CollationCharacterSetApplicabilityExample example);

    int updateByExampleSelective(@Param("record") CollationCharacterSetApplicability record, @Param("example") CollationCharacterSetApplicabilityExample example);

    int updateByExample(@Param("record") CollationCharacterSetApplicability record, @Param("example") CollationCharacterSetApplicabilityExample example);
}