package dev.brenosill.ninjaspringboot.Ninjas;


import dev.brenosill.ninjaspringboot.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

// Transforme em entidade do banco de dados
@Entity
@Table(name = "ninjas")
@AllArgsConstructor
@NoArgsConstructor // Criar os construtores
@Data // Getter e Setters
public class NinjaModel {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idninja;

    @Column(length = 100,name = "nome")
    private String nome;
    @Column(length = 100,name = "idade")
    private int idade;
    @Column(length = 100,name = "aldeia")
    private String aldeia;

    //Uma unica missao por vez
    @ManyToMany
    @JoinTable(name = "missoes_idmissao")
    private List<MissoesModel> missoes;



}
