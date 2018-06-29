package com.lawu.eshop.product.srv.domain;

import java.io.Serializable;
import java.util.Date;

public class RecommendProductCategoryDO implements Serializable {
    /**
     *
     * 主键
     * recommend_product_category.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 分类ID
     * recommend_product_category.category_id
     *
     * @mbg.generated
     */
    private Integer categoryId;

    /**
     *
     * 名称
     * recommend_product_category.category_name
     *
     * @mbg.generated
     */
    private String categoryName;

    /**
     *
     * 分类图标
     * recommend_product_category.image_path
     *
     * @mbg.generated
     */
    private String imagePath;

    /**
     *
     * 是否可见,0否 1是
     * recommend_product_category.isvisible
     *
     * @mbg.generated
     */
    private Boolean isvisible;

    /**
     *
     * 排序，小的排前面
     * recommend_product_category.ordinal
     *
     * @mbg.generated
     */
    private Byte ordinal;

    /**
     *
     * 是否热门
     * recommend_product_category.is_hot
     *
     * @mbg.generated
     */
    private Boolean isHot;

    /**
     *
     * 创建时间
     * recommend_product_category.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table recommend_product_category
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recommend_product_category.id
     *
     * @return the value of recommend_product_category.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recommend_product_category.id
     *
     * @param id the value for recommend_product_category.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recommend_product_category.category_id
     *
     * @return the value of recommend_product_category.category_id
     *
     * @mbg.generated
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recommend_product_category.category_id
     *
     * @param categoryId the value for recommend_product_category.category_id
     *
     * @mbg.generated
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recommend_product_category.category_name
     *
     * @return the value of recommend_product_category.category_name
     *
     * @mbg.generated
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recommend_product_category.category_name
     *
     * @param categoryName the value for recommend_product_category.category_name
     *
     * @mbg.generated
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recommend_product_category.image_path
     *
     * @return the value of recommend_product_category.image_path
     *
     * @mbg.generated
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recommend_product_category.image_path
     *
     * @param imagePath the value for recommend_product_category.image_path
     *
     * @mbg.generated
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recommend_product_category.isvisible
     *
     * @return the value of recommend_product_category.isvisible
     *
     * @mbg.generated
     */
    public Boolean getIsvisible() {
        return isvisible;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recommend_product_category.isvisible
     *
     * @param isvisible the value for recommend_product_category.isvisible
     *
     * @mbg.generated
     */
    public void setIsvisible(Boolean isvisible) {
        this.isvisible = isvisible;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recommend_product_category.ordinal
     *
     * @return the value of recommend_product_category.ordinal
     *
     * @mbg.generated
     */
    public Byte getOrdinal() {
        return ordinal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recommend_product_category.ordinal
     *
     * @param ordinal the value for recommend_product_category.ordinal
     *
     * @mbg.generated
     */
    public void setOrdinal(Byte ordinal) {
        this.ordinal = ordinal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recommend_product_category.is_hot
     *
     * @return the value of recommend_product_category.is_hot
     *
     * @mbg.generated
     */
    public Boolean getIsHot() {
        return isHot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recommend_product_category.is_hot
     *
     * @param isHot the value for recommend_product_category.is_hot
     *
     * @mbg.generated
     */
    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recommend_product_category.gmt_create
     *
     * @return the value of recommend_product_category.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recommend_product_category.gmt_create
     *
     * @param gmtCreate the value for recommend_product_category.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}