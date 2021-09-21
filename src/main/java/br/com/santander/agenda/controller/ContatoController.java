package br.com.santander.agenda.controller;

import br.com.santander.agenda.model.Contato;
import br.com.santander.agenda.model.dto.ContatoDto;
import br.com.santander.agenda.service.ContatoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("contatos")
public class ContatoController {

    private final ContatoService contatoService;

    public ContatoController(ContatoService contatoService){
        this.contatoService = contatoService;
    }

    @PostMapping
    public ResponseEntity<Contato> cadastrar(@RequestBody ContatoDto contatoDto){

        Contato contato = contatoService.cadastrar(contatoDto);
        URI uri = UriComponentsBuilder.fromPath("contatos/{id}").buildAndExpand(contato.getId()).toUri();
        return ResponseEntity.created(uri).body(contato);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contato> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(this.contatoService.obter(id));
    }

    @GetMapping
    public List<Contato> buscarTodos(){
        return contatoService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id){
        contatoService.deletar(id);
    }

}
