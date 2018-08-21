package sopra.promo404.vol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Aeroport {
	@Id
	@GeneratedValue
	@Column(name = "aeroport_id")
	private Long id;
	private String code;
	@OneToMany(mappedBy = "aeroport")
	private List<AeroportVille> aeroportsvilles = new ArrayList<>();
	public List<AeroportVille> getAeroportsVilles() {
		return aeroportsvilles;
	}

	public void setAeroportsVilles(List<AeroportVille> aeroportsvilles) {
		this.aeroportsvilles = aeroportsvilles;
	}

	public Aeroport() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	
	
	private int version;
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
}
