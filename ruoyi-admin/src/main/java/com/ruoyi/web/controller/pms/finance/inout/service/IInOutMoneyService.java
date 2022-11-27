package com.ruoyi.web.controller.pms.finance.inout.service;

import java.util.List;
import com.ruoyi.web.controller.pms.finance.inout.domain.InOutMoney;

/**
 * 收支明细Service接口
 * 
 * @author ruoyi
 * @date 2022-11-27
 */
public interface IInOutMoneyService 
{
    /**
     * 查询收支明细
     * 
     * @param id 收支明细主键
     * @return 收支明细
     */
    public InOutMoney selectInOutMoneyById(Long id);

    /**
     * 查询收支明细列表
     * 
     * @param inOutMoney 收支明细
     * @return 收支明细集合
     */
    public List<InOutMoney> selectInOutMoneyList(InOutMoney inOutMoney);

    /**
     * 新增收支明细
     * 
     * @param inOutMoney 收支明细
     * @return 结果
     */
    public int insertInOutMoney(InOutMoney inOutMoney);

    /**
     * 修改收支明细
     * 
     * @param inOutMoney 收支明细
     * @return 结果
     */
    public int updateInOutMoney(InOutMoney inOutMoney);

    /**
     * 批量删除收支明细
     * 
     * @param ids 需要删除的收支明细主键集合
     * @return 结果
     */
    public int deleteInOutMoneyByIds(String ids);

    /**
     * 删除收支明细信息
     * 
     * @param id 收支明细主键
     * @return 结果
     */
    public int deleteInOutMoneyById(Long id);
}
