package br.com.santander.agenda.model;

import br.com.santander.agenda.enumeration.EnderecoEnumeration;

import javax.persistence.*;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String rua;
    private String numero;
    private String cidade;
    private EnderecoEnumeration tipo;
    @ManyToOne
    private Contato contato;

    public Endereco(String rua, String numero, String cidade, EnderecoEnumeration tipo) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.tipo = tipo;
    }

    public Endereco() {
    }

    public Integer getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public EnderecoEnumeration getTipo() {
        return tipo;
    }

    public Contato getContato() {
        return contato;
    }
}
