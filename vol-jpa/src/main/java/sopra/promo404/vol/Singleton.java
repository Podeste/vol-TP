package sopra.promo404.vol;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sopra.promo404.vol.dao.IDaoAeroport;
import sopra.promo404.vol.dao.IDaoAeroportVille;
import sopra.promo404.vol.dao.IDaoClient;
import sopra.promo404.vol.dao.IDaoCompagnieAerienne;
import sopra.promo404.vol.dao.IDaoCompagnieAerienneVol;
import sopra.promo404.vol.dao.IDaoEscale;
import sopra.promo404.vol.dao.IDaoLogin;
import sopra.promo404.vol.dao.IDaoPassager;
import sopra.promo404.vol.dao.IDaoReservation;
import sopra.promo404.vol.dao.IDaoVille;
import sopra.promo404.vol.dao.IDaoVol;
import sopra.promo404.vol.dao.jpa.DaoAeroportJpa;
import sopra.promo404.vol.dao.jpa.DaoAeroportVilleJpa;
import sopra.promo404.vol.dao.jpa.DaoClientJpa;
import sopra.promo404.vol.dao.jpa.DaoCompagnieAerienneJpa;
import sopra.promo404.vol.dao.jpa.DaoCompagnieAerienneVolJpa;
import sopra.promo404.vol.dao.jpa.DaoEscaleJpa;
import sopra.promo404.vol.dao.jpa.DaoLoginJpa;
import sopra.promo404.vol.dao.jpa.DaoPassagerJpa;
import sopra.promo404.vol.dao.jpa.DaoReservationJpa;
import sopra.promo404.vol.dao.jpa.DaoVilleJpa;
import sopra.promo404.vol.dao.jpa.DaoVolJpa;

public class Singleton {
	private static Singleton instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("vol");

	private final IDaoClient daoClient = new DaoClientJpa();
	private final IDaoLogin daoLogin = new DaoLoginJpa();
	private final IDaoReservation daoReservation = new DaoReservationJpa();
	private final IDaoVol daoVol = new DaoVolJpa();
	private final IDaoPassager daoPassager = new DaoPassagerJpa();
	private final IDaoAeroport daoAeroport = new DaoAeroportJpa();
	private final IDaoEscale daoEscale = new DaoEscaleJpa();
	private final IDaoVille daoVille = new DaoVilleJpa();
	private final IDaoAeroportVille daoAeroportVille = new DaoAeroportVilleJpa();
	private final IDaoCompagnieAerienne daoCompagnieAerienne = new DaoCompagnieAerienneJpa();
	private final IDaoCompagnieAerienneVol daoCompagnieAerienneVol = new DaoCompagnieAerienneVolJpa();

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public IDaoClient getDaoClient() {
		return daoClient;
	}

	public IDaoLogin getDaoLogin() {
		return daoLogin;
	}

	public IDaoReservation getDaoReservation() {
		return daoReservation;
	}

	public IDaoVol getDaoVol() {
		return daoVol;
	}

	public IDaoPassager getDaoPassager() {
		return daoPassager;
	}

	public IDaoAeroport getDaoAeroport() {
		return daoAeroport;
	}

	public IDaoEscale getDaoEscale() {
		return daoEscale;
	}

	public IDaoVille getDaoVille() {
		return daoVille;
	}

	public IDaoAeroportVille getDaoAeroportVille() {
		return daoAeroportVille;
	}

	public IDaoCompagnieAerienne getDaoCompagnieAerienne() {
		return daoCompagnieAerienne;
	}

	public IDaoCompagnieAerienneVol getDaoCompagnieAerienneVol() {
		return daoCompagnieAerienneVol;
	}
	
}