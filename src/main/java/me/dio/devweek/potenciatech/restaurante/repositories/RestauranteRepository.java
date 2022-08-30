package me.dio.devweek.potenciatech.restaurante.repositories;

import me.dio.devweek.potenciatech.restaurante.entities.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
}
