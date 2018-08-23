import org.springframework.context.support.ClassPathXmlApplicationContext;

import sopra.promo404.vol.dao.IRepositoryCompagnieAerienneVol;
import sopra.promo404.vol.model.CompagnieAerienneVol;

public class TestCompagnieAerienneVol {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:application-context.xml");

		IRepositoryCompagnieAerienneVol repoCompagnieAerienneVol = context
				.getBean(IRepositoryCompagnieAerienneVol.class);

		CompagnieAerienneVol cav1 = new CompagnieAerienneVol();
		cav1.setNumero("cavNum1");
		repoCompagnieAerienneVol.save(cav1);

		CompagnieAerienneVol cav2 = new CompagnieAerienneVol();
		cav2.setNumero("cavNum2");
		repoCompagnieAerienneVol.save(cav2);
	}

}
