Feature: Search In Google Homepage
  This Feature is searching in Google Homepage

  Scenario: Searching on google homepage
Given I Navigate To Google Homepage
And I enter Something in Search
And I hit Search Button
Then I should display results
