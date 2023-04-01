package com.example.commande.service.impl;


import com.example.commande.bean.Commande;
import com.example.commande.dao.CommandeDao;
import com.example.commande.service.facade.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeServiceImpl implements CommandeService {
      @Autowired
      private CommandeDao commandeDao;

    @Override
    public Commande findByReference(String reference) {
        return commandeDao.findByReference(reference);
    }

    @Override
    public int deleteByReference(String referece) {
        return commandeDao.deleteByReference(referece);
    }

    public Commande save(Commande commande){
        Commande res = null;
        if(findByReference(commande.getReference()) != null){
            res = commandeDao.save(commande);
        }
        return res;
    }


    @Override
    public List<Commande> findAll() {
        return commandeDao.findAll();
    }
}
