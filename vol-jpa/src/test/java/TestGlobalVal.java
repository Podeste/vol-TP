import java.text.ParseException;
import java.text.SimpleDateFormat;

import sopra.promo404.vol.Singleton;
import sopra.promo404.vol.dao.IDaoAeroport;
import sopra.promo404.vol.dao.IDaoAeroportVille;
import sopra.promo404.vol.dao.IDaoClient;
import sopra.promo404.vol.dao.IDaoCompagnieAerienne;
import sopra.promo404.vol.dao.IDaoCompagnieAerienneVol;
import sopra.promo404.vol.dao.IDaoEscale;
import sopra.promo404.vol.dao.IDaoLogin;
import sopra.promo404.vol.dao.IDaoPassager;
import sopra.promo404.vol.dao.IDaoReservation;
import sopra.promo404.vol.dao.IDaoVille;
import sopra.promo404.vol.dao.IDaoVol;
import sopra.promo404.vol.model.Adresse;
import sopra.promo404.vol.model.Aeroport;
import sopra.promo404.vol.model.AeroportVille;
import sopra.promo404.vol.model.Civilite;
import sopra.promo404.vol.model.CompagnieAerienne;
import sopra.promo404.vol.model.CompagnieAerienneVol;
import sopra.promo404.vol.model.Escale;
import sopra.promo404.vol.model.FormeJuridique;
import sopra.promo404.vol.model.Login;
import sopra.promo404.vol.model.Particulier;
import sopra.promo404.vol.model.Passager;
import sopra.promo404.vol.model.Reservation;
import sopra.promo404.vol.model.Societe;
import sopra.promo404.vol.model.Ville;
import sopra.promo404.vol.model.Vol;

public class TestGlobalVal {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");

		IDaoAeroportVille daoAeroportVille = Singleton.getInstance().getDaoAeroportVille();
		IDaoAeroport daoAeroport = Singleton.getInstance().getDaoAeroport();
		IDaoVille daoVille = Singleton.getInstance().getDaoVille();
		IDaoReservation daoReservation = Singleton.getInstance().getDaoReservation();
		IDaoVol daoVol = Singleton.getInstance().getDaoVol();
		IDaoEscale daoEscale = Singleton.getInstance().getDaoEscale();
		IDaoCompagnieAerienne daoCompagnieAerienne = Singleton.getInstance().getDaoCompagnieAerienne();
		IDaoCompagnieAerienneVol daoCompagnieAerienneVol = Singleton.getInstance().getDaoCompagnieAerienneVol();
		IDaoClient daoClient = Singleton.getInstance().getDaoClient();
		IDaoPassager daoPassager = Singleton.getInstance().getDaoPassager();
		IDaoLogin daoLogin = Singleton.getInstance().getDaoLogin();

		Reservation resa1 = new Reservation();
		resa1.setCode("codeResa1");
		resa1.setDtResa(sdf2.parse("2018-12-24 12:40"));
		resa1.setConfirmee(false);
		resa1.setAnnulee(false);
		daoReservation.save(resa1);

		Reservation resa2 = new Reservation();
		resa2.setCode("codeResa2");
		resa2.setDtResa(sdf2.parse("2018-04-12 20:00"));
		resa2.setConfirmee(true);
		resa2.setAnnulee(false);
		daoReservation.save(resa2);

		Reservation resa3 = new Reservation();
		resa3.setCode("codeResa3");
		resa3.setDtResa(sdf2.parse("2018-07-10 10:38"));
		resa3.setConfirmee(false);
		resa3.setAnnulee(false);
		daoReservation.save(resa3);

		Reservation resa4 = new Reservation();
		resa4.setCode("codeResa4");
		resa4.setDtResa(sdf2.parse("2018-08-20 08:13"));
		resa4.setConfirmee(true);
		resa4.setAnnulee(true);
		daoReservation.save(resa4);

		Aeroport jfk = new Aeroport();
		jfk.setCode("JFK");

		daoAeroport.save(jfk);

		Aeroport cdg = new Aeroport();
		cdg.setCode("CDG");
		daoAeroport.save(cdg);

		Aeroport orly = new Aeroport();
		orly.setCode("ORL");
		daoAeroport.save(orly);

		Aeroport lax = new Aeroport();
		lax.setCode("LAX");
		daoAeroport.save(lax);

		Aeroport merignac = new Aeroport();
		merignac.setCode("BDX");
		daoAeroport.save(merignac);

		Vol vol1 = new Vol();
		vol1.setDtDepart(sdf2.parse("2018-02-03 12:00"));
		vol1.setDtArrivee(sdf2.parse("2018-02-03 16:00"));
		vol1.setNbPlace(50);
		vol1.setOuvert(true);
		vol1.setDepart(jfk);
		vol1.setArrivee(merignac);
		daoVol.save(vol1);

		Vol vol2 = new Vol();
		vol2.setDtDepart(sdf2.parse("2018-05-23 23:50"));
		vol2.setDtArrivee(sdf2.parse("2018-05-24 10:00"));
		vol2.setNbPlace(12);
		vol2.setOuvert(true);
		vol2.setDepart(merignac);
		vol2.setArrivee(lax);
		daoVol.save(vol2);

		Vol vol3 = new Vol();
		vol3.setDtDepart(sdf2.parse("2018-08-14 19:37"));
		vol3.setDtArrivee(sdf2.parse("2018-08-14 22:40"));
		vol3.setNbPlace(148);
		vol3.setOuvert(true);
		vol3.setDepart(orly);
		vol3.setArrivee(cdg);
		daoVol.save(vol3);

		Vol vol4 = new Vol();
		vol4.setDtDepart(sdf2.parse("2018-12-22 08:24"));
		vol4.setDtArrivee(sdf2.parse("2018-12-22 10:55"));
		vol4.setNbPlace(3);
		vol4.setOuvert(true);
		vol4.setDepart(cdg);
		vol4.setDepart(jfk);
		daoVol.save(vol4);

		Escale escale1 = new Escale();
		escale1.sethArrivee(sdf2.parse("2018-01-03 12:50"));
		escale1.sethDepart(sdf2.parse("2018-01-03 12:55"));
		daoEscale.save(escale1);

		Escale escale2 = new Escale();
		escale2.sethArrivee(sdf2.parse("2018-01-03 14:25"));
		escale2.sethDepart(sdf2.parse("2018-01-03 14:30"));
		daoEscale.save(escale2);

		Escale escale3 = new Escale();
		escale3.sethArrivee(sdf2.parse("2018-04-24 06:40"));
		escale3.sethDepart(sdf2.parse("2018-04-24 06:42"));
		daoEscale.save(escale3);

		Escale escale4 = new Escale();
		escale4.sethArrivee(sdf2.parse("2018-07-14 20:50"));
		escale4.sethDepart(sdf2.parse("2018-07-14 20:54"));
		daoEscale.save(escale4);

		Ville paris = new Ville();
		paris.setCodePostal("75001");
		paris.setNom("Paris");
		daoVille.save(paris);

		Ville bordeaux = new Ville();
		bordeaux.setCodePostal("33000");
		bordeaux.setNom("Bordeaux");
		daoVille.save(bordeaux);

		Ville newyork = new Ville();
		newyork.setCodePostal("4455");
		newyork.setNom("New York");
		daoVille.save(newyork);

		Ville losangeles = new Ville();
		losangeles.setCodePostal("8881");
		losangeles.setNom("Los Angeles");
		daoVille.save(losangeles);

		AeroportVille av1 = new AeroportVille();
		av1.setAeroport(jfk);
		av1.setVille(newyork);
		daoAeroportVille.save(av1);

		AeroportVille av2 = new AeroportVille();
		av2.setAeroport(cdg);
		av2.setVille(paris);
		daoAeroportVille.save(av2);

		AeroportVille av3 = new AeroportVille();
		av3.setAeroport(orly);
		av3.setVille(paris);
		daoAeroportVille.save(av3);

		AeroportVille av4 = new AeroportVille();
		av4.setAeroport(lax);
		av4.setVille(losangeles);
		daoAeroportVille.save(av4);

		AeroportVille av5 = new AeroportVille();
		av5.setAeroport(merignac);
		av5.setVille(bordeaux);
		daoAeroportVille.save(av5);

		CompagnieAerienne airFrance = new CompagnieAerienne();
		airFrance.setNom("Air France");
		daoCompagnieAerienne.save(airFrance);

		CompagnieAerienne easyJet = new CompagnieAerienne();
		easyJet.setNom("Easy Jet");
		daoCompagnieAerienne.save(easyJet);

		CompagnieAerienneVol cav1 = new CompagnieAerienneVol();
		cav1.setNumero("cavNum1");
		cav1.setCompagnieAerienne(easyJet);
		cav1.setVol(vol1);
		daoCompagnieAerienneVol.save(cav1);

		CompagnieAerienneVol cav2 = new CompagnieAerienneVol();
		cav2.setNumero("cavNum2");
		cav2.setCompagnieAerienne(airFrance);
		cav2.setVol(vol2);
		daoCompagnieAerienneVol.save(cav2);

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
