package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Pictures;

/**
 * 图片信息Service接口
 * 
 * @author ruoyi
 * @date 2023-01-16
 */
public interface IPicturesService 
{
    /**
     * 查询图片信息
     * 
     * @param id 图片信息主键
     * @return 图片信息
     */
    public Pictures selectPicturesById(Long id);

    /**
     * 查询图片信息列表
     * 
     * @param pictures 图片信息
     * @return 图片信息集合
     */
    public List<Pictures> selectPicturesList(Pictures pictures);

    /**
     * 新增图片信息
     * 
     * @param pictures 图片信息
     * @return 结果
     */
    public int insertPictures(Pictures pictures);

    /**
     * 修改图片信息
     * 
     * @param pictures 图片信息
     * @return 结果
     */
    public int updatePictures(Pictures pictures);

    /**
     * 批量删除图片信息
     * 
     * @param ids 需要删除的图片信息主键集合
     * @return 结果
     */
    public int deletePicturesByIds(String ids);

    /**
     * 删除图片信息信息
     * 
     * @param id 图片信息主键
     * @return 结果
     */
    public int deletePicturesById(Long id);
}
