package com.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")

public class customers {

    @Id
    @Column(name = "customer_id")
    private int customersId;

    @Column(name = "customer_name")
    private String customersname;

    @Column(name = "phno")
    private int customersphno;

    @Column(name = "waiter_id")
    private int waiterId;

    public int getCustomersId() {
        return customersId;
    }

    public void setCustomersId(int customersId) {
        this.customersId = customersId;
    }

    public String getCustomersname() {
        return customersname;
    }

    public void setCustomersname(String customersname) {
        this.customersname = customersname;
    }

    public int getCustomersphno() {
        return customersphno;
    }

    public void setCustomersphno(int customersphno) {
        this.customersphno = customersphno;
    }

    public int getWaiterId() {
        return waiterId;
    }

    public void setWaiterId(int waiterId) {
        this.waiterId = waiterId;
    }


    @Override
    public String toString() {
        return "customer{" +
                "customersId=" + customersId +
                ", customersname='" + customersname + '\'' +
                ",customersphno='" + customersphno + '\'' +
                ",waiterId='" + waiterId+'\''+ '}';
    }
}