package sopra.promo404.vol.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
@Entity
public class Escale {
	@Id
	@GeneratedValue
	@Column(name = "escale_id")
	private Long id;
	private Date hDepart;
	private Date hArrivee;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "aeroport_id")
	private Aeroport aeroport;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "vol_id")
	private Vol vol;

	public Escale() {
	}

	public Escale(Date hDepart, Date hArrivee, Aeroport aeroport, Vol vol) {
		this.hDepart = hDepart;
		this.hArrivee = hArrivee;
		this.aeroport = aeroport;
		this.vol = vol;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date gethDepart() {
		return hDepart;
	}

	public void sethDepart(Date hDepart) {
		this.hDepart = hDepart;
	}

	public Date gethArrivee() {
		return hArrivee;
	}

	public void sethArrivee(Date hArrivee) {
		this.hArrivee = hArrivee;
	}

	public Aeroport getAeroport() {
		return aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}
	@Version
	private int version;
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
}
