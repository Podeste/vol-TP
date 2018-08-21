import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import sopra.promo404.vol.Singleton;
import sopra.promo404.vol.dao.IDaoCompagnieAerienne;
import sopra.promo404.vol.dao.IDaoCompagnieAerienneVol;
import sopra.promo404.vol.dao.IDaoReservation;
import sopra.promo404.vol.dao.IDaoVol;
import sopra.promo404.vol.model.CompagnieAerienne;
import sopra.promo404.vol.model.CompagnieAerienneVol;
import sopra.promo404.vol.model.Reservation;
import sopra.promo404.vol.model.Vol;

public class TestVal {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		IDaoCompagnieAerienne daoCompagnieAerienne = Singleton.getInstance().getDaoCompagnieAerienne();
		IDaoCompagnieAerienneVol daoCompagnieAerienneVol = Singleton.getInstance().getDaoCompagnieAerienneVol();
		IDaoVol daoVol = Singleton.getInstance().getDaoVol();
		IDaoReservation daoReservation = Singleton.getInstance().getDaoReservation();

		CompagnieAerienne airFrance = new CompagnieAerienne();
		airFrance.setNom("Air France");
		daoCompagnieAerienne.save(airFrance);

		CompagnieAerienne easyJet = new CompagnieAerienne();
		easyJet.setNom("Easy Jet");
		daoCompagnieAerienne.save(easyJet);

		CompagnieAerienneVol cav1 = new CompagnieAerienneVol();
		cav1.setNumero("cavNum1");
		cav1.setCompagnieAerienne(easyJet);
		daoCompagnieAerienneVol.save(cav1);

		CompagnieAerienneVol cav2 = new CompagnieAerienneVol();
		cav2.setNumero("cavNum2");
		daoCompagnieAerienneVol.save(cav2);

		Vol vol1 = new Vol();
		vol1.setDtDepart(new Date(118, 2, 3, 12, 00));
		vol1.setDtArrivee(new Date(118, 2, 3, 16, 00));
		vol1.setNbPlace(50);
		vol1.setOuvert(true);
		daoVol.save(vol1);

		Vol vol2 = new Vol();
		vol2.setDtDepart(new Date(118, 5, 23, 23, 50));
		vol2.setDtArrivee(new Date(118, 5, 24, 10, 00));
		vol2.setNbPlace(12);
		vol2.setOuvert(true);
		daoVol.save(vol2);

		Vol vol3 = new Vol();
		vol3.setDtDepart(new Date(118, 8, 14, 19, 37));
		vol3.setDtArrivee(new Date(118, 8, 14, 22, 40));
		vol3.setNbPlace(148);
		vol3.setOuvert(true);
		daoVol.save(vol3);

		Vol vol4 = new Vol();
		vol4.setDtDepart(new Date(118, 12, 22, 8, 24));
		vol4.setDtArrivee(new Date(118, 12, 22, 10, 55));
		vol4.setNbPlace(3);
		vol4.setOuvert(true);
		daoVol.save(vol4);

		Reservation resa1 = new Reservation();
		resa1.setCode("codeResa1");
		resa1.setDtResa(new Date(118, 1, 24, 12, 40));
		resa1.setConfirmee(false);
		resa1.setAnnulee(false);
		resa1.setVol(vol1);
		daoReservation.save(resa1);

		Reservation resa2 = new Reservation();
		resa2.setCode("codeResa2");
		resa2.setDtResa(new Date(118, 4, 12, 20, 00));
		resa2.setConfirmee(true);
		resa2.setAnnulee(false);
		resa2.setVol(vol2);
		daoReservation.save(resa2);

		Reservation resa3 = new Reservation();
		resa3.setCode("codeResa3");
		resa3.setDtResa(new Date(118, 7, 10, 10, 38));
		resa3.setConfirmee(false);
		resa3.setAnnulee(false);
		resa3.setVol(vol3);
		daoReservation.save(resa3);

		Reservation resa4 = new Reservation();
		resa4.setCode("codeResa4");
		resa4.setDtResa(new Date(118, 8, 20, 8, 13));
		resa4.setConfirmee(true);
		resa4.setAnnulee(true);
		resa4.setVol(vol4);
		daoReservation.save(resa4);

		
		
	}

}
