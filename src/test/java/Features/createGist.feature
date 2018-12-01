#Author: rph.granger@gmail.com
#Keywords Summary : Create Gist in Github
Feature: Create Gist in Github

  Background:
    Given Iam using "Chrome" for my browser
    Given Iam on "https://github.com/" Page

  Scenario: As a user, I want to create my gist
    Given Iam on Github page with Title "The world’s leading software development platform · GitHub"
    Then I go to login page
    And I type my username "youremailhere@example.com"
    And I type my password "yourpassword"
    And I click sign in button

    Then Iam on dashboard page with title "GitHub"
    And I click on header navigation
    And I click New gist
    And I type "qa-gist.md" on my gist name
    And I type "Quick Brown fox jumps over the lazy dog" on my gist content
    And I click Create public gist
