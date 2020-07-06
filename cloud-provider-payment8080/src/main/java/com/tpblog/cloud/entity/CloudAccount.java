package com.tpblog.cloud.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cloudAccount")
public class CloudAccount implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "SEQ_ARS_HIBERNATE")
    private Integer aid;

    private Double money;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "CloudAccount{" +
                "aid=" + aid +
                ", money=" + money +
                '}';
    }
}
