package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.XMemoryByHostByCurrentBytes;
import com.yan.crowdfunding.entity.XMemoryByHostByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XMemoryByHostByCurrentBytesMapper {
    int countByExample(XMemoryByHostByCurrentBytesExample example);

    int deleteByExample(XMemoryByHostByCurrentBytesExample example);

    int insert(XMemoryByHostByCurrentBytes record);

    int insertSelective(XMemoryByHostByCurrentBytes record);

    List<XMemoryByHostByCurrentBytes> selectByExample(XMemoryByHostByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") XMemoryByHostByCurrentBytes record, @Param("example") XMemoryByHostByCurrentBytesExample example);

    int updateByExample(@Param("record") XMemoryByHostByCurrentBytes record, @Param("example") XMemoryByHostByCurrentBytesExample example);
}