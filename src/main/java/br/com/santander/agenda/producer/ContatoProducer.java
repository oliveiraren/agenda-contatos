package br.com.santander.agenda.producer;

import br.com.santander.agenda.model.Contato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ContatoProducer {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void envia(Contato contato){
        kafkaTemplate.send("CONTATO_EMAIL",contato.getId().toString(),contato);
    }
}
