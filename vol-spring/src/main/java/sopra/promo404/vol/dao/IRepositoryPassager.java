package sopra.promo404.vol.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.promo404.vol.model.Passager;

public interface IRepositoryPassager extends JpaRepository<Passager, Long> {
}