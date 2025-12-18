
Feature: TestCases
  @feature_user_registration
  Background: 
    Given the user is on the Registration Page

  @valid-registration
  Scenario Outline: User Registration Process
    When I enter a valid email address "<email>"
    And I enter a valid password "<password>"
    And I confirm the password by re-entering "<confirm_password>"
    And I click the "Register" button
    Then the user should be redirected to a success page
    And a success message is displayed indicating account creation
    And a confirmation email is received in the inbox
    And the email format is correct and matches the entered email
    And the password meets the security requirements
    And the user can log in with the newly created credentials

    Examples:
      | email            | password       | confirm_password |
      | krishna@gmail.com | Password123! | Password123!     |

  @feature_user_registration
  @confirmation_email
  Scenario Outline: User Registration Process
    Given the user checks the registered email inbox
    When the user looks for the confirmation email from the platform
    And the user opens the confirmation email
    Then the confirmation email should be received within a reasonable time frame
    And the email subject should match the expected format
    And the email body should contain the correct user information and activation link

    Examples:
      | <email_subject> | <email_body> |
      | Welcome to Our Platform | Your account has been successfully created. Please activate your account using the link below. |

  @feature_user_registration
  @accessible_registration
  Scenario Outline: User Registration Process
    When the user navigates to the registration page using a screen reader
    Then the screen reader should read out all labels and instructions correctly
    When the user checks that all form fields have appropriate labels
    Then all form fields should be accessible via keyboard navigation
    When the user attempts to fill in the form using keyboard navigation only
    When the user submits the form using the keyboard
    Then the user should receive a confirmation message

    Examples:
      | title                          | description                                                                 |
      | User Registration Process      | Validate that the registration page is accessible for users with disabilities. |

  @feature_user_registration
  @prevent_email_in_use
  Scenario Outline: User Registration Process
    Given the user is on the Registration Page
    When I enter an email address that is already registered "<email>"
    And I enter a valid password "<password>"
    And I confirm the password by re-entering "<confirm_password>"
    And I click the Register button
    Then an error message should be displayed indicating the email is already in use
    And the user remains on the registration page
    And the password fields are cleared for re-entry

    Examples:
      | email                     | password            | confirm_password       |
      | existinguser@gmail.com    | ValidPassword123    | ValidPassword123       |

  @feature_user_registration
  @invalid-email-format
  Scenario Outline: User Registration Process with Invalid Email Format
    Given the user is on the Registration Page
    When I enter "<email>"
    And I enter "<password>"
    And I confirm the password "<confirm_password>"
    And I click the "Register" button
    Then an error message is displayed indicating the email format is invalid
    And the user remains on the registration page
    And the password fields are cleared for re-entry

    Examples:
      | email          | password             | confirm_password       |
      | user@domain    | ValidPassword123!    | ValidPassword123!      |

  @feature_user_registration
  @empty-email
  Scenario Outline: User Registration Process
    When the user leaves the email field empty
    And the user enters "<password>" in the password field
    And the user confirms the password by re-entering "<confirm_password>"
    And the user clicks the "Register" button
    Then an error message is displayed indicating the email field is required
    And the user remains on the registration page
    And the password fields are cleared for re-entry

    Examples:
      | password              | confirm_password       |
      | ValidPassword123!    | ValidPassword123!      |

@empty_password
Scenario Outline: User Registration Process
  Given the user enters a valid email address "<email>"
  And the user leaves the password field empty
  When the user clicks the "Register" button
  Then an error message is displayed indicating the password field is required
  And the user remains on the registration page

  Examples:
    | email              |
    | krishna@gmail.com  |

  @feature_user_registration
  @invalid-password
  Scenario Outline: User Registration with Simple Password
    Given the user is on the Registration Page
    When I enter "<email>"
    And I enter "<password>"
    And I confirm the password by re-entering "<password>"
    And I click the "Register" button
    Then an error message is displayed indicating the password does not meet complexity requirements
    And the user remains on the Registration Page

    Examples:
      | email              | password  |
      | krishna@gmail.com  | password  |

  @feature_user_registration
  @password_mismatch
  Scenario Outline: User Registration Process
    Given the user is on the Registration Page
    When I enter a valid email address "<email>"
    And I enter a password "<password>"
    And I enter a different password "<confirmation>"
    And I click the "Register" button
    Then an error message is displayed indicating the passwords do not match
    And the user remains on the registration page

    Examples:
      | email               | password      | confirmation        |
      | krishna@gmail.com   | Password123   | DifferentPassword456 |

  @network-timeout
  Scenario Outline: User Registration Process
    Given the user is on the Registration Page
    When I enter "<email>"
    And I enter "<password>"
    And I confirm the password by re-entering "<confirm_password>"
    And I simulate a network timeout when clicking the "Register" button
    Then an error message is displayed indicating a network issue occurred
    And the user remains on the registration page
    And the input fields retain the entered values for re-submission

    Examples:
      | email                | password     | confirm_password |
      | krishna@gmail.com    | aaaaaaaaaaaa | aaaaaaaaaaaa     |

  @feature_user_registration
  @prevent_sql_injection
  Scenario Outline: User Registration Process
    When I enter "<email>" in the email field
    And I enter "<password>" in the password field
    And I confirm the password by re-entering "<confirm_password>"
    And I click the "Register" button
    Then an error message is displayed indicating invalid input
    And the user remains on the registration page

    Examples:
      | email                  | password            | confirm_password    |
      | user' OR '1'='1'     | ValidPassword123    | ValidPassword123     |

  @feature_user_registration
  @max-length-registration
  Scenario Outline: User Registration Process
    When I enter an email address with the maximum allowed length
    And I enter a password with the maximum allowed length
    And I confirm the password by re-entering it
    And I click the "Register" button
    Then the user should be redirected to a success page
    And a success message is displayed indicating account creation
    And a confirmation email is received in the inbox

    Examples:
      | email                                                                                                                                                                                                 |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |
      | password                                                                                                                                                                                              |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

  @feature_user_registration
  @special-character-registration
  Scenario Outline: User Registration with Special Characters
    Given the user is on the Registration Page
    When I enter "<email>"
    And I enter "<password>"
    And I confirm the password by re-entering "<confirm_password>"
    And I click the "Register" button
    Then the user should be redirected to a success page
    And a success message should be displayed indicating account creation
    And a confirmation email should be received in the inbox

    Examples:
      | email                   | password      | confirm_password |
      | user+test@example.com   | P@ssw0rd!     | P@ssw0rd!        |

  @feature_user_registration
  @minimal-valid-registration
  Scenario Outline: User Registration Process
    Given the user is on the Registration Page
    When I enter "<email>"
    And I enter "<password>"
    And I confirm the password by re-entering "<confirm_password>"
    And I click the "Register" button
    Then the user should be redirected to the success page
    And a success message should be displayed indicating account creation
    And a confirmation email should be received in the inbox

    Examples:
      | email     | password | confirm_password |
      | a@b.co   | 123456   | 123456           |

  @feature_user_registration
  @concurrent-registration
  Scenario Outline: User Registration Process
    Given the user is on the Registration Page
    When I enter "<email>" in the first tab
    And I enter "<password>" in the first tab
    And I confirm the password by entering "<confirm_password>" in the first tab
    And I click the "Register" button in the first tab
    And I enter "<email>" in the second tab
    And I enter "<password>" in the second tab
    And I confirm the password by entering "<confirm_password>" in the second tab
    And I click the "Register" button in the second tab
    Then one registration should be successful
    And the other registration should fail with an error message indicating the email is already in use
    And the successful registration should send a confirmation email
    And the failed registration should retain the input values for re-entry

    Examples:
      | email              | password            | confirm_password     |
      | krishna@gmail.com  | ValidPassword123    | ValidPassword123      |
