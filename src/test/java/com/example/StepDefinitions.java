package com.example;

import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class StepDefinitions {
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private TestComponent testComponent;

    @Given("an application context")
    public void anApplicationContext() throws InterruptedException {
        assertNotNull(applicationContext);
        assertNotNull(testComponent);
        System.out.println("Test component=" + testComponent.getUuid());
        Thread.sleep(20);
    }
    @Given("an application context in isolation")
    public void anApplicationContextIKso() throws InterruptedException {
        System.out.println("STARTED ISOLATION");
        System.out.flush();
        assertNotNull(applicationContext);
        assertNotNull(testComponent);
        System.out.println("Test component=" + testComponent.getUuid());
        Thread.sleep(2000);
        System.out.println("END ISOLATION");
        System.out.flush();
    }

}
