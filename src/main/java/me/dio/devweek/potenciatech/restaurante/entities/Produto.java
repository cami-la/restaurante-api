package me.dio.devweek.potenciatech.restaurante.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
@AllArgsConstructor
@Data
@Builder
@Entity
@NoArgsConstructor
public class Produto {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String nome;
  private Boolean disponivel;
  private BigDecimal valorUnitario;
}
