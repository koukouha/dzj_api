package com.dzj.api.dao;

import com.dzj.api.model.DzjCategory;

import java.util.List;

public interface DzjCategoryMapper {
    int deleteByPrimaryKey(Integer dzj_category_id);

    int insert(DzjCategory record);

    int insertSelective(DzjCategory record);

    DzjCategory selectByPrimaryKey(Integer dzj_category_id);

    List<DzjCategory> selectAll();

    int updateByPrimaryKeySelective(DzjCategory record);

    int updateByPrimaryKey(DzjCategory record);
}
