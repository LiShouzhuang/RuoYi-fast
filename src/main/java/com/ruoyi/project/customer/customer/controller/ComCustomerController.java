package com.ruoyi.project.customer.customer.controller;

import java.util.ArrayList;
import java.util.List;

import com.ruoyi.project.system.user.domain.User;
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
import com.ruoyi.project.customer.customer.domain.ComCustomer;
import com.ruoyi.project.customer.customer.service.IComCustomerService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 客户Controller
 * 
 * @author 李守壮
 * @date 2023-02-13
 */
@Controller
@RequestMapping("/customer/customer")
public class ComCustomerController extends BaseController
{
    private String prefix = "customer/customer";

    @Autowired
    private IComCustomerService comCustomerService;

    @RequiresPermissions("customer:customer:view")
    @GetMapping()
    public String customer()
    {
        return prefix + "/customer";
    }


    /**
     * 查询单个客户
     */
    @RequiresPermissions("customer:customer:detail")
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Long id, ModelMap mmap)
    {
        ComCustomer comCustomer = comCustomerService.selectComCustomerById(id);
        mmap.put("comCustomer", comCustomer);
        return prefix + "/detail";
    }


    /**
     * 查询客户列表
     */
    @RequiresPermissions("customer:customer:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ComCustomer comCustomer)
    {
        startPage();
        List<ComCustomer> list = comCustomerService.selectComCustomerList(comCustomer);
        return getDataTable(list);
    }

    /**
     * 导出客户列表
     */
    @RequiresPermissions("customer:customer:export")
    @Log(title = "客户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ComCustomer comCustomer)
    {
        List<ComCustomer> list = comCustomerService.selectComCustomerList(comCustomer);
        ExcelUtil<ComCustomer> util = new ExcelUtil<ComCustomer>(ComCustomer.class);
        return util.exportExcel(list, "客户数据");
    }

    /**
     * 新增客户
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存客户
     */
    @RequiresPermissions("customer:customer:add")
    @Log(title = "客户", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ComCustomer comCustomer)
    {
        return toAjax(comCustomerService.insertComCustomer(comCustomer));
    }

    /**
     * 修改客户
     */
    @RequiresPermissions("customer:customer:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ComCustomer comCustomer = comCustomerService.selectComCustomerById(id);
        mmap.put("comCustomer", comCustomer);
        return prefix + "/edit";
    }

    /**
     * 修改保存客户
     */
    @RequiresPermissions("customer:customer:edit")
    @Log(title = "客户", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ComCustomer comCustomer)
    {
        return toAjax(comCustomerService.updateComCustomer(comCustomer));
    }

    /**
     * 删除客户
     */
    @RequiresPermissions("customer:customer:remove")
    @Log(title = "客户", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(comCustomerService.deleteComCustomerByIds(ids));
    }



    /**
     * 导入数据
     */
    @Log(title = "用户管理", businessType = BusinessType.IMPORT)
    @RequiresPermissions("system:user:import")
    @PostMapping("/importData")
    @ResponseBody
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<ComCustomer> util = new ExcelUtil<ComCustomer>(ComCustomer.class);
        List<ComCustomer> customerList = util.importExcel(file.getInputStream());
        String message = comCustomerService.importCustomer(customerList, updateSupport);
        return AjaxResult.success(message);
    }

    /**
    * 导入-下载模版
    */
    @RequiresPermissions("customer:customer:view")
    @GetMapping("/importTemplate")
    @ResponseBody
    public AjaxResult importTemplate()
    {
        ExcelUtil<ComCustomer> util = new ExcelUtil<ComCustomer>(ComCustomer.class);
        return util.importTemplateExcel("客户数据");
    }
}
