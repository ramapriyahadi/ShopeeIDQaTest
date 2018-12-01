#Author: rph.granger@gmail.com
#Keywords Summary : Edit  Gist in Github
Feature: Edit  Gist in Github

  Background:
    Given Iam using "Chrome" for my browser
    Given Iam on "https://github.com/" Page

  Scenario: As a user, I want to edit an existing gist.
    Given Iam on Github page with Title "The world’s leading software development platform · GitHub"
    Then I go to login page
    And I type my username "youremailhere@example.com"
    And I type my password "yourpassword"
    And I click sign in button

    Then Iam on dashboard page with title "GitHub"
    And I click on my profile
    And I click my gist
    And I click gist with name "qa-gist.md"
    And I click edit gist
    And I type "edited" on my gist name
    And I type "edited" on my gist content
    And I click update public gist
    #And I quit the browser