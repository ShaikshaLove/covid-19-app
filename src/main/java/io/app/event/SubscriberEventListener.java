package io.app.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

import io.app.model.Subscriber;

@Component
public class SubscriberEventListener implements ApplicationListener<SubscriberCreatedEvent> {
	private static final Logger LOG=LoggerFactory.getLogger(SubscriberEventListener.class);
	@Autowired
	private JavaMailSenderImpl sender;
	
	@Override
	public void onApplicationEvent(SubscriberCreatedEvent event) {
          Subscriber subscriber=event.getSubscriber();
          LOG.debug(""+subscriber);
          SimpleMailMessage message=new SimpleMailMessage();
          message.setSubject("Voila! Subscription for covid precautions");
          message.setTo(subscriber.getEmail());
          message.setText("Hello! "+subscriber.getFullName()+", "+"applauding for your subscription in emails for knowing about covid-19 ");
	      LOG.debug("Email has been sent to "+subscriber.getEmail());
          sender.send(message);		
	}
}
