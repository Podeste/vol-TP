import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import sopra.promo404.vol.Singleton;
import sopra.promo404.vol.dao.IDaoAeroport;
import sopra.promo404.vol.dao.IDaoEscale;
import sopra.promo404.vol.dao.IDaoVol;
import sopra.promo404.vol.model.Aeroport;
import sopra.promo404.vol.model.Escale;
import sopra.promo404.vol.model.Vol;

public class TestEscaleAvecLiens {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		IDaoEscale daoEscale = Singleton.getInstance().getDaoEscale();
		IDaoAeroport daoAeroport = Singleton.getInstance().getDaoAeroport();
		IDaoVol daoVol = Singleton.getInstance().getDaoVol();
		List<Escale> escales = daoEscale.findAll();
		List<Aeroport> aeroports = daoAeroport.findAll();
		List<Vol> vols = daoVol.findAll();
		
//		escales.get(0).setAeroport(aeroports.get(4));
//		escales.get(1).setAeroport(aeroports.get(1));
//		escales.get(2).setAeroport(aeroports.get(2));
//		escales.get(3).setAeroport(aeroports.get(0));

//		vols.get(0).getEscales().add(escales.get(0));
//		vols.get(0).getEscales().add(escales.get(1));
//		vols.get(1).getEscales().add(escales.get(2));
//		vols.get(2).getEscales().add(escales.get(3));

		escales.get(0).setVol(vols.get(0));
		escales.get(1).setVol(vols.get(0));
		escales.get(2).setVol(vols.get(1));
		escales.get(3).setVol(vols.get(2));

		daoEscale.save(escales.get(0));
		daoEscale.save(escales.get(1));
		daoEscale.save(escales.get(2));
		daoEscale.save(escales.get(3));
		daoVol.save(vols.get(0));
		daoVol.save(vols.get(1));
		daoVol.save(vols.get(2));
		daoVol.save(vols.get(3));
		
	}
}
