package fr.CCI.Java.projetmuratmusic.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.CCI.Java.Music.dao.musicdaog;

@Repository
public interface ProduitDAO extends JpaRepository<musicdaog, Integer>{

	
	musicdaog findById(int id);
	musicdaog findByNomIgnoreCase(String nom);
	List<musicdaog> findByValeurGreaterThan(int valeur);
	
	
	/* //requette sous forme JPQL : 
	 @Query("SELECT id, nom, valeur, img FROM PRODUIT p WHERE p.valeur > :prixLimit AND p.nom = :nom")
	 Produit chercherProduitCherAvecNom(@Param("prixLimit") int prix, @Param("nom") String nom);  
	 */
}
