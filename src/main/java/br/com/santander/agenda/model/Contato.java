package br.com.santander.agenda.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String sobrenome;
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;
    private String apelido;
    @OneToMany(mappedBy = "contato",cascade = CascadeType.ALL)
    @JsonManagedReference
    List<Telefone> telefones = new ArrayList<>();
    @OneToMany(mappedBy = "contato",cascade = CascadeType.ALL)
    @JsonManagedReference
    List<Endereco> enderecos = new ArrayList<>();
    @OneToMany(mappedBy = "contato",cascade = CascadeType.ALL)
    @JsonManagedReference
    List<Email> emails = new ArrayList<>();

    public Contato(String nome, String sobrenome, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    protected Contato() {
    }

    public Integer getId() {return id;}

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getApelido() {
        return apelido;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setTelefones(Collection<Telefone> telefones) {

        telefones.forEach(t -> adicionaTelefone(t));
    }

    public void adicionaTelefone(Telefone telefone) {
        telefone.setContato(this);
        this.telefones.add(telefone);
    }

}
