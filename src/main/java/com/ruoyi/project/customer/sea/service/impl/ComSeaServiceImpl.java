package com.ruoyi.project.customer.sea.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.customer.sea.mapper.ComSeaMapper;
import com.ruoyi.project.customer.sea.domain.ComSea;
import com.ruoyi.project.customer.sea.service.IComSeaService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 客户公海Service业务层处理
 * 
 * @author 李守壮
 * @date 2023-02-14
 */
@Service
public class ComSeaServiceImpl implements IComSeaService 
{
    @Autowired
    private ComSeaMapper comSeaMapper;

    /**
     * 查询客户公海
     * 
     * @param id 客户公海主键
     * @return 客户公海
     */
    @Override
    public ComSea selectComSeaById(Long id)
    {
        return comSeaMapper.selectComSeaById(id);
    }

    /**
     * 查询客户公海列表
     * 
     * @param comSea 客户公海
     * @return 客户公海
     */
    @Override
    public List<ComSea> selectComSeaList(ComSea comSea)
    {
        return comSeaMapper.selectComSeaList(comSea);
    }

    /**
     * 新增客户公海
     * 
     * @param comSea 客户公海
     * @return 结果
     */
    @Override
    public int insertComSea(ComSea comSea)
    {
        comSea.setCreateTime(DateUtils.getNowDate());
        return comSeaMapper.insertComSea(comSea);
    }

    /**
     * 修改客户公海
     * 
     * @param comSea 客户公海
     * @return 结果
     */
    @Override
    public int updateComSea(ComSea comSea)
    {
        comSea.setUpdateTime(DateUtils.getNowDate());
        return comSeaMapper.updateComSea(comSea);
    }

    /**
     * 批量删除客户公海
     * 
     * @param ids 需要删除的客户公海主键
     * @return 结果
     */
    @Override
    public int deleteComSeaByIds(String ids)
    {
        return comSeaMapper.deleteComSeaByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户公海信息
     * 
     * @param id 客户公海主键
     * @return 结果
     */
    @Override
    public int deleteComSeaById(Long id)
    {
        return comSeaMapper.deleteComSeaById(id);
    }
}
