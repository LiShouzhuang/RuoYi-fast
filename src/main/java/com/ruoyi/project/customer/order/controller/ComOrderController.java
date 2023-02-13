package com.ruoyi.project.customer.order.controller;

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
import com.ruoyi.project.customer.order.domain.ComOrder;
import com.ruoyi.project.customer.order.service.IComOrderService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 订单Controller
 * 
 * @author 李守壮
 * @date 2023-02-13
 */
@Controller
@RequestMapping("/customer/order")
public class ComOrderController extends BaseController
{
    private String prefix = "customer/order";

    @Autowired
    private IComOrderService comOrderService;

    @RequiresPermissions("customer:order:view")
    @GetMapping()
    public String order()
    {
        return prefix + "/order";
    }

    /**
     * 查询订单列表
     */
    @RequiresPermissions("customer:order:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ComOrder comOrder)
    {
        startPage();
        List<ComOrder> list = comOrderService.selectComOrderList(comOrder);
        return getDataTable(list);
    }

    /**
     * 导出订单列表
     */
    @RequiresPermissions("customer:order:export")
    @Log(title = "订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ComOrder comOrder)
    {
        List<ComOrder> list = comOrderService.selectComOrderList(comOrder);
        ExcelUtil<ComOrder> util = new ExcelUtil<ComOrder>(ComOrder.class);
        return util.exportExcel(list, "订单数据");
    }

    /**
     * 新增订单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存订单
     */
    @RequiresPermissions("customer:order:add")
    @Log(title = "订单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ComOrder comOrder)
    {
        return toAjax(comOrderService.insertComOrder(comOrder));
    }

    /**
     * 修改订单
     */
    @RequiresPermissions("customer:order:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ComOrder comOrder = comOrderService.selectComOrderById(id);
        mmap.put("comOrder", comOrder);
        return prefix + "/edit";
    }

    /**
     * 修改保存订单
     */
    @RequiresPermissions("customer:order:edit")
    @Log(title = "订单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ComOrder comOrder)
    {
        return toAjax(comOrderService.updateComOrder(comOrder));
    }

    /**
     * 删除订单
     */
    @RequiresPermissions("customer:order:remove")
    @Log(title = "订单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(comOrderService.deleteComOrderByIds(ids));
    }
}
