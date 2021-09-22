package br.com.santander.agenda.model;

import br.com.santander.agenda.enumeration.TelefoneEnumeration;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_telefone")
    private String numeroTelefone;
    @Enumerated(EnumType.STRING)
    private TelefoneEnumeration tipo;
    @ManyToOne
    @JoinColumn(name = "contato_id")
    @JsonIgnore
    private Contato contato;

    public Telefone(String numeroTelefone, TelefoneEnumeration tipo, Contato contato) {
        this.numeroTelefone = numeroTelefone;
        this.tipo = tipo;
        this.contato = contato;
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
