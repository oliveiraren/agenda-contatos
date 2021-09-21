package br.com.santander.agenda.service;

import br.com.santander.agenda.model.Contato;
import br.com.santander.agenda.model.dto.ContatoDto;
import br.com.santander.agenda.repository.ContatoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {

    private final ContatoRepository contatoRepository;

    public ContatoService(ContatoRepository contatoRepository){
        this.contatoRepository = contatoRepository;
    }

    public Contato cadastrar(ContatoDto contatoDto){
        Contato contato = contatoDto.converte();
        return contatoRepository.save(contato);
    }

    public Contato obter(Integer id){
        return contatoRepository.getById(id);
    }

    public List<Contato> buscarTodos(){
        return contatoRepository.findAll();
    }

    public void deletar(Integer id){
         contatoRepository.deleteById(id);
    }

}
