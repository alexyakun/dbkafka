package ru.mpei.dbkafka.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mpei.dbkafka.service.PrintCH;

@RestController
@RequiredArgsConstructor
public class CHcontroller {
    @Autowired
    private PrintCH printCH;
    @GetMapping("/data")
    public String findFault(){
        printCH.printer();
        return "OK";
    }
}
