package br.com.santander.agenda.model;

import br.com.santander.agenda.enumeration.EmailEnumeration;
import br.com.santander.agenda.enumeration.TelefoneEnumeration;

import javax.persistence.*;

@Entity
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String enderecoEmail;
    private EmailEnumeration tipo;
    @ManyToOne
    private Contato contato;

    public Email(String enderecoEmail, EmailEnumeration tipo) {
        this.enderecoEmail = enderecoEmail;
        this.tipo = tipo;
    }

    public Email() {
    }

    public String getEnderecoEmail() {
        return enderecoEmail;
    }

    public EmailEnumeration getTipo() {
        return tipo;
    }

    public Contato getContato() {
        return contato;
    }
}
