package com.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chef")

public class chef{

    @Id
    @Column(name="chef_id")
    private int chefId;

    @Column(name="chef_name")
    private String chefname;

    @Column(name="salary")
    private float chefsal;

    public int getChefId(){return chefId;}
    public void setChefId(int chefId){this.chefId=chefId;}

    public String getChefname(){return chefname;}

    public void setChefname(String chefname){this.chefname=chefname;}

    public float getChefsal() {return chefsal;}

    public void setChefsal(float chefsal){this.chefsal=chefsal;}


    @Override
    public String toString(){
        return "chef{" +
                "chefId=" +chefId+
                ", chefname='" +chefname+'\''+
                ",chefsal='"+chefsal+'\''+
                '}';

    }
}
