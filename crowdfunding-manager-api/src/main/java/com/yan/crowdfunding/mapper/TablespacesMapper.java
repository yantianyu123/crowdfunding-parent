package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.Tablespaces;
import com.yan.crowdfunding.entity.TablespacesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TablespacesMapper {
    int countByExample(TablespacesExample example);

    int deleteByExample(TablespacesExample example);

    int insert(Tablespaces record);

    int insertSelective(Tablespaces record);

    List<Tablespaces> selectByExample(TablespacesExample example);

    int updateByExampleSelective(@Param("record") Tablespaces record, @Param("example") TablespacesExample example);

    int updateByExample(@Param("record") Tablespaces record, @Param("example") TablespacesExample example);
}