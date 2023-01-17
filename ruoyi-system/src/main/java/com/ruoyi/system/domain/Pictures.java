package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 图片信息对象 pictures
 * 
 * @author ruoyi
 * @date 2023-01-16
 */
public class Pictures extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /**
     * 所属id
     * 所属id 是 关联当前图片绑定了那条支出明细。当前只有支出表会有图片，
     * 如果后期其他表也需要上传图片，所属id就会重复，所以用下面的图片类型
     * 来区分是关联的哪个表
     */
    @Excel(name = "所属id")
    private Long belongId;

    /**
     * 图片类型
     * 关联哪张表，现在只有支出明细表  也就是 in_out: 支出明细表
     */
    @Excel(name = "图片类型")
    private String type;

    /** 图片保存路径 */
    @Excel(name = "图片保存路径")
    private String picPath;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setBelongId(Long belongId) 
    {
        this.belongId = belongId;
    }

    public Long getBelongId() 
    {
        return belongId;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setPicPath(String picPath) 
    {
        this.picPath = picPath;
    }

    public String getPicPath() 
    {
        return picPath;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("belongId", getBelongId())
            .append("type", getType())
            .append("picPath", getPicPath())
            .toString();
    }
}
