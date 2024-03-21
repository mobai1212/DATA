package com.huyonghua.domain;

/**
 * 用户信息 实体类
 */
public class User {
    // 声明成员变量
    private Integer userid;
    private String username;
    private String password;
    private String type;

    // 声明构造函数
    public User() {
        super();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User(Integer userid, String username, String password, String type) {
        super();
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.type=type;
    }

    // 成员方法
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

//声明 实体类——》 到dao层 调用mybaits