package br.com.santander.agenda.service;

import br.com.santander.agenda.model.Contato;
import br.com.santander.agenda.model.dto.ContatoDto;

import java.util.List;

public interface ContatoService {

    Contato cadastrar(ContatoDto contato);

    Contato obter(Integer id);

    List<Contato> buscarTodos();

    void deletar(Integer id);
}
