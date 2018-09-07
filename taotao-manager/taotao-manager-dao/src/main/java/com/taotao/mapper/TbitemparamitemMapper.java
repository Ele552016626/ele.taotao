package com.taotao.mapper;

import com.taotao.pojo.Tbitemparamitem;

public interface TbitemparamitemMapper {
    /**
     * 把规则参数保存到数据库中
     * @param tbitemParamitem 需要保存的规则参数
     */
    void insertTbitemParamItem(Tbitemparamitem tbitemParamitem);
}