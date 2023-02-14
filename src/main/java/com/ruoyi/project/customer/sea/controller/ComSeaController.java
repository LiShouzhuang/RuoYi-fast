package com.ruoyi.project.customer.sea.controller;

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
import com.ruoyi.project.customer.sea.domain.ComSea;
import com.ruoyi.project.customer.sea.service.IComSeaService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 客户公海Controller
 * 
 * @author 李守壮
 * @date 2023-02-14
 */
@Controller
@RequestMapping("/customer/sea")
public class ComSeaController extends BaseController
{
    private String prefix = "customer/sea";

    @Autowired
    private IComSeaService comSeaService;

    @RequiresPermissions("customer:sea:view")
    @GetMapping()
    public String sea()
    {
        return prefix + "/sea";
    }

    /**
     * 查询客户公海列表
     */
    @RequiresPermissions("customer:sea:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ComSea comSea)
    {
        startPage();
        List<ComSea> list = comSeaService.selectComSeaList(comSea);
        return getDataTable(list);
    }

    /**
     * 导出客户公海列表
     */
    @RequiresPermissions("customer:sea:export")
    @Log(title = "客户公海", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ComSea comSea)
    {
        List<ComSea> list = comSeaService.selectComSeaList(comSea);
        ExcelUtil<ComSea> util = new ExcelUtil<ComSea>(ComSea.class);
        return util.exportExcel(list, "客户公海数据");
    }

    /**
     * 新增客户公海
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存客户公海
     */
    @RequiresPermissions("customer:sea:add")
    @Log(title = "客户公海", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ComSea comSea)
    {
        return toAjax(comSeaService.insertComSea(comSea));
    }

    /**
     * 修改客户公海
     */
    @RequiresPermissions("customer:sea:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ComSea comSea = comSeaService.selectComSeaById(id);
        mmap.put("comSea", comSea);
        return prefix + "/edit";
    }

    /**
     * 修改保存客户公海
     */
    @RequiresPermissions("customer:sea:edit")
    @Log(title = "客户公海", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ComSea comSea)
    {
        return toAjax(comSeaService.updateComSea(comSea));
    }

    /**
     * 删除客户公海
     */
    @RequiresPermissions("customer:sea:remove")
    @Log(title = "客户公海", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(comSeaService.deleteComSeaByIds(ids));
    }
}
