package me.dio.devweek.potenciatech.restaurante.services.impl;

import lombok.RequiredArgsConstructor;
import me.dio.devweek.potenciatech.restaurante.entities.Endereco;
import me.dio.devweek.potenciatech.restaurante.entities.Restaurante;
import me.dio.devweek.potenciatech.restaurante.resources.dto.RestauranteDto;
import me.dio.devweek.potenciatech.restaurante.repositories.RestauranteRepository;
import me.dio.devweek.potenciatech.restaurante.services.RestauranteService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class RestauranteServiceImpl implements RestauranteService {
  private final RestauranteRepository restauranteRepository;

  @Override
  public Restaurante incluir(RestauranteDto form) {
    /*Restaurante restaurante = new Restaurante();
    restaurante.setNomeFantasia(form.getNomeFantasia());*/
    Restaurante novoRestaurante = Restaurante.builder()
        .nomeFantasia(form.getNomeFantasia())
        .cnpj(form.getCnpj())
        .cardapio(new ArrayList<>())
        .endereco(Endereco.builder()
            .cep(form.getCep())
            .complemento(form.getComplemento())
            .build())
        .build();
    return restauranteRepository.save(novoRestaurante);
  }

  @Override
  public List<Restaurante> buscarTodos() {
    return restauranteRepository.findAll();
  }

  @Override
  public Restaurante buscarPorId(Long id) {
    return restauranteRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Id '%d' não encontrado".formatted(id)));
  }

  @Override
  public Restaurante atualizar(Long id, RestauranteDto form) {
    Restaurante restauranteAtualizado = buscarPorId(id);
    restauranteAtualizado.setNomeFantasia(form.getNomeFantasia());
    restauranteAtualizado.setCnpj(form.getCnpj());
    restauranteAtualizado.setEndereco(Endereco.builder()
        .cep(form.getCep())
        .complemento(form.getComplemento())
        .build());
    return restauranteRepository.save(restauranteAtualizado);
  }

  @Override
  public void deletar(Long id) {
    Restaurante restauranteParaDeletar = buscarPorId(id);
    restauranteRepository.delete(restauranteParaDeletar);
  }
}
