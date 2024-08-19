package model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Supermercado implements Serializable {

    private long serialVersionUID;
    private String cnpj;
    private String nome;
    private Set<Produto> produtos;
    private Set<Cliente> clientes;

    public Supermercado(String cnpj, String nome) {
        serialVersionUID = 1L;
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

    public boolean addCliente(Cliente cliente){
        return this.clientes.add(cliente);
    }

    public boolean removeCliente(Cliente cliente){
        return this.clientes.remove(cliente);
    }

    public boolean containsCliente(Cliente cliente){
        return this.clientes.contains(cliente);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supermercado that = (Supermercado) o;
        return Objects.equals(cnpj, that.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cnpj);
    }
}
