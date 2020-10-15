package com.company.cascadedlookups.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "CASCADEDLOOKUPS_CITY")
@Entity(name = "cascadedlookups_City")
@NamePattern("%s|name")
public class City extends StandardEntity {
    private static final long serialVersionUID = -6988239890555094656L;

    @Column(name = "NAME")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID")
    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}