package com.flycode.readrec.mapper;

import com.flycode.readrec.entity.TabReadRec;
import com.flycode.readrec.entity.TabReadRecExample;
import java.util.List;

public interface TabReadRecMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_readRec1511
     *
     * @mbggenerated Wed Nov 11 16:36:15 CST 2015
     */
    int deleteByPrimaryKey(Integer infoID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_readRec1511
     *
     * @mbggenerated Wed Nov 11 16:36:15 CST 2015
     */
    int insert(TabReadRec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_readRec1511
     *
     * @mbggenerated Wed Nov 11 16:36:15 CST 2015
     */
    int insertSelective(TabReadRec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_readRec1511
     *
     * @mbggenerated Wed Nov 11 16:36:15 CST 2015
     */
    List<TabReadRec> selectByExample(TabReadRecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_readRec1511
     *
     * @mbggenerated Wed Nov 11 16:36:15 CST 2015
     */
    TabReadRec selectByPrimaryKey(Integer infoID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_readRec1511
     *
     * @mbggenerated Wed Nov 11 16:36:15 CST 2015
     */
    int updateByPrimaryKeySelective(TabReadRec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_readRec1511
     *
     * @mbggenerated Wed Nov 11 16:36:15 CST 2015
     */
    int updateByPrimaryKey(TabReadRec record);
}