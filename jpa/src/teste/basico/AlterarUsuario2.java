package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario2 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 7L);
        usuario.setNome("Vo alterado");

//        em.merge(usuario);
//Por se tratar de um ambiente transacional, todas as alterações feitas, mesmo que sem o comando de .merge serão sincronizadas com o banco de dados.
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
