package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        Usuario user = new Usuario("Milton", "milton@gmail.com");


        em.getTransaction().begin();
        em.persist(user);//O id só é atribuido na hora em que fazemos a persistencia dos dados, para ser atribuido corretamente no Java e do DB
        em.getTransaction().commit();


        em.close();
        emf.close();
    }
}
