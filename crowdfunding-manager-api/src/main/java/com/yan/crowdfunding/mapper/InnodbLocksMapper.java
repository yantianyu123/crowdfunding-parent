package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbLocks;
import com.yan.crowdfunding.entity.InnodbLocksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbLocksMapper {
    int countByExample(InnodbLocksExample example);

    int deleteByExample(InnodbLocksExample example);

    int insert(InnodbLocks record);

    int insertSelective(InnodbLocks record);

    List<InnodbLocks> selectByExample(InnodbLocksExample example);

    int updateByExampleSelective(@Param("record") InnodbLocks record, @Param("example") InnodbLocksExample example);

    int updateByExample(@Param("record") InnodbLocks record, @Param("example") InnodbLocksExample example);
}