package com.ruoyi.project.customer.contacts.controller;

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
import com.ruoyi.project.customer.contacts.domain.ComContacts;
import com.ruoyi.project.customer.contacts.service.IComContactsService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 联系人Controller
 * 
 * @author 李守壮
 * @date 2023-02-13
 */
@Controller
@RequestMapping("/customer/contacts")
public class ComContactsController extends BaseController
{
    private String prefix = "customer/contacts";

    @Autowired
    private IComContactsService comContactsService;

    @RequiresPermissions("customer:contacts:view")
    @GetMapping()
    public String contacts()
    {
        return prefix + "/contacts";
    }

    /**
     * 查询联系人列表
     */
    @RequiresPermissions("customer:contacts:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ComContacts comContacts)
    {
        startPage();
        List<ComContacts> list = comContactsService.selectComContactsList(comContacts);
        return getDataTable(list);
    }

    /**
     * 导出联系人列表
     */
    @RequiresPermissions("customer:contacts:export")
    @Log(title = "联系人", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ComContacts comContacts)
    {
        List<ComContacts> list = comContactsService.selectComContactsList(comContacts);
        ExcelUtil<ComContacts> util = new ExcelUtil<ComContacts>(ComContacts.class);
        return util.exportExcel(list, "联系人数据");
    }

    /**
     * 新增联系人
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存联系人
     */
    @RequiresPermissions("customer:contacts:add")
    @Log(title = "联系人", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ComContacts comContacts)
    {
        return toAjax(comContactsService.insertComContacts(comContacts));
    }

    /**
     * 修改联系人
     */
    @RequiresPermissions("customer:contacts:edit")
    @GetMapping("/edit/{contactsId}")
    public String edit(@PathVariable("contactsId") Long contactsId, ModelMap mmap)
    {
        ComContacts comContacts = comContactsService.selectComContactsByContactsId(contactsId);
        mmap.put("comContacts", comContacts);
        return prefix + "/edit";
    }

    /**
     * 修改保存联系人
     */
    @RequiresPermissions("customer:contacts:edit")
    @Log(title = "联系人", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ComContacts comContacts)
    {
        return toAjax(comContactsService.updateComContacts(comContacts));
    }

    /**
     * 删除联系人
     */
    @RequiresPermissions("customer:contacts:remove")
    @Log(title = "联系人", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(comContactsService.deleteComContactsByContactsIds(ids));
    }
}
