package me.dio.devweek.potenciatech.restaurante.resources.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class RestauranteDto {
  private String nomeFantasia;
  private String cnpj;
  private String cep;
  private String complemento;
}
