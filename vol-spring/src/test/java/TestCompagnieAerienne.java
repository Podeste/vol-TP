import java.text.ParseException;
import java.text.SimpleDateFormat;

import sopra.promo404.vol.Singleton;
import sopra.promo404.vol.dao.IDaoCompagnieAerienne;
import sopra.promo404.vol.model.CompagnieAerienne;

public class TestCompagnieAerienne {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		IDaoCompagnieAerienne daoCompagnieAerienne = Singleton.getInstance().getDaoCompagnieAerienne();

		CompagnieAerienne airFrance = new CompagnieAerienne();
		airFrance.setNom("Air France");
		daoCompagnieAerienne.save(airFrance);

		CompagnieAerienne easyJet = new CompagnieAerienne();
		easyJet.setNom("Easy Jet");
		daoCompagnieAerienne.save(easyJet);

		

		
		
	}

}
