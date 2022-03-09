package com.example.crudcomJPA.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.example.crudcomJPA.model.Produto;
import org.springframework.stereotype.Repository;


@Repository
public class ProdutoRepository {

    @PersistenceContext
    private EntityManager em;

    public Produto Produto(int id_produto) {
        return em.find(Produto.class, id_produto);
    }

    @SuppressWarnings("unchecked")
    public List<Produto> produtos(){
        Query query = em.createQuery("from Produto");
        return query.getResultList();
    }
}