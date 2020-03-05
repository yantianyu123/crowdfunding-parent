package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.XIoGlobalByFileByBytes;
import com.yan.crowdfunding.entity.XIoGlobalByFileByBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XIoGlobalByFileByBytesMapper {
    int countByExample(XIoGlobalByFileByBytesExample example);

    int deleteByExample(XIoGlobalByFileByBytesExample example);

    int insert(XIoGlobalByFileByBytes record);

    int insertSelective(XIoGlobalByFileByBytes record);

    List<XIoGlobalByFileByBytes> selectByExample(XIoGlobalByFileByBytesExample example);

    int updateByExampleSelective(@Param("record") XIoGlobalByFileByBytes record, @Param("example") XIoGlobalByFileByBytesExample example);

    int updateByExample(@Param("record") XIoGlobalByFileByBytes record, @Param("example") XIoGlobalByFileByBytesExample example);
}