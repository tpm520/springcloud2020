package com.tpblog.cloudapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "account_tbl")
public class Account {

    @Id
    @GeneratedValue(generator = "SEQ_ARS_HIBERNATE")
    private Integer id;

    @Column(name = "user_id")
    private Integer uid;

    private Integer money;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
