package io.app.event;

import org.springframework.context.ApplicationEvent;

import io.app.model.Subscriber;

public class SubscriberCreatedEvent extends ApplicationEvent {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Subscriber subscriber;
	public SubscriberCreatedEvent(Subscriber subscriber) {
		super(subscriber);
		this.subscriber=subscriber;
	}
	public Subscriber getSubscriber() {
		return subscriber;
	}
}
