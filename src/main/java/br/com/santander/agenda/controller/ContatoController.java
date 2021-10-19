package br.com.santander.agenda.controller;

import br.com.santander.agenda.model.Contato;
import br.com.santander.agenda.model.dto.ContatoDto;
import br.com.santander.agenda.producer.ContatoProducer;
import br.com.santander.agenda.service.ContatoServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("contatos")
public class ContatoController {

    private final ContatoServiceImpl contatoServiceImpl;

    private final ContatoProducer contatoProducer;

    public ContatoController(ContatoServiceImpl contatoServiceImpl, ContatoProducer contatoProducer){
        this.contatoServiceImpl = contatoServiceImpl;
        this.contatoProducer = contatoProducer;
    }

    @PostMapping
    public ResponseEntity<Contato> cadastrar(@RequestBody ContatoDto contatoDto){

        Contato contato = contatoServiceImpl.cadastrar(contatoDto);
        URI uri = UriComponentsBuilder.fromPath("contatos/{id}").buildAndExpand(contato.getId()).toUri();
        contatoProducer.envia(contato);
        return ResponseEntity.created(uri).body(contato);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contato> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(this.contatoServiceImpl.obter(id));
    }

    @GetMapping
    public List<Contato> buscarTodos(){
        return contatoServiceImpl.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id){
        contatoServiceImpl.deletar(id);
    }

}
