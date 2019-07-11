package fr.CCI.Java.projetmuratmusic.model;

import java.util.ArrayList;
import java.util.List;

import fr.CCI.Java.Music.dao.musicdaojava;

public class ProduitDAO_Old {

	List<musicdaojava> produits = new ArrayList<>();
	
	public ProduitDAO_Old() {
		this.produits.add(new  musicdaojava(0, "pain", 2, "url"));
		this.produits.add(new  musicdaojava(1, "tarte", 1, "url"));
		this.produits.add(new  musicdaojava(2, "paris brest", 5, "url"));
	}
	
	
	
	public void addProduit(musicdaojava p ) {
		this.produits.add(p);
	}

	public List<musicdaojava> getProduits() {
		return produits;
	}
	

	public musicdaojava getByID(int id) {
		for (musicdaojava produit : produits) {
			if(produit.getId() == id)
				return produit;
		}
		return null;
	}



	public void update(int id, musicdaojava p) {
		musicdaojava prod = getByID(id);
		
		prod.setImg(p.getImg());
		prod.setNom(p.getNom());
		prod.setValeur(p.getValeur());
		
	}
	
	
	
}
