package br.com.santander.agenda.model;

import br.com.santander.agenda.enumeration.TelefoneEnumeration;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "numero_telefone")
    private String numeroTelefone;
    @Enumerated(EnumType.STRING)
    private TelefoneEnumeration tipo;
    @ManyToOne
    @JoinColumn(name = "contato_id")
    @JsonBackReference
    private Contato contato;

    public Telefone(String numeroTelefone, TelefoneEnumeration tipo, Contato contato) {
        this.numeroTelefone = numeroTelefone;
        this.tipo = tipo;
        this.contato = contato;
    }

    protected Telefone() {
    }

    public Integer getId() {
        return id;
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

    public void setContato(Contato contato) {
        this.contato = contato;
    }

}
