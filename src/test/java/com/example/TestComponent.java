package com.example;

import io.cucumber.spring.ScenarioScope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@ScenarioScope
public class TestComponent {

    private final UUID uuid = UUID.randomUUID();

    public UUID getUuid() {
        return uuid;
    }

}
