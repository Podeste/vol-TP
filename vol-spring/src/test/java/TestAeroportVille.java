import java.text.ParseException;

import sopra.promo404.vol.Singleton;
import sopra.promo404.vol.dao.IDaoAeroport;
import sopra.promo404.vol.dao.IDaoAeroportVille;
import sopra.promo404.vol.dao.IDaoVille;
import sopra.promo404.vol.model.Aeroport;
import sopra.promo404.vol.model.AeroportVille;
import sopra.promo404.vol.model.Ville;

public class TestAeroportVille {
	public static void main(String[] args) throws ParseException {
		IDaoAeroportVille daoAeroportVille = Singleton.getInstance().getDaoAeroportVille();
		IDaoAeroport daoAeroport = Singleton.getInstance().getDaoAeroport();
		IDaoVille daoVille = Singleton.getInstance().getDaoVille();
		
		AeroportVille av1 = new AeroportVille();
		Aeroport jfk = daoAeroport.findByCode("JFK");
		av1.setAeroport(jfk);
		Ville newyork = daoVille.findByNom("New York");
		av1.setVille(newyork);
		daoAeroportVille.save(av1);
		
		AeroportVille av2 = new AeroportVille();
		Aeroport cdg = daoAeroport.findByCode("CDG");
		av2.setAeroport(cdg);
		Ville paris = daoVille.findByNom("Paris");
		av2.setVille(paris);
		daoAeroportVille.save(av2);
		
		AeroportVille av3 = new AeroportVille();
		Aeroport orly = daoAeroport.findByCode("ORL");
		av3.setAeroport(orly);
		
		av3.setVille(paris);
		daoAeroportVille.save(av3);
		
		AeroportVille av4 = new AeroportVille();
		Aeroport lax = daoAeroport.findByCode("LAX");
		av4.setAeroport(lax);
		Ville losangeles = daoVille.findByNom("Los Angeles");
		av4.setVille(losangeles);
		daoAeroportVille.save(av4);
		
		AeroportVille av5 = new AeroportVille();
		Aeroport merignac = daoAeroport.findByCode("BDX");
		av5.setAeroport(merignac);
		Ville bordeaux = daoVille.findByNom("Bordeaux");
		av5.setVille(bordeaux);
		daoAeroportVille.save(av5);
		

		
	}
}
