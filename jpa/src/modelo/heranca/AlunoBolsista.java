package modelo.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@DiscriminatorValue("AB")
public class AlunoBolsista extends Aluno{

    private Double valorBolsa;

    public AlunoBolsista() {}

    public AlunoBolsista(Long matricula, String nome, Double valorBolsa){
        super(matricula, nome);
        this.valorBolsa = valorBolsa;
    }
}
