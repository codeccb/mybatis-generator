package cn.ccb.pojo;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String realname;

    private Integer password;

    private String sex;

    private String status;

    private Date registertime;

    public User(Integer id, String username, String realname, Integer password, String sex, String status, Date registertime) {
        this.id = id;
        this.username = username;
        this.realname = realname;
        this.password = password;
        this.sex = sex;
        this.status = status;
        this.registertime = registertime;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }
}