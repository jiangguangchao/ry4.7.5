package com.ruoyi.web.controller.pms.finance.inout.controller;

import java.util.List;

import com.ruoyi.web.controller.pms.finance.inout.domain.MoneyStatVo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.web.controller.pms.finance.inout.domain.InOutMoney;
import com.ruoyi.web.controller.pms.finance.inout.service.IInOutMoneyService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 收支明细Controller
 * 
 * @author ruoyi
 * @date 2022-11-27
 */
@Controller
@RequestMapping("/finance/inOutMoney")
public class InOutMoneyController extends BaseController
{
    private String prefix = "finance/inOutMoney";

    @Autowired
    private IInOutMoneyService inOutMoneyService;

    @RequiresPermissions("finance:inOutMoney:view")
    @GetMapping()
    public String inOutMoney()
    {
        return prefix + "/inOutMoney";
    }

    /**
     * 查询收支明细列表
     */
    @RequiresPermissions("finance:inOutMoney:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InOutMoney inOutMoney)
    {
        startPage();
        List<InOutMoney> list = inOutMoneyService.selectInOutMoneyList(inOutMoney);
        return getDataTable(list);
    }

    /**
     * 导出收支明细列表
     */
    @RequiresPermissions("finance:inOutMoney:export")
    @Log(title = "收支明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InOutMoney inOutMoney)
    {
        List<InOutMoney> list = inOutMoneyService.selectInOutMoneyList(inOutMoney);
        ExcelUtil<InOutMoney> util = new ExcelUtil<InOutMoney>(InOutMoney.class);
        return util.exportExcel(list, "收支明细数据");
    }

    /**
     * 新增收支明细
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存收支明细
     */
    @RequiresPermissions("finance:inOutMoney:add")
    @Log(title = "收支明细", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InOutMoney inOutMoney)
    {
        return toAjax(inOutMoneyService.insertInOutMoney(inOutMoney));
    }

    /**
     * 修改收支明细
     */
    @RequiresPermissions("finance:inOutMoney:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        InOutMoney inOutMoney = inOutMoneyService.selectInOutMoneyById(id);
        mmap.put("inOutMoney", inOutMoney);
        return prefix + "/edit";
    }

    /**
     * 修改保存收支明细
     */
    @RequiresPermissions("finance:inOutMoney:edit")
    @Log(title = "收支明细", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InOutMoney inOutMoney)
    {
        return toAjax(inOutMoneyService.updateInOutMoney(inOutMoney));
    }

    /**
     * 删除收支明细
     */
    @RequiresPermissions("finance:inOutMoney:remove")
    @Log(title = "收支明细", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(inOutMoneyService.deleteInOutMoneyByIds(ids));
    }

    @RequiresPermissions("finance:inOutMoney:statView")
    @GetMapping("/statView")
    public String statView()
    {
        return prefix + "/moneyStat";
    }


    @RequiresPermissions("finance:inOutMoney:statView")
    @PostMapping("/stat")
    @ResponseBody
    public TableDataInfo stat(InOutMoney inOutMoney)
    {
        List<MoneyStatVo> moneyStatVos = inOutMoneyService.moneyStat(inOutMoney);
        return getDataTable(moneyStatVos);
    }
}
