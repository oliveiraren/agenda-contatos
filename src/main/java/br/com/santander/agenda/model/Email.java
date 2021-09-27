package br.com.santander.agenda.model;

import br.com.santander.agenda.enumeration.EmailEnumeration;
import br.com.santander.agenda.enumeration.TelefoneEnumeration;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String enderecoEmail;
    private EmailEnumeration tipo;
    @ManyToOne
    @JsonBackReference
    private Contato contato;

    public Email(String enderecoEmail, EmailEnumeration tipo) {
        this.enderecoEmail = enderecoEmail;
        this.tipo = tipo;
    }

    protected Email() {
    }

    public Integer getId() {
        return id;
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
