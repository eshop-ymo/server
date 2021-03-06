package com.lawu.eshop.product.srv.domain;

import java.io.Serializable;

public class ProductCategoryeDO implements Serializable {
    /**
     *
     * 主键
     * product_category.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * 商品分类名称
     * product_category.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * 父类
     * product_category.parent_id
     *
     * @mbg.generated
     */
    private Integer parentId;

    /**
     *
     * 家族图谱
     * product_category.path
     *
     * @mbg.generated
     */
    private String path;

    /**
     *
     * 等级
     * product_category.level
     *
     * @mbg.generated
     */
    private Byte level;

    /**
     *
     * 图标
     * product_category.image_url
     *
     * @mbg.generated
     */
    private String imageUrl;

    /**
     *
     * 顺序排序
     * product_category.ordinal
     *
     * @mbg.generated
     */
    private Byte ordinal;

    /**
     *
     * 0隐藏1显示
     * product_category.statue
     *
     * @mbg.generated
     */
    private Boolean statue;

    /**
     *
     * 1热门分类0默认
     * product_category.type
     *
     * @mbg.generated
     */
    private Byte type;

    /**
     *
     * 是否虚拟商品,0否 1是
     * product_category.is_virtual
     *
     * @mbg.generated
     */
    private Boolean isVirtual;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_category
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.id
     *
     * @return the value of product_category.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.id
     *
     * @param id the value for product_category.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.name
     *
     * @return the value of product_category.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.name
     *
     * @param name the value for product_category.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.parent_id
     *
     * @return the value of product_category.parent_id
     *
     * @mbg.generated
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.parent_id
     *
     * @param parentId the value for product_category.parent_id
     *
     * @mbg.generated
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.path
     *
     * @return the value of product_category.path
     *
     * @mbg.generated
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.path
     *
     * @param path the value for product_category.path
     *
     * @mbg.generated
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.level
     *
     * @return the value of product_category.level
     *
     * @mbg.generated
     */
    public Byte getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.level
     *
     * @param level the value for product_category.level
     *
     * @mbg.generated
     */
    public void setLevel(Byte level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.image_url
     *
     * @return the value of product_category.image_url
     *
     * @mbg.generated
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.image_url
     *
     * @param imageUrl the value for product_category.image_url
     *
     * @mbg.generated
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.ordinal
     *
     * @return the value of product_category.ordinal
     *
     * @mbg.generated
     */
    public Byte getOrdinal() {
        return ordinal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.ordinal
     *
     * @param ordinal the value for product_category.ordinal
     *
     * @mbg.generated
     */
    public void setOrdinal(Byte ordinal) {
        this.ordinal = ordinal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.statue
     *
     * @return the value of product_category.statue
     *
     * @mbg.generated
     */
    public Boolean getStatue() {
        return statue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.statue
     *
     * @param statue the value for product_category.statue
     *
     * @mbg.generated
     */
    public void setStatue(Boolean statue) {
        this.statue = statue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.type
     *
     * @return the value of product_category.type
     *
     * @mbg.generated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.type
     *
     * @param type the value for product_category.type
     *
     * @mbg.generated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.is_virtual
     *
     * @return the value of product_category.is_virtual
     *
     * @mbg.generated
     */
    public Boolean getIsVirtual() {
        return isVirtual;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.is_virtual
     *
     * @param isVirtual the value for product_category.is_virtual
     *
     * @mbg.generated
     */
    public void setIsVirtual(Boolean isVirtual) {
        this.isVirtual = isVirtual;
    }
}