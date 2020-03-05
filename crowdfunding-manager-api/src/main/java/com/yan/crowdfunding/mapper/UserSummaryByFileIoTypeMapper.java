package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.UserSummaryByFileIoType;
import com.yan.crowdfunding.entity.UserSummaryByFileIoTypeExample;
import com.yan.crowdfunding.entity.UserSummaryByFileIoTypeWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSummaryByFileIoTypeMapper {
    int countByExample(UserSummaryByFileIoTypeExample example);

    int deleteByExample(UserSummaryByFileIoTypeExample example);

    int insert(UserSummaryByFileIoTypeWithBLOBs record);

    int insertSelective(UserSummaryByFileIoTypeWithBLOBs record);

    List<UserSummaryByFileIoTypeWithBLOBs> selectByExampleWithBLOBs(UserSummaryByFileIoTypeExample example);

    List<UserSummaryByFileIoType> selectByExample(UserSummaryByFileIoTypeExample example);

    int updateByExampleSelective(@Param("record") UserSummaryByFileIoTypeWithBLOBs record, @Param("example") UserSummaryByFileIoTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") UserSummaryByFileIoTypeWithBLOBs record, @Param("example") UserSummaryByFileIoTypeExample example);

    int updateByExample(@Param("record") UserSummaryByFileIoType record, @Param("example") UserSummaryByFileIoTypeExample example);
}