import java.text.SimpleDateFormat;

import sopra.promo404.vol.Singleton;
import sopra.promo404.vol.dao.IDaoClient;
import sopra.promo404.vol.dao.IDaoLogin;
import sopra.promo404.vol.dao.IDaoPassager;
import sopra.promo404.vol.model.Adresse;
import sopra.promo404.vol.model.Client;
import sopra.promo404.vol.model.Passager;
import sopra.promo404.vol.model.Societe;


public class TestTete {

	public static void main(String[] args) {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	IDaoClient daoClient = Singleton.getInstance().getDaoClient(); 
	IDaoPassager daoPassager = Singleton.getInstance().getDaoPassager(); 
	IDaoLogin daoLogin = Singleton.getInstance().getDaoLogin(); 
	
	
	Societe but = new Societe();
	but.setNom("But");
	but.setNumeroTel("0548521488");
	but.setNumeroFax("014152698");
	but.setEmail("but@gmail.com");
	but.setAdresse(new Adresse("3 rue de la Cave", "33700", "Merignac", "France"));
	 
	daoClient.save(but); 
	
	
	Passager jeanclaude = new Passager();
	jeanclaude.setNom("Dusse");
	jeanclaude.setPrenom("Jean-Claude");
	jeanclaude.setPieceIdentite("12155");
	jeanclaude.setAdresse(new Adresse("12 rue de la Marne", "23699", "Paris", "France"));
	
	daoPassager.save(jeanclaude);
	
	
	}
}


