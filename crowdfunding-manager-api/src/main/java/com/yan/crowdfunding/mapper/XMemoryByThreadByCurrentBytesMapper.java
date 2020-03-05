package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.XMemoryByThreadByCurrentBytes;
import com.yan.crowdfunding.entity.XMemoryByThreadByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XMemoryByThreadByCurrentBytesMapper {
    int countByExample(XMemoryByThreadByCurrentBytesExample example);

    int deleteByExample(XMemoryByThreadByCurrentBytesExample example);

    int insert(XMemoryByThreadByCurrentBytes record);

    int insertSelective(XMemoryByThreadByCurrentBytes record);

    List<XMemoryByThreadByCurrentBytes> selectByExample(XMemoryByThreadByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") XMemoryByThreadByCurrentBytes record, @Param("example") XMemoryByThreadByCurrentBytesExample example);

    int updateByExample(@Param("record") XMemoryByThreadByCurrentBytes record, @Param("example") XMemoryByThreadByCurrentBytesExample example);
}