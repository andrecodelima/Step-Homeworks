package modules;

import java.util.Date;

public class Vendas {

    private int id;
    private int idveiculo;
    private Date dataHora;

    public Vendas(){}

    public Vendas(int id, int idveiculo, Date dataHora) {
        this.id = id;
        this.idveiculo = idveiculo;
        this.dataHora = dataHora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdveiculo() {
        return idveiculo;
    }

    public void setIdveiculo(int idveiculo) {
        this.idveiculo = idveiculo;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }
}
