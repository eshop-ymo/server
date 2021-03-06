package com.lawu.eshop.statistics.srv.mapper;

import com.lawu.eshop.statistics.srv.domain.ReportAreaWithdrawDailyDO;
import com.lawu.eshop.statistics.srv.domain.ReportAreaWithdrawDailyDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ReportAreaWithdrawDailyDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_withdraw_daily
     *
     * @mbg.generated
     */
    int countByExample(ReportAreaWithdrawDailyDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_withdraw_daily
     *
     * @mbg.generated
     */
    int deleteByExample(ReportAreaWithdrawDailyDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_withdraw_daily
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_withdraw_daily
     *
     * @mbg.generated
     */
    int insert(ReportAreaWithdrawDailyDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_withdraw_daily
     *
     * @mbg.generated
     */
    int insertSelective(ReportAreaWithdrawDailyDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_withdraw_daily
     *
     * @mbg.generated
     */
    List<ReportAreaWithdrawDailyDO> selectByExampleWithRowbounds(ReportAreaWithdrawDailyDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_withdraw_daily
     *
     * @mbg.generated
     */
    List<ReportAreaWithdrawDailyDO> selectByExample(ReportAreaWithdrawDailyDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_withdraw_daily
     *
     * @mbg.generated
     */
    ReportAreaWithdrawDailyDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_withdraw_daily
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ReportAreaWithdrawDailyDO record, @Param("example") ReportAreaWithdrawDailyDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_withdraw_daily
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ReportAreaWithdrawDailyDO record, @Param("example") ReportAreaWithdrawDailyDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_withdraw_daily
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ReportAreaWithdrawDailyDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_withdraw_daily
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ReportAreaWithdrawDailyDO record);
}