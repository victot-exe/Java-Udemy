package modelo.basico;

import javax.persistence.*;

@Entity
@Table(name = "produtos", schema = "curso_java")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "prod_nome", length = 200, nullable = false)
    private String nome;

    @Column(name = "prod_preco", nullable = false, precision = 11, scale = 2)
    private Double preco;

    public Produto() {}
    public Produto(String nome, Double preco) {
        super();
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
