package com.ruoyi.web.controller.pms.finance.inout.service.impl;

import java.util.List;

import com.ruoyi.web.controller.pms.finance.inout.domain.MoneyStatVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.web.controller.pms.finance.inout.mapper.InOutMoneyMapper;
import com.ruoyi.web.controller.pms.finance.inout.domain.InOutMoney;
import com.ruoyi.web.controller.pms.finance.inout.service.IInOutMoneyService;
import com.ruoyi.common.core.text.Convert;

/**
 * 收支明细Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-27
 */
@Service
public class InOutMoneyServiceImpl implements IInOutMoneyService 
{
    @Autowired
    private InOutMoneyMapper inOutMoneyMapper;

    /**
     * 查询收支明细
     * 
     * @param id 收支明细主键
     * @return 收支明细
     */
    @Override
    public InOutMoney selectInOutMoneyById(Long id)
    {
        return inOutMoneyMapper.selectInOutMoneyById(id);
    }

    /**
     * 查询收支明细列表
     * 
     * @param inOutMoney 收支明细
     * @return 收支明细
     */
    @Override
    public List<InOutMoney> selectInOutMoneyList(InOutMoney inOutMoney)
    {
        return inOutMoneyMapper.selectInOutMoneyList(inOutMoney);
    }

    /**
     * 新增收支明细
     * 
     * @param inOutMoney 收支明细
     * @return 结果
     */
    @Override
    public int insertInOutMoney(InOutMoney inOutMoney)
    {
        return inOutMoneyMapper.insertInOutMoney(inOutMoney);
    }

    /**
     * 修改收支明细
     * 
     * @param inOutMoney 收支明细
     * @return 结果
     */
    @Override
    public int updateInOutMoney(InOutMoney inOutMoney)
    {
        return inOutMoneyMapper.updateInOutMoney(inOutMoney);
    }

    /**
     * 批量删除收支明细
     * 
     * @param ids 需要删除的收支明细主键
     * @return 结果
     */
    @Override
    public int deleteInOutMoneyByIds(String ids)
    {
        return inOutMoneyMapper.deleteInOutMoneyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除收支明细信息
     * 
     * @param id 收支明细主键
     * @return 结果
     */
    @Override
    public int deleteInOutMoneyById(Long id)
    {
        return inOutMoneyMapper.deleteInOutMoneyById(id);
    }

    @Override
    public List<MoneyStatVo> moneyStat(InOutMoney inOutMoney) {
        return inOutMoneyMapper.moneyStat(inOutMoney);
    }
}
