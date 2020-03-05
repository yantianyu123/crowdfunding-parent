package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbFtDeleted;
import com.yan.crowdfunding.entity.InnodbFtDeletedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbFtDeletedMapper {
    int countByExample(InnodbFtDeletedExample example);

    int deleteByExample(InnodbFtDeletedExample example);

    int insert(InnodbFtDeleted record);

    int insertSelective(InnodbFtDeleted record);

    List<InnodbFtDeleted> selectByExample(InnodbFtDeletedExample example);

    int updateByExampleSelective(@Param("record") InnodbFtDeleted record, @Param("example") InnodbFtDeletedExample example);

    int updateByExample(@Param("record") InnodbFtDeleted record, @Param("example") InnodbFtDeletedExample example);
}