package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TMenu;
import com.yan.crowdfunding.entity.TMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMenuMapper {
    int countByExample(TMenuExample example);

    int deleteByExample(TMenuExample example);

    int insert(TMenu record);

    int insertSelective(TMenu record);

    List<TMenu> selectByExample(TMenuExample example);

    int updateByExampleSelective(@Param("record") TMenu record, @Param("example") TMenuExample example);

    int updateByExample(@Param("record") TMenu record, @Param("example") TMenuExample example);
}