package me.dio.devweek.potenciatech.restaurante.services;

import me.dio.devweek.potenciatech.restaurante.entities.Restaurante;
import me.dio.devweek.potenciatech.restaurante.resources.dto.RestauranteDto;

import java.util.List;

public interface RestauranteService {
  Restaurante incluir(RestauranteDto form);
  List<Restaurante> buscarTodos();
  Restaurante buscarPorId(Long id);
  Restaurante atualizar(Long id, RestauranteDto form);
  void deletar(Long id);
}
