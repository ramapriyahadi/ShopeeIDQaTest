#Author: rph.granger@gmail.com
#Keywords Summary : See ALl  Gist in Github
Feature: See All  Gist in Github

  Background:
    Given Iam using "Chrome" for my browser
    Given Iam on "https://github.com/" Page

  Scenario: As a user, I want to see my list of gists.
    Given Iam on Github page with Title "The world’s leading software development platform · GitHub"
    Then I go to login page
    And I type my username "youremailhere@example.com"
    And I type my password "yourpassword"
    And I click sign in button

    Then Iam on dashboard page with title "GitHub"
    And I click on my profile
    And I click my gist
    And I click see all your gist
    #And I quit the browser