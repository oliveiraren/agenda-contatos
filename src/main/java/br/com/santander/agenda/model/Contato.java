package br.com.santander.agenda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private String apelido;
    List<Telefone> telefones = new ArrayList<>();
    List<Endereco> enderecos = new ArrayList<>();
    List<Email> emails = new ArrayList<>();

    public Contato(String nome, String sobrenome, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    public Contato() {
    }

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
}
