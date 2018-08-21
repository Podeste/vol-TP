import java.util.Date;

import sopra.promo404.vol.Singleton;
import sopra.promo404.vol.dao.IDaoVol;
import sopra.promo404.vol.model.Vol;

public class TestVol {

	public static void main(String[] args) {

		IDaoVol daoVol = Singleton.getInstance().getDaoVol();
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
	}

}
