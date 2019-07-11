package fr.CCI.Java.Music.dao;

public class Musicdao {
	
	
	private int id; 
	private String artiste;
	private String pistes;
	private int sortie;
	private String img;
	
	
	public Musicdao() {
		
	}
	
	public Musicdao(int id,String artiste, String pistes,int sortie, String img) {
		super();
		this.id = id;
		this.artiste = artiste;
		this.pistes = pistes;
		this.sortie = sortie;
		this.img = img;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArtiste() {
		return artiste;
	}

	public void setArtiste(String artiste) {
		this.artiste = artiste;
	}

	public String getPistes() {
		return pistes;
	}

	public void setPistes(String pistes) {
		this.pistes = pistes;
	}

	public int getSortie() {
		return sortie;
	}

	public void setSortie(int sortie) {
		this.sortie = sortie;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	@Override
	public String toString() {
		return id+ " " + artiste + " " + pistes +" "+ sortie + " "+ img;
	}

}
