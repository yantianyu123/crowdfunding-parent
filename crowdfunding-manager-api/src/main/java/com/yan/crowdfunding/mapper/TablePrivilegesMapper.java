package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TablePrivileges;
import com.yan.crowdfunding.entity.TablePrivilegesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TablePrivilegesMapper {
    int countByExample(TablePrivilegesExample example);

    int deleteByExample(TablePrivilegesExample example);

    int insert(TablePrivileges record);

    int insertSelective(TablePrivileges record);

    List<TablePrivileges> selectByExample(TablePrivilegesExample example);

    int updateByExampleSelective(@Param("record") TablePrivileges record, @Param("example") TablePrivilegesExample example);

    int updateByExample(@Param("record") TablePrivileges record, @Param("example") TablePrivilegesExample example);
}