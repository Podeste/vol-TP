import java.text.SimpleDateFormat;

import sopra.promo404.vol.Singleton;
import sopra.promo404.vol.dao.IDaoClient;
import sopra.promo404.vol.dao.IDaoLogin;
import sopra.promo404.vol.dao.IDaoPassager;
import sopra.promo404.vol.model.Adresse;
import sopra.promo404.vol.model.Civilite;
import sopra.promo404.vol.model.Client;
import sopra.promo404.vol.model.FormeJuridique;
import sopra.promo404.vol.model.Login;
import sopra.promo404.vol.model.Particulier;
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
	but.setSiret("256985");
	but.setFormeJuridique(FormeJuridique.SARL);
	 
	daoClient.save(but); 
	
	Login bute =new Login(); 
	bute.setIdentifiant("Buuut");
	bute.setMotDePasse("capout");
	bute.setAdmin(true);
	
	daoLogin.save(bute); 
	but.setLogin(bute);
	
	
	
	
	Societe sopra = new Societe();
	sopra.setNom("SopraSteria");
	sopra.setNumeroTel("0555392524");
	sopra.setNumeroFax("014152698");
	sopra.setEmail("soprasteria@gmail.com");
	sopra.setAdresse(new Adresse("14 rue Pÿthagore", "33700", "Merignac", "France"));
	sopra.setSiret("256985");
	sopra.setFormeJuridique(FormeJuridique.SARL);
	 
	daoClient.save(sopra); 
	
	Login ssteria =new Login(); 
	ssteria.setIdentifiant("Ssteria");
	ssteria.setMotDePasse("vivelebillard");
	ssteria.setAdmin(true);
	
	daoLogin.save(ssteria); 
	sopra.setLogin(ssteria); 
	
	
	Particulier hugues = new Particulier(); 
	hugues.setPrenom("Hugues");
	hugues.setCivilite(Civilite.MR);
	hugues.setNom("DeLaTourBlanche");
	hugues.setNumeroTel("0623232323");
	hugues.setNumeroFax("5217756");
	hugues.setEmail("huguesdelatourblanche@hotmail.fr");
	
	daoClient.save(hugues); 
	
	Particulier fernand = new Particulier(); 
	fernand.setPrenom("Fernand");
	fernand.setCivilite(Civilite.MR);
	fernand.setNom("Compte");
	fernand.setNumeroTel("0614155222");
	fernand.setNumeroFax("5364584");
	fernand.setEmail("fernandcompte@hotmail.fr");
	
	daoClient.save(fernand); 
		
	
	
	
	Passager jeanclaude = new Passager();
	jeanclaude.setNom("Dusse");
	jeanclaude.setPrenom("Jean-Claude");
	jeanclaude.setPieceIdentite("12155");
	jeanclaude.setAdresse(new Adresse("12 rue de la Marne", "75699", "Paris", "France"));
	
	daoPassager.save(jeanclaude);
	
	Passager jeanphilippe = new Passager();
	jeanphilippe.setNom("DelaTour");
	jeanphilippe.setPrenom("Jean-Philippe");
	jeanphilippe.setPieceIdentite("1478522");
	jeanphilippe.setAdresse(new Adresse("4 rue de la Paix", "75009", "Paris", "France"));
	
	daoPassager.save(jeanphilippe);
	
	Passager jacques = new Passager();
	jacques.setNom("Beauregard");
	jacques.setPrenom("Jacques");
	jacques.setPieceIdentite("155252");
	jacques.setAdresse(new Adresse("23 avenue des Champs-Elysée", "75008", "Paris", "France"));
	
	daoPassager.save(jacques);
	
	Passager francis = new Passager();
	francis.setNom("Lalanne");
	francis.setPrenom("Francis");
	francis.setPieceIdentite("122525");
	francis.setAdresse(new Adresse("8 rue Malherbes", "75004", "Paris", "France"));
	
	daoPassager.save(francis);
	
	
	
	
	
	}
}


