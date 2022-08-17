package br.com.springdesafio.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springdesafio.backend.consumerAndsend.QueueSender;

@RestController
@RequestMapping("/teste")
public class ControllerQueue {
	
	@Autowired
    private QueueSender queueSender;

    @GetMapping
    public String send(){
        queueSender.send("test message");
        return "ok. done";
    }


}
