package com.example.crudcomJPA.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tb_venda")
public class Venda implements Serializable {

    @Id
    @GeneratedValue
    private int idVenda;
    private Date data;

    @OneToMany(mappedBy = "venda")
    private List<ItemVenda> itemVenda;

    public int getIdVenda() {
        return idVenda;
    }

    public void setId(int idVenda) {
        this.idVenda = idVenda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<ItemVenda> getItemVenda() {
        return itemVenda;
    }

    public void setItemVenda(List<ItemVenda> itemVenda) {
        this.itemVenda = itemVenda;
    }


    public double TotalVenda() {
        double total = 0;
        for (ItemVenda i : itemVenda) {
            total = total+i.TotalItem();
        }
        return total;
    }

}
