package fr.CCI.Java.musicmurat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.cci.projetmuratmusic;
import com.cci.projetmuratmusic;



public class MusicControler {
	
	
	@Autowired
	private MusicDAO musicDao;
	
	
	@GetMapping(value= "/Musics")
	public List<Music> listmusic(){
		
		return musicDao.findAll();
	}
	
	@GetMapping(value= "/Musics/{id}")
	public Music produitParID(@PathVariable int id) {
		return musicDao.findById(id);
	}
	
	@PostMapping(value = "/Musics")
    public void ajouterProduit(@RequestBody Music Music){
		musicDao.save(Music);
	}
	
	@PutMapping(value = "/Musics")
	public void updateProduit(@RequestBody Music m) {
		musicDao.save(m);
	}
	
	@GetMapping(value = "/Musics/byArtiste/{Artiste}")
	public Music obtenirProduitAvecNom(@PathVariable String Artiste) {
		Music p = musicDao.findByArtisteIgnoreCase(Artiste);
		return p;
	}
	
	@GetMapping(value = "/Musics/byArtisteAndPistes/{Artiste}")
	public Music obtenirMusicAndPistes(@PathVariable String Artiste, @RequestParam(value="Pistes", required=false, defaultValue="1") int valeur)  {
		return null;
	}
	
	@GetMapping(value = "/Musics/MoreMusic/{valeur}")
	public List<Music> obtenirProduitPlusCherQue(@PathVariable int valeur) {
		return musicDao.findByValeurGreaterThan(valeur);
	}

}