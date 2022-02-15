package com.vehicle.service;

import com.vehicle.dao.RegisterForm;
import reactor.core.publisher.Mono;

public interface RegisterService {
    Mono<Boolean> register(RegisterForm registerForm);
}
