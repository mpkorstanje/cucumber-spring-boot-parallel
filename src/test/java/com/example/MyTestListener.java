package com.example;

import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.EventPublisher;
import io.cucumber.plugin.event.Result;
import io.cucumber.plugin.event.Status;
import io.cucumber.plugin.event.TestCase;
import io.cucumber.plugin.event.TestCaseFinished;

public class MyTestListener implements ConcurrentEventListener {
    @Override
    public void setEventPublisher(EventPublisher publisher) {
        publisher.registerHandlerFor(TestCaseFinished.class, this::handleTestCaseFinished);
    }

    private void handleTestCaseFinished(TestCaseFinished event) {
        TestCase testCase = event.getTestCase();
        Result result = event.getResult();
        Status status = result.getStatus();
        Throwable error = result.getError();
        String scenarioName = testCase.getName();
        String id = "" + testCase.getUri() + testCase.getLine();
        System.out.println("Testcase " + id + " - " + status.name());
    }
}
