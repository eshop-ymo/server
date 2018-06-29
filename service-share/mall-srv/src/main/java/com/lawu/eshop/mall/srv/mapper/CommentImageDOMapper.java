package com.lawu.eshop.mall.srv.mapper;

import com.lawu.eshop.mall.srv.domain.CommentImageDO;
import com.lawu.eshop.mall.srv.domain.CommentImageDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CommentImageDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment_image
     *
     * @mbg.generated
     */
    int countByExample(CommentImageDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment_image
     *
     * @mbg.generated
     */
    int deleteByExample(CommentImageDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment_image
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment_image
     *
     * @mbg.generated
     */
    int insert(CommentImageDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment_image
     *
     * @mbg.generated
     */
    int insertSelective(CommentImageDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment_image
     *
     * @mbg.generated
     */
    List<CommentImageDO> selectByExampleWithRowbounds(CommentImageDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment_image
     *
     * @mbg.generated
     */
    List<CommentImageDO> selectByExample(CommentImageDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment_image
     *
     * @mbg.generated
     */
    CommentImageDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment_image
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CommentImageDO record, @Param("example") CommentImageDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment_image
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CommentImageDO record, @Param("example") CommentImageDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment_image
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CommentImageDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment_image
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CommentImageDO record);
}