import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import sopra.promo404.vol.dao.IRepositoryClient;
import sopra.promo404.vol.dao.IRepositoryLogin;
import sopra.promo404.vol.dao.IRepositoryPassager;
import sopra.promo404.vol.model.Adresse;
import sopra.promo404.vol.model.Civilite;
import sopra.promo404.vol.model.Client;
import sopra.promo404.vol.model.FormeJuridique;
import sopra.promo404.vol.model.Login;
import sopra.promo404.vol.model.Particulier;
import sopra.promo404.vol.model.Passager;
import sopra.promo404.vol.model.Societe;

public class TestRepositoryTete {

	public static void main(String[] args) throws ParseException {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml"); 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		IRepositoryClient daoClient = context.getBean(IRepositoryClient.class);
		IRepositoryPassager daoPassager = context.getBean(IRepositoryPassager.class); 
		IRepositoryLogin daoLogin = context.getBean(IRepositoryLogin.class);

		Login bute = new Login();
		bute.setIdentifiant("Buuut");
		bute.setMotDePasse("capout");
		bute.setAdmin(true);
		daoLogin.save(bute);

		Societe but = new Societe();
		but.setNom("But");
		but.setNumeroTel("0548521488");
		but.setNumeroFax("014152698");
		but.setEmail("but@gmail.com");
		but.setAdresse(new Adresse("3 rue de la Cave", "33700", "Merignac", "France"));
		but.setSiret("256985");
		but.setFormeJuridique(FormeJuridique.SARL);

		but.setLogin(bute);
		daoClient.save(but);

		Login ssteria = new Login();
		ssteria.setIdentifiant("Ssteria");
		ssteria.setMotDePasse("vivelebillard");
		ssteria.setAdmin(true);
		daoLogin.save(ssteria);

		Societe sopra = new Societe();
		sopra.setNom("SopraSteria");
		sopra.setNumeroTel("0555392524");
		sopra.setNumeroFax("014152698");
		sopra.setEmail("soprasteria@gmail.com");
		sopra.setAdresse(new Adresse("14 rue Pÿthagore", "33700", "Merignac", "France"));
		sopra.setSiret("256985");
		sopra.setFormeJuridique(FormeJuridique.SARL);

		sopra.setLogin(ssteria);
		daoClient.save(sopra);

		Login huguesd = new Login();
		huguesd.setIdentifiant("Huguesd");
		huguesd.setMotDePasse("vivelegolf");
		huguesd.setAdmin(true);

		daoLogin.save(huguesd);

		Particulier hugues = new Particulier();
		hugues.setPrenom("Hugues");
		hugues.setCivilite(Civilite.MR);
		hugues.setNom("DeLaTourBlanche");
		hugues.setNumeroTel("0623232323");
		hugues.setNumeroFax("5217756");
		hugues.setEmail("huguesdelatourblanche@hotmail.fr");
		hugues.setAdresse(new Adresse("15 rue de la Tour Noire", "56000", "Metz", "France"));
		hugues.setLogin(huguesd);
		daoClient.save(hugues);

		Login fernandc = new Login();
		fernandc.setIdentifiant("Fernandc");
		fernandc.setMotDePasse("vivelepolo");
		fernandc.setAdmin(false);

		daoLogin.save(fernandc);

		Particulier fernand = new Particulier();
		fernand.setPrenom("Fernand");
		fernand.setCivilite(Civilite.MR);
		fernand.setNom("Compte");
		fernand.setNumeroTel("0614155222");
		fernand.setNumeroFax("5364584");
		fernand.setEmail("fernandcompte@hotmail.fr");
		fernand.setAdresse(new Adresse("15 rue de la Tour Blanche", "25151", "Dijon", "France"));
		fernand.setLogin(fernandc);
		daoClient.save(fernand);

		Passager jeanclaude = new Passager();
		jeanclaude.setNom("Dusse");
		jeanclaude.setPrenom("Jean-Claude");
		jeanclaude.setPieceIdentite("12155");
		jeanclaude.setAdresse(new Adresse("12 rue de la Marne", "75699", "Paris", "France"));
		jeanclaude.setDtNaissance(sdf.parse("02/02/1954"));

		daoPassager.save(jeanclaude);

		Passager jeanphilippe = new Passager();
		jeanphilippe.setNom("DelaTour");
		jeanphilippe.setPrenom("Jean-Philippe");
		jeanphilippe.setPieceIdentite("1478522");
		jeanphilippe.setAdresse(new Adresse("4 rue de la Paix", "75009", "Paris", "France"));
		jeanphilippe.setDtNaissance(sdf.parse("01/10/1957"));

		daoPassager.save(jeanphilippe);

		Passager jacques = new Passager();
		jacques.setNom("Beauregard");
		jacques.setPrenom("Jacques");
		jacques.setPieceIdentite("155252");
		jacques.setAdresse(new Adresse("23 avenue des Champs-Elysée", "75008", "Paris", "France"));
		jacques.setDtNaissance(sdf.parse("22/01/1958"));

		daoPassager.save(jacques);

		Passager francis = new Passager();
		francis.setNom("Lalanne");
		francis.setPrenom("Francis");
		francis.setPieceIdentite("122525");
		francis.setAdresse(new Adresse("8 rue Malherbes", "75004", "Paris", "France"));
		francis.setDtNaissance(sdf.parse("23/12/1960"));

		daoPassager.save(francis);

	}
}
