import java.text.ParseException;
import java.text.SimpleDateFormat;

import sopra.promo404.vol.Singleton;
import sopra.promo404.vol.dao.IDaoReservation;
import sopra.promo404.vol.model.Reservation;

public class TestVal {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		IDaoReservation daoReservation = Singleton.getInstance().getDaoReservation();
		
		Reservation resa001 = new Reservation();
		daoReservation.save(resa001);
	}

}
