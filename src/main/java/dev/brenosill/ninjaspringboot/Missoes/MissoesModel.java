package dev.brenosill.ninjaspringboot.Missoes;
import dev.brenosill.ninjaspringboot.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "missoes")
@AllArgsConstructor  // Criar os construtores
@NoArgsConstructor //Construtor vazios
@Data // Getter e Setters
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idmissao;


    private String missao;
    private String dificuldade;



    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}
