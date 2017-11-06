Feature: Signup form is opened from the Promotions tab

    Scenario: Test not loggedin user can signup from the Promotion
        Given User is on the Promotions page
        And User is not logged in
        When User clicks on Join now
        Then SignUp form is opened

