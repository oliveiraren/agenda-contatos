package br.com.santander.agenda.service;

import br.com.santander.agenda.model.Contato;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
	private static final Logger logger = 
			LoggerFactory.getLogger(KafkaProducerService.class);
	
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;

	public void enviaMensagem(String mensagem) 
	{
		logger.info(String.format("Menssagem enviada -> %s", mensagem));
		this.kafkaTemplate.send("TOPIC_NAME_TEST", mensagem);
	}
	
	public void criaLogContato(Contato contato)
	{
		logger.info(String.format("Contato criado -> %s", contato));
		this.kafkaTemplate.send("TOPIC_NAME_USER_LOG3", contato.getNome(), contato);
	}
}
