package com.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="waiter")

public class waiter {
    @Id
    @Column(name = "waiter_id")
    private int waiterId;

    @Column(name = "waiter_name")
    private String waitername;

    @Column(name = "salary")
    private float waitersal;


    public int getWaiterId() {
        return waiterId;
    }

    public void setWaiterId(int waiterId) {
        this.waiterId = waiterId;
    }


    public String getWaitername() {
        return waitername;
    }

    public void setWaitername(String waitername) {
        this.waitername = waitername;
    }

    public float getWaitersal() {
        return waitersal;
    }

    public void setWaitersal(float waitersal) {
        this.waitersal = waitersal;
    }


    @Override
    public String toString() {
        return "waiter{" +
                "waiterId=" + waiterId +
                ", waitername='" + waitername + '\'' +
                ",waitersal='" + waitersal + '\'' +
                '}';


    }
}
