package sopra.promo404.vol;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sopra.promo404.vol.dao.IRepositoryAeroport;
import sopra.promo404.vol.dao.IRepositoryAeroportVille;
import sopra.promo404.vol.dao.IRepositoryClient;
import sopra.promo404.vol.dao.IRepositoryCompagnieAerienne;
import sopra.promo404.vol.dao.IRepositoryCompagnieAerienneVol;
import sopra.promo404.vol.dao.IRepositoryEscale;
import sopra.promo404.vol.dao.IRepositoryLogin;
import sopra.promo404.vol.dao.IDaoPassager;
import sopra.promo404.vol.dao.IDaoReservation;
import sopra.promo404.vol.dao.IDaoVille;
import sopra.promo404.vol.dao.IRepositoryVol;
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

	private final IRepositoryClient daoClient = new DaoClientJpa();
	private final IRepositoryLogin daoLogin = new DaoLoginJpa();
	private final IDaoReservation daoReservation = new DaoReservationJpa();
	private final IRepositoryVol daoVol = new DaoVolJpa();
	private final IDaoPassager daoPassager = new DaoPassagerJpa();
	private final IRepositoryAeroport daoAeroport = new DaoAeroportJpa();
	private final IRepositoryEscale daoEscale = new DaoEscaleJpa();
	private final IDaoVille daoVille = new DaoVilleJpa();
	private final IRepositoryAeroportVille daoAeroportVille = new DaoAeroportVilleJpa();
	private final IRepositoryCompagnieAerienne daoCompagnieAerienne = new DaoCompagnieAerienneJpa();
	private final IRepositoryCompagnieAerienneVol daoCompagnieAerienneVol = new DaoCompagnieAerienneVolJpa();

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

	public IRepositoryClient getDaoClient() {
		return daoClient;
	}

	public IRepositoryLogin getDaoLogin() {
		return daoLogin;
	}

	public IDaoReservation getDaoReservation() {
		return daoReservation;
	}

	public IRepositoryVol getDaoVol() {
		return daoVol;
	}

	public IDaoPassager getDaoPassager() {
		return daoPassager;
	}

	public IRepositoryAeroport getDaoAeroport() {
		return daoAeroport;
	}

	public IRepositoryEscale getDaoEscale() {
		return daoEscale;
	}

	public IDaoVille getDaoVille() {
		return daoVille;
	}

	public IRepositoryAeroportVille getDaoAeroportVille() {
		return daoAeroportVille;
	}

	public IRepositoryCompagnieAerienne getDaoCompagnieAerienne() {
		return daoCompagnieAerienne;
	}

	public IRepositoryCompagnieAerienneVol getDaoCompagnieAerienneVol() {
		return daoCompagnieAerienneVol;
	}
	
}