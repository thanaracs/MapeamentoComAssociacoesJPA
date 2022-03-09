package com.example.crudcomJPA.dao;

import com.example.crudcomJPA.model.ItemVenda;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

@Repository
public class ItemProdutoRepository {

    @PersistenceContext
    private EntityManager em;

    public ItemVenda ItemVenda(int id_itemVenda) {
        return em.find(ItemVenda.class, id_itemVenda);
    }

    @SuppressWarnings("unchecked")
    public List<ItemVenda> itemVendas(){
        Query query = em.createQuery("from ItemVenda");
        return query.getResultList();
    }
}