package com.casit.chapter2.model;

/**
 * Created by 'A flying pig' 2024/12/27 17:31
 */
public class Customer {

    /**
     * 主键
     */
    private String id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 联系人
     */
    private String contact;
    /**
     * 电话
     */
    private String telephone;
    /**
     * 邮件
     */
    private String email;
    /**
     * 备注
     */
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
