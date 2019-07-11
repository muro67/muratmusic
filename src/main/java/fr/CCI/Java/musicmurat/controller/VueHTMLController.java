package fr.CCI.Java.musicmurat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fr.CCI.Java.Music.dao.musicdaog;
import fr.CCI.Java.projetmuratmusic.model.ProduitDAO;

@Controller
public class VueHTMLController {

	@Autowired
	private ProduitDAO produitDao;
	
	@GetMapping(value= "/Boulangerie")
	public String pageAccueil(Model model) {
		List<musicdaog> produits = produitDao.findAll();
		
		model.addAttribute("ps", produits);
		return "Accueil";
	}

	
	@GetMapping(value= "/produit-detail/{id}")
	public String produitdetail(Model model, @PathVariable int id) {
		musicdaog produit = produitDao.findById(id);
		
		model.addAttribute("p", produit);
		return "Detail";
	}
	
}

