package com.cydeo.entity;

import com.cydeo.enums.CartState;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cart extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private CartState cartState;

    @ManyToOne
    private Discount discount;

    @ManyToOne
    private Customer customer;

}
