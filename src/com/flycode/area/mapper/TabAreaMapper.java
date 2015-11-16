package com.flycode.area.mapper;

import com.flycode.area.entity.TabArea;
import com.flycode.area.entity.TabAreaExample;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TabAreaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_area
     *
     * @mbggenerated Thu Nov 12 13:36:25 CST 2015
     */
    int countByExample(TabAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_area
     *
     * @mbggenerated Thu Nov 12 13:36:25 CST 2015
     */
    int deleteByExample(TabAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_area
     *
     * @mbggenerated Thu Nov 12 13:36:25 CST 2015
     */
    int deleteByPrimaryKey(String infoID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_area
     *
     * @mbggenerated Thu Nov 12 13:36:25 CST 2015
     */
    int insert(TabArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_area
     *
     * @mbggenerated Thu Nov 12 13:36:25 CST 2015
     */
    int insertSelective(TabArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_area
     *
     * @mbggenerated Thu Nov 12 13:36:25 CST 2015
     */
    List<TabArea> selectByExample(TabAreaExample example);
    
    List<TabArea> selectByInfoID(HashMap<String,Object> params);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_area
     *
     * @mbggenerated Thu Nov 12 13:36:25 CST 2015
     */
    TabArea selectByPrimaryKey(String infoID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_area
     *
     * @mbggenerated Thu Nov 12 13:36:25 CST 2015
     */
    int updateByExampleSelective(@Param("record") TabArea record, @Param("example") TabAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_area
     *
     * @mbggenerated Thu Nov 12 13:36:25 CST 2015
     */
    int updateByExample(@Param("record") TabArea record, @Param("example") TabAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_area
     *
     * @mbggenerated Thu Nov 12 13:36:25 CST 2015
     */
    int updateByPrimaryKeySelective(TabArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_area
     *
     * @mbggenerated Thu Nov 12 13:36:25 CST 2015
     */
    int updateByPrimaryKey(TabArea record);
}