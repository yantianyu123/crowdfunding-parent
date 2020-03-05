package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TableHandles;
import com.yan.crowdfunding.entity.TableHandlesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableHandlesMapper {
    int countByExample(TableHandlesExample example);

    int deleteByExample(TableHandlesExample example);

    int insert(TableHandles record);

    int insertSelective(TableHandles record);

    List<TableHandles> selectByExample(TableHandlesExample example);

    int updateByExampleSelective(@Param("record") TableHandles record, @Param("example") TableHandlesExample example);

    int updateByExample(@Param("record") TableHandles record, @Param("example") TableHandlesExample example);
}