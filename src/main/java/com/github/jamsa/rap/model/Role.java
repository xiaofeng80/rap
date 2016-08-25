package com.github.jamsa.rap.model;

import com.github.jamsa.rap.core.model.BaseEntity;
import java.util.Date;

public class Role extends BaseEntity<Integer> {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RAP_ROLE.ROLE_ID
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RAP_ROLE.MEMO
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    private String memo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RAP_ROLE.CODE
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RAP_ROLE.NAME
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RAP_ROLE.CREATED_BY
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    private Integer createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RAP_ROLE.CREATION_DATE
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    private Date creationDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RAP_ROLE.LAST_UPDATE_DATE
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    private Date lastUpdateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RAP_ROLE.LAST_UPDATED_BY
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    private Integer lastUpdatedBy;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RAP_ROLE.ROLE_ID
     *
     * @return the value of RAP_ROLE.ROLE_ID
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RAP_ROLE.ROLE_ID
     *
     * @param roleId the value for RAP_ROLE.ROLE_ID
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    public void setRoleId(Integer roleId) {
        this.firePropertyChange("roleId",roleId);
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RAP_ROLE.MEMO
     *
     * @return the value of RAP_ROLE.MEMO
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RAP_ROLE.MEMO
     *
     * @param memo the value for RAP_ROLE.MEMO
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    public void setMemo(String memo) {
        this.firePropertyChange("memo",memo);
        this.memo = memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RAP_ROLE.CODE
     *
     * @return the value of RAP_ROLE.CODE
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RAP_ROLE.CODE
     *
     * @param code the value for RAP_ROLE.CODE
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    public void setCode(String code) {
        this.firePropertyChange("code",code);
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RAP_ROLE.NAME
     *
     * @return the value of RAP_ROLE.NAME
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RAP_ROLE.NAME
     *
     * @param name the value for RAP_ROLE.NAME
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    public void setName(String name) {
        this.firePropertyChange("name",name);
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RAP_ROLE.CREATED_BY
     *
     * @return the value of RAP_ROLE.CREATED_BY
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    public Integer getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RAP_ROLE.CREATED_BY
     *
     * @param createdBy the value for RAP_ROLE.CREATED_BY
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    public void setCreatedBy(Integer createdBy) {
        this.firePropertyChange("createdBy",createdBy);
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RAP_ROLE.CREATION_DATE
     *
     * @return the value of RAP_ROLE.CREATION_DATE
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RAP_ROLE.CREATION_DATE
     *
     * @param creationDate the value for RAP_ROLE.CREATION_DATE
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    public void setCreationDate(Date creationDate) {
        this.firePropertyChange("creationDate",creationDate);
        this.creationDate = creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RAP_ROLE.LAST_UPDATE_DATE
     *
     * @return the value of RAP_ROLE.LAST_UPDATE_DATE
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RAP_ROLE.LAST_UPDATE_DATE
     *
     * @param lastUpdateDate the value for RAP_ROLE.LAST_UPDATE_DATE
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.firePropertyChange("lastUpdateDate",lastUpdateDate);
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RAP_ROLE.LAST_UPDATED_BY
     *
     * @return the value of RAP_ROLE.LAST_UPDATED_BY
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    public Integer getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RAP_ROLE.LAST_UPDATED_BY
     *
     * @param lastUpdatedBy the value for RAP_ROLE.LAST_UPDATED_BY
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    public void setLastUpdatedBy(Integer lastUpdatedBy) {
        this.firePropertyChange("lastUpdatedBy",lastUpdatedBy);
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Integer getPrimaryKey() {
        return this.roleId;
    }

    public void setPrimaryKey(Integer pkValue) {
        this.setRoleId(pkValue);
    }
}