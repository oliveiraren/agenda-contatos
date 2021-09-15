package br.com.santander.agenda.model;

import br.com.santander.agenda.enumeration.AgendaEnumeration;

import javax.persistence.*;

@Entity
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String enderecoEmail;
    private AgendaEnumeration tipo;
    @ManyToOne
    private Contato contato;

    public Email(String enderecoEmail, AgendaEnumeration tipo) {
        this.enderecoEmail = enderecoEmail;
        this.tipo = tipo;
    }

    public Email() {
    }

    public String getEnderecoEmail() {
        return enderecoEmail;
    }

    public AgendaEnumeration getTipo() {
        return tipo;
    }

    public Contato getContato() {
        return contato;
    }
}
