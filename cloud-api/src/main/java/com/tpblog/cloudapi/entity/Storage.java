package com.tpblog.cloudapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "storage_tbl")
public class Storage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "SEQ_ARS_HIBERNATE")
    private Integer id;

    private Integer commodity_code;

    @Column(name = "count")
    private Integer num;

    @Override
    public String toString() {
        return "Storage{" +
                "id=" + id +
                ", commodity_code=" + commodity_code +
                ", num=" + num +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommodity_code() {
        return commodity_code;
    }

    public void setCommodity_code(Integer commodity_code) {
        this.commodity_code = commodity_code;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
