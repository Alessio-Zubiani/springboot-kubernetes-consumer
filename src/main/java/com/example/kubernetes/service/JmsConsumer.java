package com.example.kubernetes.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.TextMessage;
import lombok.extern.slf4j.Slf4j;

@Slf4j

@Component
public class JmsConsumer {

	@JmsListener(destination = "springboot.kubernetes")
	public void receiveMessage(Message message) throws JMSException {
		
		if(message instanceof TextMessage) {
			TextMessage textMessage = (TextMessage) message;
			String jmsMessage = textMessage.getText();
			
			log.info("Received message: [{}]", jmsMessage);
		}
	}

}
