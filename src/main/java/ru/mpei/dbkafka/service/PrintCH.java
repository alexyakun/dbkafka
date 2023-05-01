package ru.mpei.dbkafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mpei.dbkafka.domain.Measurement;
import ru.mpei.dbkafka.repository.MeasurementRepository;

import java.time.Instant;
import java.util.List;

@Service
public class PrintCH {
    @Autowired
    private MeasurementRepository repo;

    public void saver(String msg){
        repo.save(new Measurement(Instant.now(), msg, 1.0));
    }
    public void printer(){

        System.out.println(repo.findAll());
    }


}
