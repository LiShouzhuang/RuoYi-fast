package com.ruoyi.project.customer.ComContactsOut.controller;

import java.util.List;

import com.ruoyi.project.customer.product.domain.ComProduct;
import com.ruoyi.project.customer.sea.domain.ComSea;
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
import com.ruoyi.project.customer.ComContactsOut.domain.ComContactsOut;
import com.ruoyi.project.customer.ComContactsOut.service.IComContactsOutService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 外部通讯录Controller
 * 
 * @author 李守壮
 * @date 2023-02-15
 */
@Controller
@RequestMapping("/customer/ComContactsOut")
public class ComContactsOutController extends BaseController
{
    private String prefix = "customer/ComContactsOut";

    @Autowired
    private IComContactsOutService comContactsOutService;

    @RequiresPermissions("customer:ComContactsOut:view")
    @GetMapping()
    public String ComContactsOut()
    {
        return prefix + "/ComContactsOut";
    }

    /**
     * 查询外部通讯录列表
     */
    @RequiresPermissions("customer:ComContactsOut:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ComContactsOut comContactsOut)
    {
        startPage();
        List<ComContactsOut> list = comContactsOutService.selectComContactsOutList(comContactsOut);
        return getDataTable(list);
    }

    /**
     * 导出外部通讯录列表
     */
    @RequiresPermissions("customer:ComContactsOut:export")
    @Log(title = "外部通讯录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ComContactsOut comContactsOut)
    {
        List<ComContactsOut> list = comContactsOutService.selectComContactsOutList(comContactsOut);
        ExcelUtil<ComContactsOut> util = new ExcelUtil<ComContactsOut>(ComContactsOut.class);
        return util.exportExcel(list, "外部通讯录数据");
    }

    /**
     * 新增外部通讯录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存外部通讯录
     */
    @RequiresPermissions("customer:ComContactsOut:add")
    @Log(title = "外部通讯录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ComContactsOut comContactsOut)
    {
        return toAjax(comContactsOutService.insertComContactsOut(comContactsOut));
    }

    /**
     * 修改外部通讯录
     */
    @RequiresPermissions("customer:ComContactsOut:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ComContactsOut comContactsOut = comContactsOutService.selectComContactsOutById(id);
        mmap.put("comContactsOut", comContactsOut);
        return prefix + "/edit";
    }

    /**
     * 修改保存外部通讯录
     */
    @RequiresPermissions("customer:ComContactsOut:edit")
    @Log(title = "外部通讯录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ComContactsOut comContactsOut)
    {
        return toAjax(comContactsOutService.updateComContactsOut(comContactsOut));
    }

    /**
     * 删除外部通讯录
     */
    @RequiresPermissions("customer:ComContactsOut:remove")
    @Log(title = "外部通讯录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(comContactsOutService.deleteComContactsOutByIds(ids));
    }



    /**
     * 导入数据
     */
    @Log(title = "外部通讯录", businessType = BusinessType.IMPORT)
    @RequiresPermissions("system:ComContactsOut:import")
    @PostMapping("/importData")
    @ResponseBody
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<ComContactsOut> util = new ExcelUtil<ComContactsOut>(ComContactsOut.class);
        List<ComContactsOut> list = util.importExcel(file.getInputStream());
        String message = comContactsOutService.importContactsOut(list, updateSupport);
        return AjaxResult.success(message);
    }

    /**
     * 导入-下载模版
     */
    @RequiresPermissions("customer:ComContactsOut:view")
    @GetMapping("/importTemplate")
    @ResponseBody
    public AjaxResult importTemplate()
    {
        ExcelUtil<ComContactsOut> util = new ExcelUtil<ComContactsOut>(ComContactsOut.class);
        return util.importTemplateExcel("外部通讯录数据");
    }




    /**
     * 测试插入
     */
//    @RequiresPermissions("customer:sea:testAddExtension")
    @GetMapping("/testAddExtension")
    @ResponseBody
    public AjaxResult addExtension()
    {
        ComContactsOut comContactsOut  = new ComContactsOut();
        comContactsOut.setId(Long.parseLong("11111"));
        String i = "{\"name\":\"lucy\",\"age\":18,\"love\":\"写代码\",\"education\":\"本科\"}";
        comContactsOut.setExtension(i);
        return toAjax(comContactsOutService.insertComContactsOut(comContactsOut));
    }

//    /**
//     * 测试查询
//     */
////    @RequiresPermissions("customer:sea:testAddExtension")
//    @GetMapping("/testGetExtension")
//    @ResponseBody
//    public AjaxResult getExtension()
//    {
//        ComContactsOut comContactsOut = comContactsOutService.selectComContactsOutById(Long.parseLong("8"));
//
//        comContactsOut.setExtension(i);
//        return toAjax(comContactsOutService.insertComContactsOut(comContactsOut));
//    }



}
