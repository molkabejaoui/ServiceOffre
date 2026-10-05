package com.iset.web;

import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iset.dao.OffreRepository;
import com.iset.entities.Offre;

@RestController
@RequestMapping("/Offres")
public class RestOffres {

    @Autowired
    private OffreRepository offreRepository;

    // Afficher toutes les offres
    @GetMapping
    public List<Offre> getAllOffres() {
        return offreRepository.findAll();
    }

    // Afficher une offre selon son ID
    @GetMapping("/{id}")
    public Offre getOffre(@PathVariable Long id) {
        return offreRepository.findById(id).orElse(null);
    }

    // Ajouter une offre
    @PostMapping
    public Offre addOffre(@RequestBody Offre offre) {
        return offreRepository.save(offre);
    }

    // Supprimer une offre
    @DeleteMapping("/{id}")
    public void deleteOffre(@PathVariable Long id) {
        offreRepository.deleteById(id);
    }
    @PutMapping("/{id}")
    public Offre updateOffre(@PathVariable Long id, @RequestBody Offre offre) {
        offre.setCode(id);
        return offreRepository.save(offre);
}
}