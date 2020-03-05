package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbFtBeingDeleted;
import com.yan.crowdfunding.entity.InnodbFtBeingDeletedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbFtBeingDeletedMapper {
    int countByExample(InnodbFtBeingDeletedExample example);

    int deleteByExample(InnodbFtBeingDeletedExample example);

    int insert(InnodbFtBeingDeleted record);

    int insertSelective(InnodbFtBeingDeleted record);

    List<InnodbFtBeingDeleted> selectByExample(InnodbFtBeingDeletedExample example);

    int updateByExampleSelective(@Param("record") InnodbFtBeingDeleted record, @Param("example") InnodbFtBeingDeletedExample example);

    int updateByExample(@Param("record") InnodbFtBeingDeleted record, @Param("example") InnodbFtBeingDeletedExample example);
}