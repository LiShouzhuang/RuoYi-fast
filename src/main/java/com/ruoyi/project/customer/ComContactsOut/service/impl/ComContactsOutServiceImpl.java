package com.ruoyi.project.customer.ComContactsOut.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.customer.ComContactsOut.mapper.ComContactsOutMapper;
import com.ruoyi.project.customer.ComContactsOut.domain.ComContactsOut;
import com.ruoyi.project.customer.ComContactsOut.service.IComContactsOutService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 外部通讯录Service业务层处理
 * 
 * @author 李守壮
 * @date 2023-02-15
 */
@Service
public class ComContactsOutServiceImpl implements IComContactsOutService 
{
    @Autowired
    private ComContactsOutMapper comContactsOutMapper;

    /**
     * 查询外部通讯录
     * 
     * @param id 外部通讯录主键
     * @return 外部通讯录
     */
    @Override
    public ComContactsOut selectComContactsOutById(Long id)
    {
        return comContactsOutMapper.selectComContactsOutById(id);
    }

    /**
     * 查询外部通讯录列表
     * 
     * @param comContactsOut 外部通讯录
     * @return 外部通讯录
     */
    @Override
    public List<ComContactsOut> selectComContactsOutList(ComContactsOut comContactsOut)
    {
        return comContactsOutMapper.selectComContactsOutList(comContactsOut);
    }

    /**
     * 新增外部通讯录
     * 
     * @param comContactsOut 外部通讯录
     * @return 结果
     */
    @Override
    public int insertComContactsOut(ComContactsOut comContactsOut)
    {
        comContactsOut.setCreateTime(DateUtils.getNowDate());
        return comContactsOutMapper.insertComContactsOut(comContactsOut);
    }

    /**
     * 修改外部通讯录
     * 
     * @param comContactsOut 外部通讯录
     * @return 结果
     */
    @Override
    public int updateComContactsOut(ComContactsOut comContactsOut)
    {
        comContactsOut.setUpdateTime(DateUtils.getNowDate());
        return comContactsOutMapper.updateComContactsOut(comContactsOut);
    }

    /**
     * 批量删除外部通讯录
     * 
     * @param ids 需要删除的外部通讯录主键
     * @return 结果
     */
    @Override
    public int deleteComContactsOutByIds(String ids)
    {
        return comContactsOutMapper.deleteComContactsOutByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除外部通讯录信息
     * 
     * @param id 外部通讯录主键
     * @return 结果
     */
    @Override
    public int deleteComContactsOutById(Long id)
    {
        return comContactsOutMapper.deleteComContactsOutById(id);
    }
}
