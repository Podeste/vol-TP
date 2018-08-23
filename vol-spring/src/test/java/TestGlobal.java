import java.text.ParseException;

import javax.persistence.EntityManager;

import sopra.promo404.vol.Singleton;


public class TestGlobal {
	public static void main(String[] args) throws ParseException {
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();
	}
}
