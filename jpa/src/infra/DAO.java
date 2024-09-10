package infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class DAO <E>{
    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> classe;

    static {
        try{
            emf = Persistence.createEntityManagerFactory("jpa");
        }catch(Exception e){
            //logar -> log4j
        }
    }

    public DAO(){
        this(null);
    }

    public DAO(Class<E> classe){
        this.classe = classe;
        em = emf.createEntityManager();
    }

    public DAO<E> abriTransacao(){
        em.getTransaction().begin();
        return this;
    }

    public DAO<E> fecharTransacao(){
        em.getTransaction().commit();
        return this;
    }

    public DAO<E> incluir(E entidade){
        em.persist(entidade);
        return this;
    }

    public DAO<E> incluirAtomico(E entidade){
        return this.abriTransacao().incluir(entidade).fecharTransacao();
    }

    public E obterPorID(Object id){
        return em.find(classe, id);
    }

    public List<E> obterTodos(int qtd, int deslocamento){
        if(classe == null){
            throw new UnsupportedOperationException("Classe está nula");
        }

        String jpql = "select e from " + classe.getName() + " e";
        TypedQuery<E> query = em.createQuery(jpql, classe);
        query.setMaxResults(qtd);
        query.setFirstResult(deslocamento);

        return query.getResultList();
    }

    public List<E> obterTodos(){
        return obterTodos(10, 0);
    }

    public void fechar(){
        em.close();
    }
}