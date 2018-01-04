package com.dzj.api.dao;

import com.dzj.api.model.DzjMaster;

import java.util.List;

public interface DzjMasterMapper {
    int deleteByPrimaryKey(Integer dzj_id);

    int insert(DzjMaster record);

    int insertSelective(DzjMaster record);

    DzjMaster selectByPrimaryKey(Integer dzj_id);

    List<DzjMaster> selectTitleByCategoryKey(Integer category_id);

    int updateByPrimaryKeySelective(DzjMaster record);

    int updateByPrimaryKeyWithBLOBs(DzjMaster record);

    int updateByPrimaryKey(DzjMaster record);
}
