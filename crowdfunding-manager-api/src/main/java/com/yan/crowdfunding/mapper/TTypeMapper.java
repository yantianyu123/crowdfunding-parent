package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TType;
import com.yan.crowdfunding.entity.TTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTypeMapper {
    int countByExample(TTypeExample example);

    int deleteByExample(TTypeExample example);

    int insert(TType record);

    int insertSelective(TType record);

    List<TType> selectByExample(TTypeExample example);

    int updateByExampleSelective(@Param("record") TType record, @Param("example") TTypeExample example);

    int updateByExample(@Param("record") TType record, @Param("example") TTypeExample example);
}