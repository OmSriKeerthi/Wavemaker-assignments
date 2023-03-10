package com.model;

import javax.persistence.*;

@Entity
@Table(name="services")
public class service {
    @Id
    @Column(name="service_provider_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int service_provider_id;

    @Column(name="service_name")
    private String service_name;

    public int getService_provider_id() {
        return service_provider_id;
    }

    public void setService_provider_id(int service_provider_id) {
        this.service_provider_id = service_provider_id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column
    private String description;
}
