import sopra.promo404.vol.Singleton;
import sopra.promo404.vol.dao.IRepositoryCompagnieAerienneVol;
import sopra.promo404.vol.model.CompagnieAerienneVol;

public class TestCompagnieAerienneVol {

	public static void main(String[] args) {

		IRepositoryCompagnieAerienneVol daoCompagnieAerienneVol = Singleton.getInstance().getDaoCompagnieAerienneVol();
		
		CompagnieAerienneVol cav1 = new CompagnieAerienneVol();
		cav1.setNumero("cavNum1");
		daoCompagnieAerienneVol.save(cav1);

		CompagnieAerienneVol cav2 = new CompagnieAerienneVol();
		cav2.setNumero("cavNum2");
		daoCompagnieAerienneVol.save(cav2);
	}

}
