package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TAdvertisement;
import com.yan.crowdfunding.entity.TAdvertisementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAdvertisementMapper {
    int countByExample(TAdvertisementExample example);

    int deleteByExample(TAdvertisementExample example);

    int insert(TAdvertisement record);

    int insertSelective(TAdvertisement record);

    List<TAdvertisement> selectByExample(TAdvertisementExample example);

    int updateByExampleSelective(@Param("record") TAdvertisement record, @Param("example") TAdvertisementExample example);

    int updateByExample(@Param("record") TAdvertisement record, @Param("example") TAdvertisementExample example);
}