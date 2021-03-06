package com.lawu.eshop.property.srv.mapper;

import com.lawu.eshop.property.srv.domain.IncomeDailySummaryDO;
import com.lawu.eshop.property.srv.domain.IncomeDailySummaryDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface IncomeDailySummaryDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income_daily_summary
     *
     * @mbg.generated
     */
    long countByExample(IncomeDailySummaryDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income_daily_summary
     *
     * @mbg.generated
     */
    int deleteByExample(IncomeDailySummaryDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income_daily_summary
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income_daily_summary
     *
     * @mbg.generated
     */
    int insert(IncomeDailySummaryDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income_daily_summary
     *
     * @mbg.generated
     */
    int insertSelective(IncomeDailySummaryDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income_daily_summary
     *
     * @mbg.generated
     */
    List<IncomeDailySummaryDO> selectByExampleWithRowbounds(IncomeDailySummaryDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income_daily_summary
     *
     * @mbg.generated
     */
    List<IncomeDailySummaryDO> selectByExample(IncomeDailySummaryDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income_daily_summary
     *
     * @mbg.generated
     */
    IncomeDailySummaryDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income_daily_summary
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") IncomeDailySummaryDO record, @Param("example") IncomeDailySummaryDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income_daily_summary
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") IncomeDailySummaryDO record, @Param("example") IncomeDailySummaryDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income_daily_summary
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(IncomeDailySummaryDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income_daily_summary
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(IncomeDailySummaryDO record);
}