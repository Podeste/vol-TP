import java.util.Date;

import sopra.promo404.vol.Singleton;
import sopra.promo404.vol.dao.IDaoAeroport;
import sopra.promo404.vol.dao.IDaoAeroportVille;
import sopra.promo404.vol.dao.IDaoCompagnieAerienne;
import sopra.promo404.vol.dao.IDaoCompagnieAerienneVol;
import sopra.promo404.vol.dao.IDaoEscale;
import sopra.promo404.vol.dao.IDaoReservation;
import sopra.promo404.vol.dao.IDaoVille;
import sopra.promo404.vol.dao.IDaoVol;
import sopra.promo404.vol.model.Aeroport;
import sopra.promo404.vol.model.AeroportVille;
import sopra.promo404.vol.model.CompagnieAerienne;
import sopra.promo404.vol.model.CompagnieAerienneVol;
import sopra.promo404.vol.model.Escale;
import sopra.promo404.vol.model.Reservation;
import sopra.promo404.vol.model.Ville;
import sopra.promo404.vol.model.Vol;

public class TestGlobalVal {

	public static void main(String[] args) {
		IDaoAeroportVille daoAeroportVille = Singleton.getInstance().getDaoAeroportVille();
		IDaoAeroport daoAeroport = Singleton.getInstance().getDaoAeroport();
		IDaoVille daoVille = Singleton.getInstance().getDaoVille();
		IDaoReservation daoReservation = Singleton.getInstance().getDaoReservation();
		IDaoVol daoVol = Singleton.getInstance().getDaoVol();
		IDaoEscale daoEscale = Singleton.getInstance().getDaoEscale();
		IDaoCompagnieAerienne daoCompagnieAerienne = Singleton.getInstance().getDaoCompagnieAerienne();
		IDaoCompagnieAerienneVol daoCompagnieAerienneVol = Singleton.getInstance().getDaoCompagnieAerienneVol();

		Reservation resa1 = new Reservation();
		resa1.setCode("codeResa1");
		resa1.setDtResa(new Date(118, 1, 24, 12, 40));
		resa1.setConfirmee(false);
		resa1.setAnnulee(false);
		daoReservation.save(resa1);
		
		Reservation resa2 = new Reservation();
		resa2.setCode("codeResa2");
		resa2.setDtResa(new Date(118, 4, 12, 20, 00));
		resa2.setConfirmee(true);
		resa2.setAnnulee(false);
		daoReservation.save(resa2);

		Reservation resa3 = new Reservation();
		resa3.setCode("codeResa3");
		resa3.setDtResa(new Date(118, 7, 10, 10, 38));
		resa3.setConfirmee(false);
		resa3.setAnnulee(false);
		daoReservation.save(resa3);

		Reservation resa4 = new Reservation();
		resa4.setCode("codeResa4");
		resa4.setDtResa(new Date(118, 8, 20, 8, 13));
		resa4.setConfirmee(true);
		resa4.setAnnulee(true);
		daoReservation.save(resa4);

		Aeroport jfk = new Aeroport();
		jfk.setCode("JFK");

		daoAeroport.save(jfk);

		Aeroport cdg = new Aeroport();
		cdg.setCode("CDG");
		daoAeroport.save(cdg);

		Aeroport orly = new Aeroport();
		orly.setCode("ORL");
		daoAeroport.save(orly);

		Aeroport lax = new Aeroport();
		lax.setCode("LAX");
		daoAeroport.save(lax);

		Aeroport merignac = new Aeroport();
		merignac.setCode("BDX");
		daoAeroport.save(merignac);
		
		Vol vol1 = new Vol();
		vol1.setDtDepart(new Date(118, 2, 3, 12, 00));
		vol1.setDtArrivee(new Date(118, 2, 3, 16, 00));
		vol1.setNbPlace(50);
		vol1.setOuvert(true);
		vol1.setDepart(jfk);
		vol1.setArrivee(merignac);
		daoVol.save(vol1);

		Vol vol2 = new Vol();
		vol2.setDtDepart(new Date(118, 5, 23, 23, 50));
		vol2.setDtArrivee(new Date(118, 5, 24, 10, 00));
		vol2.setNbPlace(12);
		vol2.setOuvert(true);
		vol2.setDepart(merignac);
		vol2.setArrivee(lax);
		daoVol.save(vol2);

		Vol vol3 = new Vol();
		vol3.setDtDepart(new Date(118, 8, 14, 19, 37));
		vol3.setDtArrivee(new Date(118, 8, 14, 22, 40));
		vol3.setNbPlace(148);
		vol3.setOuvert(true);
		vol3.setDepart(orly);
		vol3.setArrivee(cdg);
		daoVol.save(vol3);

		Vol vol4 = new Vol();
		vol4.setDtDepart(new Date(118, 12, 22, 8, 24));
		vol4.setDtArrivee(new Date(118, 12, 22, 10, 55));
		vol4.setNbPlace(3);
		vol4.setOuvert(true);
		vol4.setDepart(cdg);
		vol4.setDepart(jfk);
		daoVol.save(vol4);

		Escale escale1 = new Escale();
		escale1.sethArrivee(new Date(118,1,3,12,50));
		escale1.sethDepart(new Date(118,1,3,12,55));		
		daoEscale.save(escale1);

		Escale escale2 = new Escale();
		escale2.sethArrivee(new Date(118,1,3,14,25));
		escale2.sethDepart(new Date(118,1,3,14,30));
		daoEscale.save(escale2);

		Escale escale3 = new Escale();
		escale3.sethArrivee(new Date(118,4,24,6,40));
		escale3.sethDepart(new Date(118,4,24,6,42));
		daoEscale.save(escale3);

		Escale escale4 = new Escale();
		escale4.sethArrivee(new Date(118,7,14,20,50));
		escale4.sethDepart(new Date(118,7,14,20,54));
		daoEscale.save(escale4);
		
		Ville paris = new Ville();
		paris.setCodePostal("75001");
		paris.setNom("Paris");
		daoVille.save(paris);

		Ville bordeaux = new Ville();
		bordeaux.setCodePostal("33000");
		bordeaux.setNom("Bordeaux");
		daoVille.save(bordeaux);

		Ville newyork = new Ville();
		newyork.setCodePostal("4455");
		newyork.setNom("New York");
		daoVille.save(newyork);

		Ville losangeles = new Ville();
		losangeles.setCodePostal("8881");
		losangeles.setNom("Los Angeles");
		daoVille.save(losangeles);
		
		AeroportVille av1 = new AeroportVille();
		av1.setAeroport(jfk);
		av1.setVille(newyork);
		daoAeroportVille.save(av1);
		
		AeroportVille av2 = new AeroportVille();
		av2.setAeroport(cdg);
		av2.setVille(paris);
		daoAeroportVille.save(av2);
		
		AeroportVille av3 = new AeroportVille();
		av3.setAeroport(orly);
		av3.setVille(paris);
		daoAeroportVille.save(av3);
		
		AeroportVille av4 = new AeroportVille();
		av4.setAeroport(lax);
		av4.setVille(losangeles);
		daoAeroportVille.save(av4);
		
		AeroportVille av5 = new AeroportVille();
		av5.setAeroport(merignac);
		av5.setVille(bordeaux);
		daoAeroportVille.save(av5);
		
		CompagnieAerienne airFrance = new CompagnieAerienne();
		airFrance.setNom("Air France");
		daoCompagnieAerienne.save(airFrance);

		CompagnieAerienne easyJet = new CompagnieAerienne();
		easyJet.setNom("Easy Jet");
		daoCompagnieAerienne.save(easyJet);
		
		CompagnieAerienneVol cav1 = new CompagnieAerienneVol();
		cav1.setNumero("cavNum1");
		cav1.setCompagnieAerienne(easyJet);
		cav1.setVol(vol1);
		daoCompagnieAerienneVol.save(cav1);

		CompagnieAerienneVol cav2 = new CompagnieAerienneVol();
		cav2.setNumero("cavNum2");
		cav2.setCompagnieAerienne(airFrance);
		cav2.setVol(vol2);
		daoCompagnieAerienneVol.save(cav2);
		
	}

}
