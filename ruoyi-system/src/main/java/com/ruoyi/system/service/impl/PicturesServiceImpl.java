package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PicturesMapper;
import com.ruoyi.system.domain.Pictures;
import com.ruoyi.system.service.IPicturesService;
import com.ruoyi.common.core.text.Convert;

/**
 * 图片信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-01-16
 */
@Service
public class PicturesServiceImpl implements IPicturesService 
{
    @Autowired
    private PicturesMapper picturesMapper;

    /**
     * 查询图片信息
     * 
     * @param id 图片信息主键
     * @return 图片信息
     */
    @Override
    public Pictures selectPicturesById(Long id)
    {
        return picturesMapper.selectPicturesById(id);
    }

    /**
     * 查询图片信息列表
     * 
     * @param pictures 图片信息
     * @return 图片信息
     */
    @Override
    public List<Pictures> selectPicturesList(Pictures pictures)
    {
        return picturesMapper.selectPicturesList(pictures);
    }

    /**
     * 新增图片信息
     * 
     * @param pictures 图片信息
     * @return 结果
     */
    @Override
    public int insertPictures(Pictures pictures)
    {
        return picturesMapper.insertPictures(pictures);
    }

    /**
     * 修改图片信息
     * 
     * @param pictures 图片信息
     * @return 结果
     */
    @Override
    public int updatePictures(Pictures pictures)
    {
        return picturesMapper.updatePictures(pictures);
    }

    /**
     * 批量删除图片信息
     * 
     * @param ids 需要删除的图片信息主键
     * @return 结果
     */
    @Override
    public int deletePicturesByIds(String ids)
    {
        return picturesMapper.deletePicturesByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除图片信息信息
     * 
     * @param id 图片信息主键
     * @return 结果
     */
    @Override
    public int deletePicturesById(Long id)
    {
        return picturesMapper.deletePicturesById(id);
    }
}
