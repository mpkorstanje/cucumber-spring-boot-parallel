Feature: Spring Boot

  @isolated
  Scenario: An isolated scenario
    Given an application context in isolation

  Scenario Outline: The application context starts
    Given an application context

    Examples:
      | iteration |
      | 1         |
      | 2         |
      | 3         |
      | 4         |
      | 5         |
      | 6         |
      | 7         |
      | 8         |
      | 9         |
      | 10        |
      | 11        |
      | 12        |
      | 13        |
      | 14        |
      | 15        |
      | 16        |
      | 17        |
      | 18        |
      | 19        |
      | 20        |
