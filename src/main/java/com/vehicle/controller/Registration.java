package com.vehicle.controller;

import com.vehicle.dao.RegisterForm;
import com.vehicle.service.RegisterService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

@Controller
@AllArgsConstructor
@RequestMapping("api/penguine")
public class Registration {

    RegisterService registerService;

    @PostMapping("register")
    Mono<ResponseEntity<CharSequence>> registerACar(@RequestBody RegisterForm registerForm) {
        registerService.register(registerForm);
        return Mono.just(new ResponseEntity<>("Successfully Created", HttpStatus.CREATED))
    }


}
