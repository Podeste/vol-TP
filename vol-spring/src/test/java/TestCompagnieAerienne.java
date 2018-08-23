import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sopra.promo404.vol.dao.IRepositoryCompagnieAerienne;
import sopra.promo404.vol.model.CompagnieAerienne;

public class TestCompagnieAerienne {

	public static void main(String[] args) throws ParseException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:application-context.xml");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		IRepositoryCompagnieAerienne repoCompagnieAerienne = context.getBean(IRepositoryCompagnieAerienne.class);

		CompagnieAerienne airFrance = new CompagnieAerienne();
		airFrance.setNom("Air France");
		repoCompagnieAerienne.save(airFrance);

		CompagnieAerienne easyJet = new CompagnieAerienne();
		easyJet.setNom("Easy Jet");
		repoCompagnieAerienne.save(easyJet);

	}

}
