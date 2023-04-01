package com.example.commande.service.facade;

import com.example.commande.bean.Commande;

import java.util.List;

public interface CommandeService {
    Commande findByReference(String reference);
    int deleteByReference(String referece);

    Commande save(Commande commande);
    List<Commande> findAll();
}
