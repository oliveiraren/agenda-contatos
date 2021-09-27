package br.com.santander.agenda.model.dto;

import br.com.santander.agenda.model.Contato;
import br.com.santander.agenda.model.Email;
import br.com.santander.agenda.model.Endereco;
import br.com.santander.agenda.model.Telefone;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContatoDto {

    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private String apelido;
    List<Telefone> telefones = new ArrayList<>();
    List<Endereco> enderecos = new ArrayList<>();
    List<Email> emails = new ArrayList<>();

    public ContatoDto(String nome, String sobrenome, LocalDate dataNascimento, List<Telefone> telefones) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.telefones = telefones;
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

    public Contato converte()  {
        Contato contato = new Contato(nome, sobrenome, dataNascimento);
        telefones.forEach(t -> contato.adicionaTelefone(t));
        return contato;
    }
}
