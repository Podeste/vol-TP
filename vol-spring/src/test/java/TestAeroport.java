import java.text.ParseException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sopra.promo404.vol.dao.IRepositoryAeroport;
import sopra.promo404.vol.model.Aeroport;

public class TestAeroport {
	public static void main(String[] args) throws ParseException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:application-context.xml");
		IRepositoryAeroport daoAeroport = context.getBean(IRepositoryAeroport.class);

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
