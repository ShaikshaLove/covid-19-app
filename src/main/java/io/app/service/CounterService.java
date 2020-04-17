package io.app.service;

import io.app.model.Counter;
import io.app.repository.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
@Service
public class CounterService {

    @Autowired
    private CounterRepository counterRepository;

    @PostConstruct
    public  void saveIntial(){
       if(!counterRepository.findById(new Integer(1)).isPresent()){
           counterRepository.save(new Counter(1,1000));
       }
    }

    public Counter updateCount(){
        Counter counter=counterRepository.findById(new Integer(1)).get();
        counter.setCount(counter.getCount()+1);
        counterRepository.save(counter);
        return counter;
    }
}
