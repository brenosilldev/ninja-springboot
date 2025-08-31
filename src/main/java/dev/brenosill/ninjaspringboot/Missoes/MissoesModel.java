package dev.brenosill.ninjaspringboot.Missoes;
import dev.brenosill.ninjaspringboot.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "missoes")
public class MissoesModel {

    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idmissao;
    private String missao;
    private String dificuldade;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;



}
