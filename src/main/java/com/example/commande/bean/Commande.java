package com.example.commande.bean;


import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id ;
    private String reference ;
    private BigDecimal total ;
    private BigDecimal totalPayer ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getTotalPayer() {
        return totalPayer;
    }

    public void setTotalPayer(BigDecimal totalPayer) {
        this.totalPayer = totalPayer;
    }
}
