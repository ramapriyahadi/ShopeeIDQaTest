#Author: rph.granger@gmail.com
#Keywords Summary : Delete  Gist in Github
Feature: Delete  Gist in Github

  Background:
    Given Iam using "Chrome" for my browser
    Given Iam on "https://github.com/" Page

  Scenario: As a user, I want to delete an existing gist.
    Given Iam on Github page with Title "The world’s leading software development platform · GitHub"
    Then I go to login page
    And I type my username "youremailhere@example.com"
    And I type my password "yourpassword"
    And I click sign in button

    Then Iam on dashboard page with title "GitHub"
    And I click on my profile
    And I click my gist
    And I click gist with name "qa-gist.mdqa-gist-edited.md"
    And I click delete gist
   # And I quit the browser

