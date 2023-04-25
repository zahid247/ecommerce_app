package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address extends BaseEntity {

    private String name;
    private String street;
    private String zipCode;

    @ManyToOne
    private Customer customer;

}
