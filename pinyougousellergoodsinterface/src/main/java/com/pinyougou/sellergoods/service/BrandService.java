package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;
import com.pinyougou.pojo.entity.PageResult;

import java.util.List;

/**
 * 品牌接口
 * @author Administrator
 */
public interface BrandService {

    public List<TbBrand> findAll();

    /**
     * 返回分页列表 品牌分页
     * @param pageNum   当前页面
     * @param pageSize  每页记录数
     * @return
     */
    public PageResult findPage(int pageNum,int pageSize);

    /**
     * 增加
     * @param brand
     */
    public void add(TbBrand brand);

    /**
     * 修改
     */
    public void update(TbBrand brand);

    /**
     * 根据id获取实体
     * @param id
     * @return
     */
    public TbBrand findOne(Long id);

    /**
     * 批量删除
     * @param ids
     */
    public void delete(Long[] ids);

/**
 * 分页
 * @param pageNum 当前页 码
 * @param pageSize 每页记录数
 * @return
 */
public PageResult findPage(TbBrand brand,int pageNum,int pageSize);



}
