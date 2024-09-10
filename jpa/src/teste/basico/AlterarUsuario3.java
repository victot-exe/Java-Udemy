package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario3{
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 7L);
        em.detach(usuario);//=> diz que não é para sincronizar as alterações com o banco de dados a menos que seja feito o merge
        usuario.setNome("Milton");

        em.merge(usuario);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
