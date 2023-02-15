package com.ruoyi.project.customer.ComContactsOut.controller;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.project.customer.mapping.domain.ComContactsKeyValueMapping;
import com.ruoyi.project.customer.mapping.service.IComContactsKeyValueMappingService;
import com.ruoyi.project.customer.product.domain.ComProduct;
import com.ruoyi.project.customer.sea.domain.ComSea;
import com.ruoyi.project.tool.gen.domain.GenTable;
import com.ruoyi.project.tool.gen.util.VelocityInitializer;
import com.ruoyi.project.tool.gen.util.VelocityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
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

    @Autowired
    private IComContactsKeyValueMappingService comContactsKeyValueMappingService;

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
    @GetMapping("/testAddExtension/{extension}")
    @ResponseBody
    public AjaxResult addExtension(@PathVariable("extension") String extension)
    {
        ComContactsOut comContactsOut  = new ComContactsOut();
        comContactsOut.setPhone("888");
        comContactsOut.setExtension(extension);
        return toAjax(comContactsOutService.insertComContactsOut(comContactsOut));
    }

    /**
     * 测试查询
     */
//    @RequiresPermissions("customer:sea:testAddExtension")
    @GetMapping("/testGetExtension/{phone}")
    @ResponseBody
    public AjaxResult getExtension(@PathVariable("phone") String phone)
    {
        ComContactsOut comContactsOut = comContactsOutService.selectComContactsOutByPhone(phone);
        String extension = comContactsOut.getExtension();
        String tableName = "com_contacts_out";
        JSON json = JSON.parseObject(extension);
        JSONObject jsonObject = JSONObject.parseObject(extension);
        if (StringUtils.isEmpty(json.toString())){
            AjaxResult.success("没有扩展字段，json体为空");
        }
        List<ComContactsKeyValueMapping> mappingList = comContactsKeyValueMappingService.selectComContactsKeyValueMappingByTableName(tableName);
        if (0==mappingList.size()){
            AjaxResult.success("没有扩展字段，mappingList体为空");
        }

        Map<String, String> dataMap = new HashMap<>();
        String handler_string ="";
        for (ComContactsKeyValueMapping list:mappingList){
            String mappingKey = list.getMappingKey();
            String mappingValue = list.getMappingValue();
            String value = jsonObject.getString(mappingKey);
            handler_string += "【"+mappingKey+"】" +mappingValue+":"+value;
        }

        System.out.println(handler_string);
        return  AjaxResult.success("成功        ：           "+handler_string);
    }

/*


    @Override
    public Map<String, String> previewCode(Long tableId)
    {
        Map<String, String> dataMap = new LinkedHashMap<>();
        // 查询表信息
        GenTable table = genTableMapper.selectGenTableById(tableId);
        // 设置主子表信息
        setSubTable(table);
        // 设置主键列信息
        setPkColumn(table);
        VelocityInitializer.initVelocity();

        VelocityContext context = VelocityUtils.prepareContext(table);

        // 获取模板列表
        List<String> templates = VelocityUtils.getTemplateList(table.getTplCategory());
        for (String template : templates)
        {
            // 渲染模板
            StringWriter sw = new StringWriter();
            Template tpl = Velocity.getTemplate(template, Constants.UTF8);
            tpl.merge(context, sw);
            dataMap.put(template, sw.toString());
        }
        return dataMap;
    }
*/




}
