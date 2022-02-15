package com.vehicle.service;

import com.vehicle.dao.RegisterForm;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class RegisterServiceImpl implements RegisterService {



    @Override
    public Mono<Boolean> register(RegisterForm registerForm) {

        return Mono.just(true);
    }
}
