package com.dixn.spring.cloud.service.admin.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "j_user_bases")
public class JUserBases {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private String id;

    /**
     * 昵称
     */
    @Column(name = "NIKENAME")
    private String nikename;

    /**
     * 用户名
     */
    @Column(name = "USERNAME")
    private String username;

    /**
     * 明码
     */
    @Column(name = "USERPWD")
    private String userpwd;

    /**
     * 密码
     */
    @Column(name = "PASSWORD")
    private String password;

    /**
     * 最后登录时间
     */
    @Column(name = "LASTLOGINTIME")
    private Date lastlogintime;

    /**
     * 登陆错误次数
     */
    @Column(name = "PASSWDERRORCOUNT")
    private Integer passwderrorcount;

    /**
     * 创建人ID
     */
    @Column(name = "CREATE_USER")
    private String createUser;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 修改人ID
     */
    @Column(name = "UPDATE_USER")
    private String updateUser;

    /**
     * 修改时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 有效FLAG
     */
    @Column(name = "VALID_FLAG")
    private String validFlag;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取昵称
     *
     * @return NIKENAME - 昵称
     */
    public String getNikename() {
        return nikename;
    }

    /**
     * 设置昵称
     *
     * @param nikename 昵称
     */
    public void setNikename(String nikename) {
        this.nikename = nikename;
    }

    /**
     * 获取用户名
     *
     * @return USERNAME - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取明码
     *
     * @return USERPWD - 明码
     */
    public String getUserpwd() {
        return userpwd;
    }

    /**
     * 设置明码
     *
     * @param userpwd 明码
     */
    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    /**
     * 获取密码
     *
     * @return PASSWORD - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取最后登录时间
     *
     * @return LASTLOGINTIME - 最后登录时间
     */
    public Date getLastlogintime() {
        return lastlogintime;
    }

    /**
     * 设置最后登录时间
     *
     * @param lastlogintime 最后登录时间
     */
    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    /**
     * 获取登陆错误次数
     *
     * @return PASSWDERRORCOUNT - 登陆错误次数
     */
    public Integer getPasswderrorcount() {
        return passwderrorcount;
    }

    /**
     * 设置登陆错误次数
     *
     * @param passwderrorcount 登陆错误次数
     */
    public void setPasswderrorcount(Integer passwderrorcount) {
        this.passwderrorcount = passwderrorcount;
    }

    /**
     * 获取创建人ID
     *
     * @return CREATE_USER - 创建人ID
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人ID
     *
     * @param createUser 创建人ID
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改人ID
     *
     * @return UPDATE_USER - 修改人ID
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置修改人ID
     *
     * @param updateUser 修改人ID
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取修改时间
     *
     * @return UPDATE_TIME - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取有效FLAG
     *
     * @return VALID_FLAG - 有效FLAG
     */
    public String getValidFlag() {
        return validFlag;
    }

    /**
     * 设置有效FLAG
     *
     * @param validFlag 有效FLAG
     */
    public void setValidFlag(String validFlag) {
        this.validFlag = validFlag;
    }
}