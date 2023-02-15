package com.ruoyi.project.customer.contract.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.customer.contract.domain.ComContract;
import com.ruoyi.project.customer.contract.service.IComContractService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 合同Controller
 * 
 * @author 李守壮
 * @date 2023-02-15
 */
@Controller
@RequestMapping("/customer/contract")
public class ComContractController extends BaseController
{
    private String prefix = "customer/contract";

    @Autowired
    private IComContractService comContractService;

    @RequiresPermissions("customer:contract:view")
    @GetMapping()
    public String contract()
    {
        return prefix + "/contract";
    }

    /**
     * 查询合同列表
     */
    @RequiresPermissions("customer:contract:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ComContract comContract)
    {
        startPage();
        List<ComContract> list = comContractService.selectComContractList(comContract);
        return getDataTable(list);
    }

    /**
     * 导出合同列表
     */
    @RequiresPermissions("customer:contract:export")
    @Log(title = "合同", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ComContract comContract)
    {
        List<ComContract> list = comContractService.selectComContractList(comContract);
        ExcelUtil<ComContract> util = new ExcelUtil<ComContract>(ComContract.class);
        return util.exportExcel(list, "合同数据");
    }

    /**
     * 新增合同
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存合同
     */
    @RequiresPermissions("customer:contract:add")
    @Log(title = "合同", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ComContract comContract)
    {
        return toAjax(comContractService.insertComContract(comContract));
    }

    /**
     * 修改合同
     */
    @RequiresPermissions("customer:contract:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ComContract comContract = comContractService.selectComContractById(id);
        mmap.put("comContract", comContract);
        return prefix + "/edit";
    }

    /**
     * 修改保存合同
     */
    @RequiresPermissions("customer:contract:edit")
    @Log(title = "合同", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ComContract comContract)
    {
        return toAjax(comContractService.updateComContract(comContract));
    }

    /**
     * 删除合同
     */
    @RequiresPermissions("customer:contract:remove")
    @Log(title = "合同", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(comContractService.deleteComContractByIds(ids));
    }
}
