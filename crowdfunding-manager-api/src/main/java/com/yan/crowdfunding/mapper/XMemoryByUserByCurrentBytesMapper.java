package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.XMemoryByUserByCurrentBytes;
import com.yan.crowdfunding.entity.XMemoryByUserByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XMemoryByUserByCurrentBytesMapper {
    int countByExample(XMemoryByUserByCurrentBytesExample example);

    int deleteByExample(XMemoryByUserByCurrentBytesExample example);

    int insert(XMemoryByUserByCurrentBytes record);

    int insertSelective(XMemoryByUserByCurrentBytes record);

    List<XMemoryByUserByCurrentBytes> selectByExample(XMemoryByUserByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") XMemoryByUserByCurrentBytes record, @Param("example") XMemoryByUserByCurrentBytesExample example);

    int updateByExample(@Param("record") XMemoryByUserByCurrentBytes record, @Param("example") XMemoryByUserByCurrentBytesExample example);
}