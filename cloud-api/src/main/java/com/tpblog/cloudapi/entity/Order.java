package com.tpblog.cloudapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "order_tbl")
public class Order {
    @Id
    @GeneratedValue(generator = "SEQ_ARS_HIBERNATE")
    private Integer id;

    @Column(name = "user_id")
    private Integer uid;

    private Integer commodity_code;

    private Integer count;

    private Integer money;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", uid=" + uid +
                ", commodity_code=" + commodity_code +
                ", count=" + count +
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

    public Integer getCommodity_code() {
        return commodity_code;
    }

    public void setCommodity_code(Integer commodity_code) {
        this.commodity_code = commodity_code;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
