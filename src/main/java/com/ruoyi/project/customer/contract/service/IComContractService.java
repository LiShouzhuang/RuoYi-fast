package com.ruoyi.project.customer.contract.service;

import java.util.List;
import com.ruoyi.project.customer.contract.domain.ComContract;

/**
 * 合同Service接口
 * 
 * @author 李守壮
 * @date 2023-02-15
 */
public interface IComContractService 
{
    /**
     * 查询合同
     * 
     * @param id 合同主键
     * @return 合同
     */
    public ComContract selectComContractById(Long id);

    /**
     * 查询合同列表
     * 
     * @param comContract 合同
     * @return 合同集合
     */
    public List<ComContract> selectComContractList(ComContract comContract);

    /**
     * 新增合同
     * 
     * @param comContract 合同
     * @return 结果
     */
    public int insertComContract(ComContract comContract);

    /**
     * 修改合同
     * 
     * @param comContract 合同
     * @return 结果
     */
    public int updateComContract(ComContract comContract);

    /**
     * 批量删除合同
     * 
     * @param ids 需要删除的合同主键集合
     * @return 结果
     */
    public int deleteComContractByIds(String ids);

    /**
     * 删除合同信息
     * 
     * @param id 合同主键
     * @return 结果
     */
    public int deleteComContractById(Long id);
}