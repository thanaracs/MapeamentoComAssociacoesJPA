package com.example.crudcomJPA.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.example.crudcomJPA.model.Venda;
import org.springframework.stereotype.Repository;


@Repository
public class VendaRepository {

    @PersistenceContext
    private EntityManager em;

    public Venda Venda(int id_venda) {
        return em.find(Venda.class, id_venda);
    }

    public List<Venda> vendas(){
        Query query = em.createQuery("from Venda");
        return query.getResultList();
    }

}