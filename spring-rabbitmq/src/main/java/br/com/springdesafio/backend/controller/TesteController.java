package br.com.springdesafio.backend.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/testefinal")
public class TesteController {
	
	public TesteController(AmqpTemplate queueSender) {
        this.queueSender = queueSender;
    }

    private final AmqpTemplate queueSender;

    @GetMapping
    public String send(){
        queueSender.convertAndSend("teste", "routing-key-teste", "test message");
        return "ok. done";
    }

}
