package io.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.app.model.Subscriber;

@Repository
public interface SubscriberRepository extends JpaRepository<Subscriber, Integer>{

}
