import java.text.ParseException;
import java.text.SimpleDateFormat;

import sopra.promo404.vol.Singleton;
import sopra.promo404.vol.dao.IDaoVille;
import sopra.promo404.vol.model.Ville;



public class TestVille {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		IDaoVille daoVille = Singleton.getInstance().getDaoVille();

		Ville paris = new Ville();
		paris.setCodePostal("75001");
		paris.setNom("Paris");
		paris.setVersion(0);
		
		daoVille.save(paris);

		Ville bordeaux = new Ville();
		bordeaux.setCodePostal("33000");
		bordeaux.setNom("Bordeaux");
		bordeaux.setVersion(0);
		daoVille.save(bordeaux);

		Ville newyork = new Ville();
		newyork.setCodePostal("4455");
		newyork.setNom("New York");
		newyork.setVersion(0);
		daoVille.save(newyork);

		Ville losangeles = new Ville();
		losangeles.setCodePostal("8881");
		losangeles.setNom("Los Angeles");
		losangeles.setVersion(0);
		daoVille.save(losangeles);

		
	}
}
