package com.trainning.mysites.domain;


import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;
    @Column(length = 30,unique = true)
    @NotNull
    private String account;
    @Column(length = 30)
    @NotNull
    private String password;
    @Column(length = 30)
    private String name;

    public enum Sex{
      男,女
    };
    private Sex grander;

    private LocalDateTime birthday;
    @Column(length = 11)
    private String mobile;

    @Column(length = 100)
    private String email;

    private Integer lasttime;   //最后登录时间

    private Integer logincount; //登录次数

    private Integer validstate = 1; //用户是都有效    1代表有效，0代表无效

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getGrander() {
        return grander;
    }

    public void setGrander(Sex grander) {
        this.grander = grander;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getLasttime() {
        return lasttime;
    }

    public void setLasttime(Integer lasttime) {
        this.lasttime = lasttime;
    }

    public Integer getLogincount() {
        return logincount;
    }

    public void setLogincount(Integer logincount) {
        this.logincount = logincount;
    }

    public Integer getValidstate() {
        return validstate;
    }

    public void setValidstate(Integer validstate) {
        this.validstate = validstate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(uid, user.uid) &&
                Objects.equals(account, user.account) &&
                Objects.equals(password, user.password) &&
                Objects.equals(name, user.name) &&
                grander == user.grander &&
                Objects.equals(birthday, user.birthday) &&
                Objects.equals(mobile, user.mobile) &&
                Objects.equals(email, user.email) &&
                Objects.equals(lasttime, user.lasttime) &&
                Objects.equals(logincount, user.logincount) &&
                Objects.equals(validstate, user.validstate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, account, password, name, grander, birthday, mobile, email, lasttime, logincount, validstate);
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", grander=" + grander +
                ", birthday=" + birthday +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", lasttime=" + lasttime +
                ", logincount=" + logincount +
                ", validstate=" + validstate +
                '}';
    }
}
