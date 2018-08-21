import java.util.Date;

import sopra.promo404.vol.Singleton;
import sopra.promo404.vol.dao.IDaoReservation;
import sopra.promo404.vol.model.Reservation;

public class TestReservation {

	public static void main(String[] args) {

		IDaoReservation daoReservation = Singleton.getInstance().getDaoReservation();
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

	}

}
