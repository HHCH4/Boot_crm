package com.itheima.core.service;

import com.itheima.common.utils.Page;
import com.itheima.core.po.BaseDict;
import com.itheima.core.po.Customer;

import java.util.List;

public interface BaseDictService {
    public List<BaseDict> findBaseDictByTypeCode(String typecode);
}
