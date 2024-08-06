package br.infnet.cliente.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "menssageiro-service", url = "http://localhost:8081")
public interface ClienteClient {

    @GetMapping("/msg")
    String getProducerMessage();
}
