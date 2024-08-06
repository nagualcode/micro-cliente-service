package br.infnet.cliente.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.infnet.cliente.client.ClienteClient;

@RestController
public class ClienteController {

    private final ClienteClient menssageiroClient;

    public ClienteController(ClienteClient producerClient) {
        this.menssageiroClient = producerClient;
    }

    @GetMapping("/cliente")
    public String consume() {
        return menssageiroClient.getProducerMessage();
    }
}
