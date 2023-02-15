package com.ruoyi.project.customer.contract.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.customer.contract.mapper.ComContractMapper;
import com.ruoyi.project.customer.contract.domain.ComContract;
import com.ruoyi.project.customer.contract.service.IComContractService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 合同Service业务层处理
 * 
 * @author 李守壮
 * @date 2023-02-15
 */
@Service
public class ComContractServiceImpl implements IComContractService 
{
    @Autowired
    private ComContractMapper comContractMapper;

    /**
     * 查询合同
     * 
     * @param id 合同主键
     * @return 合同
     */
    @Override
    public ComContract selectComContractById(Long id)
    {
        return comContractMapper.selectComContractById(id);
    }

    /**
     * 查询合同列表
     * 
     * @param comContract 合同
     * @return 合同
     */
    @Override
    public List<ComContract> selectComContractList(ComContract comContract)
    {
        return comContractMapper.selectComContractList(comContract);
    }

    /**
     * 新增合同
     * 
     * @param comContract 合同
     * @return 结果
     */
    @Override
    public int insertComContract(ComContract comContract)
    {
        comContract.setCreateTime(DateUtils.getNowDate());
        return comContractMapper.insertComContract(comContract);
    }

    /**
     * 修改合同
     * 
     * @param comContract 合同
     * @return 结果
     */
    @Override
    public int updateComContract(ComContract comContract)
    {
        comContract.setUpdateTime(DateUtils.getNowDate());
        return comContractMapper.updateComContract(comContract);
    }

    /**
     * 批量删除合同
     * 
     * @param ids 需要删除的合同主键
     * @return 结果
     */
    @Override
    public int deleteComContractByIds(String ids)
    {
        return comContractMapper.deleteComContractByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除合同信息
     * 
     * @param id 合同主键
     * @return 结果
     */
    @Override
    public int deleteComContractById(Long id)
    {
        return comContractMapper.deleteComContractById(id);
    }
}
