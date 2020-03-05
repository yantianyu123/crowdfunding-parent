package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbBufferPage;
import com.yan.crowdfunding.entity.InnodbBufferPageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbBufferPageMapper {
    int countByExample(InnodbBufferPageExample example);

    int deleteByExample(InnodbBufferPageExample example);

    int insert(InnodbBufferPage record);

    int insertSelective(InnodbBufferPage record);

    List<InnodbBufferPage> selectByExample(InnodbBufferPageExample example);

    int updateByExampleSelective(@Param("record") InnodbBufferPage record, @Param("example") InnodbBufferPageExample example);

    int updateByExample(@Param("record") InnodbBufferPage record, @Param("example") InnodbBufferPageExample example);
}