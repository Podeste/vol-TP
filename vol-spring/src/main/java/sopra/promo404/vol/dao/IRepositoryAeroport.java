package sopra.promo404.vol.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.promo404.vol.model.Aeroport;

public interface IRepositoryAeroport extends JpaRepository<Aeroport, Long>{

	Aeroport findByCode(String code);

}
