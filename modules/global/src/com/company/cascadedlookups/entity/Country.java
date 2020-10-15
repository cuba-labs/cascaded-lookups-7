package com.company.cascadedlookups.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CASCADEDLOOKUPS_COUNTRY")
@Entity(name = "cascadedlookups_Country")
@NamePattern("%s|name")
public class Country extends StandardEntity {
    private static final long serialVersionUID = 2184695984137067393L;

    @Column(name = "NAME")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}