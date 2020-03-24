package io.app.service;

import java.util.List;

import io.app.model.Subscriber;

public interface ISubscriberService {
   public abstract List<Subscriber> all();
   public abstract Subscriber save(Subscriber subscriber);
}
