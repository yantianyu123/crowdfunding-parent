package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.XIoGlobalByWaitByBytes;
import com.yan.crowdfunding.entity.XIoGlobalByWaitByBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XIoGlobalByWaitByBytesMapper {
    int countByExample(XIoGlobalByWaitByBytesExample example);

    int deleteByExample(XIoGlobalByWaitByBytesExample example);

    int insert(XIoGlobalByWaitByBytes record);

    int insertSelective(XIoGlobalByWaitByBytes record);

    List<XIoGlobalByWaitByBytes> selectByExample(XIoGlobalByWaitByBytesExample example);

    int updateByExampleSelective(@Param("record") XIoGlobalByWaitByBytes record, @Param("example") XIoGlobalByWaitByBytesExample example);

    int updateByExample(@Param("record") XIoGlobalByWaitByBytes record, @Param("example") XIoGlobalByWaitByBytesExample example);
}