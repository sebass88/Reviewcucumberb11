Feature:  Review for students batch 11

  Background:
    Given  user is able is navigated to mercury tours application


  @regression
  Scenario: login scenario for registering on mercury tours
    When  user enters values for registering the user
    And  user clicks on submit button
    Then  user should be able to see message successful registration

@smoke
    Scenario Outline: Registering user with example table
      When  user enters "<firstName>" "<lastName>" "<phone>" "<email>" "<address>" "<city>" "<state>" "<postalCode>" "<country>" "<username>" "<password>" "<confirmPassword>" for registering the user
      And  user clicks on submit button
      Then  user should be able to see message successful registration
      Examples:
      |firstName|lastName|phone|email|address|city|state|postalCode|country|username|password|confirmPassword|
      |alex     |hasim   |7034551382|menu@123.com|7575 hooes rd|annandale|VA|22152|NIUE|alex123|Test123|Test123|
      |jose     |hasim2   |2034551382|menu@1234.com|7576 hooes rd|annandale|VA|22152|NIUE|jose123|Test123|Test123|
      |alex2     |hasim3   |1034551382|menu@125.com|7578 hooes rd|annandale|VA|22152|NIUE|alex12345|Test123|Test123|







