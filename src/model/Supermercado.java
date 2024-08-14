package model;

import java.util.HashSet;
import java.util.Set;

public class Supermercado {

    private String cnpj;
    private String nome;
    private Set<Produto> produtos;
    private Set<Cliente> clientes;

    public Supermercado(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.produtos = new HashSet<>();
        this.clientes = new HashSet<>();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public boolean addProduto(Produto produto){
        return this.produtos.add(produto);
    }

    public boolean removeProduto(Produto produto){
        return this.produtos.remove(produto);
    }

    public boolean containsProduto(Produto produto){
        return this.produtos.contains(produto);
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    @Override
    public String toString() {
        return "Supermercado{" +
                "cnpj='" + cnpj + '\'' +
                ", nome='" + nome + '\'' +
                ", produtos=" + produtos +
                ", clientes=" + clientes +
                '}';
    }
}
