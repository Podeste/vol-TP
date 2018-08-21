package sopra.promo404.vol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Ville {
	@Id
	@GeneratedValue
	@Column(name = "ville_id")
	private Long id;
	private String nom;
	private String codePostal;
	@OneToMany
	private List<AeroportVille> aeroportsvilles = new ArrayList<>();
	
	public List<AeroportVille> getAeroportsVilles() {
		return aeroportsvilles;
	}

	public void setAeroportsVilles(List<AeroportVille> aeroportsvilles) {
		this.aeroportsvilles = aeroportsvilles;
	}
	public Ville() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	
	
	private int version;
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
}
