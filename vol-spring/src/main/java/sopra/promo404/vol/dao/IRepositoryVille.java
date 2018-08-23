package sopra.promo404.vol.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.promo404.vol.model.Ville;

public interface IRepositoryVille extends JpaRepository<Ville, Long> {
	Ville findByNom(String nom);
}
