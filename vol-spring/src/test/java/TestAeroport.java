import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import sopra.promo404.vol.Singleton;
import sopra.promo404.vol.dao.IRepositoryAeroport;
import sopra.promo404.vol.model.Aeroport;

public class TestAeroport {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		IRepositoryAeroport daoAeroport = Singleton.getInstance().getDaoAeroport();

		Aeroport jfk = new Aeroport();
		jfk.setCode("JFK");
		jfk.setVersion(0);
		
		daoAeroport.save(jfk);

		Aeroport cdg = new Aeroport();
		cdg.setCode("CDG");
		cdg.setVersion(0);
		daoAeroport.save(cdg);

		Aeroport orly = new Aeroport();
		orly.setCode("ORL");
		orly.setVersion(0);
		daoAeroport.save(orly);

		Aeroport lax = new Aeroport();
		lax.setCode("LAX");
		lax.setVersion(0);
		daoAeroport.save(lax);
		
		Aeroport merignac = new Aeroport();
		merignac.setCode("BDX");
		merignac.setVersion(0);
		daoAeroport.save(merignac);

		
	}
}
