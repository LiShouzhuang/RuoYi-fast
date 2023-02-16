package com.ruoyi.project.customer.product.controller;

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
import com.ruoyi.project.customer.product.domain.ComProduct;
import com.ruoyi.project.customer.product.service.IComProductService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 产品Controller
 * 
 * @author 李守壮
 * @date 2023-02-15
 */
@Controller
@RequestMapping("/customer/product")
public class ComProductController extends BaseController
{
    private String prefix = "customer/product";

    @Autowired
    private IComProductService comProductService;

    @RequiresPermissions("customer:product:view")
    @GetMapping()
    public String product()
    {
        return prefix + "/product";
    }

    /**
     * 查询产品列表
     */
    @RequiresPermissions("customer:product:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ComProduct comProduct)
    {
        startPage();
        List<ComProduct> list = comProductService.selectComProductList(comProduct);
        return getDataTable(list);
    }

    /**
     * 导出产品列表
     */
    @RequiresPermissions("customer:product:export")
    @Log(title = "产品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ComProduct comProduct)
    {
        List<ComProduct> list = comProductService.selectComProductList(comProduct);
        ExcelUtil<ComProduct> util = new ExcelUtil<ComProduct>(ComProduct.class);
        return util.exportExcel(list, "产品数据");
    }

    /**
     * 新增产品
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产品
     */
    @RequiresPermissions("customer:product:add")
    @Log(title = "产品", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ComProduct comProduct)
    {
        return toAjax(comProductService.insertComProduct(comProduct));
    }

    /**
     * 修改产品
     */
    @RequiresPermissions("customer:product:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ComProduct comProduct = comProductService.selectComProductById(id);
        mmap.put("comProduct", comProduct);
        return prefix + "/edit";
    }

    /**
     * 修改保存产品
     */
    @RequiresPermissions("customer:product:edit")
    @Log(title = "产品", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ComProduct comProduct)
    {
        return toAjax(comProductService.updateComProduct(comProduct));
    }

    /**
     * 删除产品
     */
    @RequiresPermissions("customer:product:remove")
    @Log(title = "产品", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(comProductService.deleteComProductByIds(ids));
    }

    /**
     * 导入数据
     */
    @Log(title = "产品", businessType = BusinessType.IMPORT)
    @RequiresPermissions("system:product:import")
    @PostMapping("/importData")
    @ResponseBody
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<ComProduct> util = new ExcelUtil<ComProduct>(ComProduct.class);
        List<ComProduct> list = util.importExcel(file.getInputStream());
        String message = comProductService.importProduct(list, updateSupport);
        return AjaxResult.success(message);
    }

    /**
     * 导入-下载模版
     */
    @RequiresPermissions("customer:product:view")
    @GetMapping("/importTemplate")
    @ResponseBody
    public AjaxResult importTemplate()
    {
        ExcelUtil<ComProduct> util = new ExcelUtil<ComProduct>(ComProduct.class);
        return util.importTemplateExcel("产品数据");
    }
}
