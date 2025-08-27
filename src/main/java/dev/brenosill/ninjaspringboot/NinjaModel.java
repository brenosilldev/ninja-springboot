package dev.brenosill.ninjaspringboot;


import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

// Transforme em entidade do banco de dados
@Entity
@Table(name = "ninjas")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String nome;
    public int idade;
    public String aldeia;

    public NinjaModel(){

    }

    public NinjaModel(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

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
