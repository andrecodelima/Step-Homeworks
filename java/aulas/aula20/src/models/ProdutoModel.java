package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProdutoModel{
    //PROUDUTO EXAMENTE COMO É COMO COLOCADO NO BANCO DE DADOS,
    // COM AS MESMAS PROPRIEDADES QUE POSSUI NO BANCO
    private int id = 0; // Pode ser que não haja ID preenchido ainda por isso
    // ele ser iniciado com "zero".
    private String nome;
    private String fabricante;
    private double preco;

    public ProdutoModel(){}

    public ProdutoModel(int id, String nome, String fabricante, double preco) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }



}
