Feature: LoginFeature
  deals with login feature

 Scenario: Login with correct username and password
   Given I Navigate to the url
   And I enter username "admin" and password "admin"
   And I click on login
   Then Login Successful
