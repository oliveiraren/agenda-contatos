package br.com.santander.agenda.model;

import br.com.santander.agenda.enumeration.TelefoneEnumeration;

import javax.persistence.*;

@Entity
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String numeroTelefone;
    private TelefoneEnumeration tipo;
    @ManyToOne
    private Contato contato;

    public Telefone(String numeroTelefone, TelefoneEnumeration tipo) {
        this.numeroTelefone = numeroTelefone;
        this.tipo = tipo;
    }

    public Telefone() {
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public TelefoneEnumeration getTipo() {
        return tipo;
    }

    public Contato getContato() {
        return contato;
    }
}
