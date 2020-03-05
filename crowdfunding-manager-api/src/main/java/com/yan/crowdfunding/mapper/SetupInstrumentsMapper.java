package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.SetupInstruments;
import com.yan.crowdfunding.entity.SetupInstrumentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetupInstrumentsMapper {
    int countByExample(SetupInstrumentsExample example);

    int deleteByExample(SetupInstrumentsExample example);

    int insert(SetupInstruments record);

    int insertSelective(SetupInstruments record);

    List<SetupInstruments> selectByExample(SetupInstrumentsExample example);

    int updateByExampleSelective(@Param("record") SetupInstruments record, @Param("example") SetupInstrumentsExample example);

    int updateByExample(@Param("record") SetupInstruments record, @Param("example") SetupInstrumentsExample example);
}