package br.com.santander.agenda.model;

import br.com.santander.agenda.enumeration.AgendaEnumeration;

import javax.persistence.*;

@Entity
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String numeroTelefone;
    private AgendaEnumeration tipo;
    @ManyToOne
    private Contato contato;

    public Telefone(String numeroTelefone, AgendaEnumeration tipo) {
        this.numeroTelefone = numeroTelefone;
        this.tipo = tipo;
    }

    public Telefone() {
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public AgendaEnumeration getTipo() {
        return tipo;
    }

    public Contato getContato() {
        return contato;
    }
}
