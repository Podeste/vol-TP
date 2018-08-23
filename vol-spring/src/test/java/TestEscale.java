import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import sopra.promo404.vol.Singleton;
import sopra.promo404.vol.dao.IDaoEscale;
import sopra.promo404.vol.model.Escale;

public class TestEscale {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		IDaoEscale daoEscale = Singleton.getInstance().getDaoEscale();

		Escale escale1 = new Escale();
		escale1.sethArrivee(new Date(118,1,3,12,50));
		escale1.sethDepart(new Date(118,1,3,12,55));
		escale1.setVersion(0);
		
		daoEscale.save(escale1);

		Escale escale2 = new Escale();
		escale2.sethArrivee(new Date(118,1,3,14,25));
		escale2.sethDepart(new Date(118,1,3,14,30));
		escale2.setVersion(0);
		daoEscale.save(escale2);

		Escale escale3 = new Escale();
		escale3.sethArrivee(new Date(118,4,24,6,40));
		escale3.sethDepart(new Date(118,4,24,6,42));
		escale3.setVersion(0);
		daoEscale.save(escale3);

		Escale escale4 = new Escale();
		escale4.sethArrivee(new Date(118,7,14,20,50));
		escale4.sethDepart(new Date(118,7,14,20,54));
		escale4.setVersion(0);
		daoEscale.save(escale4);

		
	}
}
