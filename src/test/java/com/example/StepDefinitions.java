package com.example;

import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.Assert.assertNotNull;

@SpringBootTest
public class StepDefinitions {
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private TestComponent testComponent;

    @Given("an application context")
    public void anApplicationContext() {
        assertNotNull(applicationContext);
        assertNotNull(testComponent);
        System.out.println("Test component=" + testComponent.toString());
    }

}
