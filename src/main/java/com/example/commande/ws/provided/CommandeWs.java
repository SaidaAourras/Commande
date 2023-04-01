package com.example.commande.ws.provided;

import com.example.commande.bean.Commande;
import com.example.commande.service.facade.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/v1/commande")
public class CommandeWs {
    @Autowired

    private CommandeService commandeService;

    @GetMapping("/reference/{reference}")
    public Commande findByReference(@PathVariable String reference) {
        return commandeService.findByReference(reference);
    }
    @DeleteMapping("/reference/{reference}")

    public int deleteByReference(String referece) {
        return commandeService.deleteByReference(referece);
    }
    @PostMapping("/")

    public Commande save(@RequestBody Commande commande) {
        return commandeService.save(commande);
    }
    @GetMapping("/")

    public List<Commande> findAll() {
        return commandeService.findAll();
    }
}
