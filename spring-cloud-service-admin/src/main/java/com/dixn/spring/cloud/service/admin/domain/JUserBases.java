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
     * �ǳ�
     */
    @Column(name = "NIKENAME")
    private String nikename;

    /**
     * �û���
     */
    @Column(name = "USERNAME")
    private String username;

    /**
     * ����
     */
    @Column(name = "USERPWD")
    private String userpwd;

    /**
     * ����
     */
    @Column(name = "PASSWORD")
    private String password;

    /**
     * ����¼ʱ��
     */
    @Column(name = "LASTLOGINTIME")
    private Date lastlogintime;

    /**
     * ��½�������
     */
    @Column(name = "PASSWDERRORCOUNT")
    private Integer passwderrorcount;

    /**
     * ������ID
     */
    @Column(name = "CREATE_USER")
    private String createUser;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * �޸���ID
     */
    @Column(name = "UPDATE_USER")
    private String updateUser;

    /**
     * �޸�ʱ��
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * ��ЧFLAG
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
     * ��ȡ�ǳ�
     *
     * @return NIKENAME - �ǳ�
     */
    public String getNikename() {
        return nikename;
    }

    /**
     * �����ǳ�
     *
     * @param nikename �ǳ�
     */
    public void setNikename(String nikename) {
        this.nikename = nikename;
    }

    /**
     * ��ȡ�û���
     *
     * @return USERNAME - �û���
     */
    public String getUsername() {
        return username;
    }

    /**
     * �����û���
     *
     * @param username �û���
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * ��ȡ����
     *
     * @return USERPWD - ����
     */
    public String getUserpwd() {
        return userpwd;
    }

    /**
     * ��������
     *
     * @param userpwd ����
     */
    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    /**
     * ��ȡ����
     *
     * @return PASSWORD - ����
     */
    public String getPassword() {
        return password;
    }

    /**
     * ��������
     *
     * @param password ����
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * ��ȡ����¼ʱ��
     *
     * @return LASTLOGINTIME - ����¼ʱ��
     */
    public Date getLastlogintime() {
        return lastlogintime;
    }

    /**
     * ��������¼ʱ��
     *
     * @param lastlogintime ����¼ʱ��
     */
    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    /**
     * ��ȡ��½�������
     *
     * @return PASSWDERRORCOUNT - ��½�������
     */
    public Integer getPasswderrorcount() {
        return passwderrorcount;
    }

    /**
     * ���õ�½�������
     *
     * @param passwderrorcount ��½�������
     */
    public void setPasswderrorcount(Integer passwderrorcount) {
        this.passwderrorcount = passwderrorcount;
    }

    /**
     * ��ȡ������ID
     *
     * @return CREATE_USER - ������ID
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * ���ô�����ID
     *
     * @param createUser ������ID
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
     * ��ȡ�޸���ID
     *
     * @return UPDATE_USER - �޸���ID
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * �����޸���ID
     *
     * @param updateUser �޸���ID
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * ��ȡ�޸�ʱ��
     *
     * @return UPDATE_TIME - �޸�ʱ��
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * �����޸�ʱ��
     *
     * @param updateTime �޸�ʱ��
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * ��ȡ��ЧFLAG
     *
     * @return VALID_FLAG - ��ЧFLAG
     */
    public String getValidFlag() {
        return validFlag;
    }

    /**
     * ������ЧFLAG
     *
     * @param validFlag ��ЧFLAG
     */
    public void setValidFlag(String validFlag) {
        this.validFlag = validFlag;
    }
}