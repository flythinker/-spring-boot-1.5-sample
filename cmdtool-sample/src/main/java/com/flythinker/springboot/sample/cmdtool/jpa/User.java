package com.flythinker.springboot.sample.cmdtool.jpa;

import com.flythinker.springboot.sample.cmdtool.CmdtoolSampleApplication;
import org.apache.commons.beanutils.BeanUtils;

import javax.persistence.*;
import java.util.Date;

/**
 * 黄奕鹏（大鹏~飞翔理念）,创建于 2018/6/11.
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    @Column(insertable=false,updatable = false)
    private Date updateTime;
    @Column(insertable=false,updatable = false)
    private Date createTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getId() {
        return id;

    }

    public void setId(Long id) {
        this.id = id;
    }

    public String toString() {
        try {
            return BeanUtils.describe(this).toString();
        }catch(Exception ex){
            CmdtoolSampleApplication.logger.error("User.toString error",ex);
            return "User.toString error" ;
        }
    }
}
