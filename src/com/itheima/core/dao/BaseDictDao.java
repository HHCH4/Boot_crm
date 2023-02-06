package com.itheima.core.dao;

import com.itheima.core.po.BaseDict;

import java.util.List;

public interface BaseDictDao {
    public List<BaseDict> selectBaseDictByTypeCode(String typecode);
}
