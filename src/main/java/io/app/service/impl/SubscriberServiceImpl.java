package io.app.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import io.app.model.Subscriber;
import io.app.repository.SubscriberRepository;
import io.app.service.ISubscriberService;

@Service
public class SubscriberServiceImpl implements ISubscriberService {
	
@Autowired
private SubscriberRepository subscriberRepository;

@Override
public List<Subscriber> all() {
	return subscriberRepository.findAll();
}

@Override
public Subscriber save(Subscriber subscriber) {
	subscriber.setActive(true);
	subscriber.setCreatedDate(new Date());
	return subscriberRepository.save(subscriber);
}


}
