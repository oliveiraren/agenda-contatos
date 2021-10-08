package br.com.santander.agenda.controller;

import br.com.santander.agenda.model.Contato;
import br.com.santander.agenda.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaProducerController {
	private final KafkaProducerService producerService;

	@Autowired
	public KafkaProducerController(KafkaProducerService producerService) {
		this.producerService = producerService;
	}

	@PostMapping(value = "/publish")
	public void sendMessageToKafkaTopic(@RequestParam("mensagem") String mensagem) {
		this.producerService.enviaMensagem(mensagem);
	}

	@PostMapping(value = "/cria-contato")
	public void sendMessageToKafkaTopic(@RequestBody Contato contato) {

		this.producerService.criaLogContato(contato);
	}
}