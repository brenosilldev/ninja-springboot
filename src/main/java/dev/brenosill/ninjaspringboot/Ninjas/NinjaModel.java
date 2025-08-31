package dev.brenosill.ninjaspringboot.Ninjas;


import dev.brenosill.ninjaspringboot.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

// Transforme em entidade do banco de dados
@Entity
@Table(name = "ninjas")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idninja;
    private String nome;
    private int idade;
    private String aldeia;

    //Uma unica missao por vez
    @ManyToMany
    @JoinColumn(name = "missoes_idmissao")
    private MissoesModel missoes;


    public NinjaModel(Long id, String nome, int idade, String aldeia, MissoesModel missoes) {
        this.idninja = id;
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.missoes = missoes;
    }

    public


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }
}
