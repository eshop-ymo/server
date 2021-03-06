package com.lawu.eshop.user.srv.mapper;

import com.lawu.eshop.user.srv.domain.MerchantDO;
import com.lawu.eshop.user.srv.domain.MerchantDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MerchantDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbg.generated
     */
    int countByExample(MerchantDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbg.generated
     */
    int deleteByExample(MerchantDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbg.generated
     */
    int insert(MerchantDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbg.generated
     */
    int insertSelective(MerchantDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbg.generated
     */
    List<MerchantDO> selectByExampleWithRowbounds(MerchantDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbg.generated
     */
    List<MerchantDO> selectByExample(MerchantDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbg.generated
     */
    MerchantDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MerchantDO record, @Param("example") MerchantDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MerchantDO record, @Param("example") MerchantDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MerchantDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MerchantDO record);
}