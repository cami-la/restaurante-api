package me.dio.devweek.potenciatech.restaurante.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Data
@Builder
@Entity
@NoArgsConstructor
public class Restaurante {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nomeFantasia;
  private String cnpj;
  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name = "restaurante_id")
  private List<Produto> cardapio;
  @Embedded
  private Endereco endereco;
}
