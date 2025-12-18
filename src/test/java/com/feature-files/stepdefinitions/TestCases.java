package com.feature-files.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.feature-files.pages.TestCasesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class TestCases extends DriverFactory {
TestCasesPage testCasesPage = new TestCasesPage(driver);
@Given("the user is on the Registration Page")
public void the_user_is_on_the_registration_page() {
testCasesPage.navigateToRegistrationPage();
}
@When("I enter a valid email address {string}")
public void i_enter_a_valid_email_address(String email) {
testCasesPage.enterEmail(email);
}
@When("I enter a valid password {string}")
public void i_enter_a_valid_password(String password) {
testCasesPage.enterPassword(password);
}
@When("I confirm the password by re-entering {string}")
public void i_confirm_the_password_by_re_entering(String confirmPassword) {
testCasesPage.confirmPassword(confirmPassword);
}
@When("I click the {string} button")
public void i_click_the_button(String button) {
testCasesPage.clickRegisterButton(button);
}
@Then("the user should be redirected to a success page")
public void the_user_should_be_redirected_to_a_success_page() {
testCasesPage.isSuccessPageDisplayed();
}
@Then("a success message is displayed indicating account creation")
public void a_success_message_is_displayed_indicating_account_creation() {
testCasesPage.isSuccessMessageDisplayed();
}
@Then("a confirmation email is received in the inbox")
public void a_confirmation_email_is_received_in_the_inbox() {
testCasesPage.isConfirmationEmailReceived();
}
@Then("the email format is correct and matches the entered email")
public void the_email_format_is_correct_and_matches_the_entered_email() {
testCasesPage.isEmailFormatCorrect();
}
@Then("the password meets the security requirements")
public void the_password_meets_the_security_requirements() {
testCasesPage.isPasswordSecure();
}
@Then("the user can log in with the newly created credentials")
public void the_user_can_log_in_with_the_newly_created_credentials() {
testCasesPage.canLoginWithNewCredentials();
}
@Given("the user checks the registered email inbox")
public void the_user_checks_the_registered_email_inbox() {
testCasesPage.checkEmailInbox();
}
@When("the user looks for the confirmation email from the platform")
public void the_user_looks_for_the_confirmation_email_from_the_platform() {
testCasesPage.searchForConfirmationEmail();
}
@When("the user opens the confirmation email")
public void the_user_opens_the_confirmation_email() {
testCasesPage.openConfirmationEmail();
}
@Then("the confirmation email should be received within a reasonable time frame")
public void the_confirmation_email_should_be_received_within_a_reasonable_time_frame() {
testCasesPage.isEmailReceivedInTime();
}
@Then("the email subject should match the expected format")
public void the_email_subject_should_match_the_expected_format() {
testCasesPage.isEmailSubjectCorrect();
}
@Then("the email body should contain the correct user information and activation link")
public void the_email_body_should_contain_the_correct_user_information_and_activation_link() {
testCasesPage.isEmailBodyCorrect();
}
@When("the user navigates to the registration page using a screen reader")
public void the_user_navigates_to_the_registration_page_using_a_screen_reader() {
testCasesPage.navigateUsingScreenReader();
}
@Then("the screen reader should read out all labels and instructions correctly")
public void the_screen_reader_should_read_out_all_labels_and_instructions_correctly() {
testCasesPage.isScreenReaderReadingCorrectly();
}
@When("the user checks that all form fields have appropriate labels")
public void the_user_checks_that_all_form_fields_have_appropriate_labels() {
testCasesPage.areFormFieldsLabeled();
}
@Then("all form fields should be accessible via keyboard navigation")
public void all_form_fields_should_be_accessible_via_keyboard_navigation() {
testCasesPage.areFormFieldsAccessible();
}
@When("the user attempts to fill in the form using keyboard navigation only")
public void the_user_attempts_to_fill_in_the_form_using_keyboard_navigation_only() {
testCasesPage.fillFormUsingKeyboard();
}
@When("the user submits the form using the keyboard")
public void the_user_submits_the_form_using_the_keyboard() {
testCasesPage.submitFormUsingKeyboard();
}
@Then("the user should receive a confirmation message")
public void the_user_should_receive_a_confirmation_message() {
testCasesPage.isConfirmationMessageDisplayed();
}
@When("I enter an email address that is already registered {string}")
public void i_enter_an_email_address_that_is_already_registered(String email) {
testCasesPage.enterEmail(email);
}
@Then("an error message should be displayed indicating the email is already in use")
public void an_error_message_should_be_displayed_indicating_the_email_is_already_in_use() {
testCasesPage.isEmailInUseErrorDisplayed();
}
@Then("the user remains on the registration page")
public void the_user_remains_on_the_registration_page() {
testCasesPage.isOnRegistrationPage();
}
@Then("the password fields are cleared for re-entry")
public void the_password_fields_are_cleared_for_re_entry() {
testCasesPage.arePasswordFieldsCleared();
}
@When("the user leaves the email field empty")
public void the_user_leaves_the_email_field_empty() {
testCasesPage.leaveEmailFieldEmpty();
}
@Then("an error message is displayed indicating the email field is required")
public void an_error_message_is_displayed_indicating_the_email_field_is_required() {
testCasesPage.isEmailRequiredErrorDisplayed();
}
@When("the user enters {string} in the password field")
public void the_user_enters_in_the_password_field(String password) {
testCasesPage.enterPassword(password);
}
@When("the user confirms the password by re-entering {string}")
public void the_user_confirms_the_password_by_re_entering(String confirmPassword) {
testCasesPage.confirmPassword(confirmPassword);
}
@Then("an error message is displayed indicating the password field is required")
public void an_error_message_is_displayed_indicating_the_password_field_is_required() {
testCasesPage.isPasswordRequiredErrorDisplayed();
}
@When("I enter {string}")
public void i_enter(String email) {
testCasesPage.enterEmail(email);
}
@Then("an error message is displayed indicating the email format is invalid")
public void an_error_message_is_displayed_indicating_the_email_format_is_invalid() {
testCasesPage.isInvalidEmailFormatErrorDisplayed();
}
@When("I enter {string} in the password field")
public void i_enter_in_the_password_field(String password) {
testCasesPage.enterPassword(password);
}
@Then("an error message is displayed indicating the password does not meet complexity requirements")
public void an_error_message_is_displayed_indicating_the_password_does_not_meet_complexity_requirements() {
testCasesPage.isPasswordComplexityErrorDisplayed();
}
@When("I enter a different password {string}")
public void i_enter_a_different_password(String confirmation) {
testCasesPage.confirmPassword(confirmation);
}
@Then("an error message is displayed indicating the passwords do not match")
public void an_error_message_is_displayed_indicating_the_passwords_do_not_match() {
testCasesPage.isPasswordMismatchErrorDisplayed();
}
@When("I simulate a network timeout when clicking the {string} button")
public void i_simulate_a_network_timeout_when_clicking_the_button(String button) {
testCasesPage.simulateNetworkTimeout(button);
}
@Then("an error message is displayed indicating a network issue occurred")
public void an_error_message_is_displayed_indicating_a_network_issue_occurred() {
testCasesPage.isNetworkIssueErrorDisplayed();
}
@Then("the input fields retain the entered values for re-submission")
public void the_input_fields_retain_the_entered_values_for_re_submission() {
testCasesPage.doInputFieldsRetainValues();
}
@When("I enter {string} in the email field")
public void i_enter_in_the_email_field(String email) {
testCasesPage.enterEmail(email);
}
@Then("an error message is displayed indicating invalid input")
public void an_error_message_is_displayed_indicating_invalid_input() {
testCasesPage.isInvalidInputErrorDisplayed();
}
@When("I enter an email address with the maximum allowed length")
public void i_enter_an_email_address_with_the_maximum_allowed_length() {
testCasesPage.enterMaxLengthEmail();
}
@When("I enter a password with the maximum allowed length")
public void i_enter_a_password_with_the_maximum_allowed_length() {
testCasesPage.enterMaxLengthPassword();
}
@Then("the user should be redirected to the success page")
public void the_user_should_be_redirected_to_the_success_page() {
testCasesPage.isSuccessPageDisplayed();
}
@When("I enter {string} with special characters")
public void i_enter_with_special_characters(String email) {
testCasesPage.enterEmail(email);
}
@Then("a success message should be displayed indicating account creation")
public void a_success_message_should_be_displayed_indicating_account_creation() {
testCasesPage.isSuccessMessageDisplayed();
}
@Then("a confirmation email should be received in the inbox")
public void a_confirmation_email_should_be_received_in_the_inbox() {
testCasesPage.isConfirmationEmailReceived();
}
@When("I enter {string} in the first tab")
public void i_enter_in_the_first_tab(String email) {
testCasesPage.enterEmailInFirstTab(email);
}
@Then("one registration should be successful")
public void one_registration_should_be_successful() {
testCasesPage.isFirstTabRegistrationSuccessful();
}
@Then("the other registration should fail with an error message indicating the email is already in use")
public void the_other_registration_should_fail_with_an_error_message_indicating_the_email_is_already_in_use() {
testCasesPage.isSecondTabRegistrationFailed();
}
@Then("the successful registration should send a confirmation email")
public void the_successful_registration_should_send_a_confirmation_email() {
testCasesPage.isConfirmationEmailSent();
}
@Then("the failed registration should retain the input values for re-entry")
public void the_failed_registration_should_retain_the_input_values_for_re_entry() {
testCasesPage.doFailedRegistrationRetainValues();
}

@Given("I clickElement the register button")
public void i_click_the_register_button() {
testCasesPage.clickRegisterButton();
}
@Given("the user leaves the password field empty")
public void the_user_leaves_the_password_field_empty() {
testCasesPage.leavePasswordFieldEmpty();
}
@Given("I clickElement the register button in the first tab")
public void i_click_the_register_button_in_the_first_tab() {
testCasesPage.clickRegisterButtonInFirstTab();
}
@When("I confirm the password by entering {string} in the first tab")
public void i_confirm_the_password_by_entering_in_the_first_tab(String password) {
testCasesPage.confirmPasswordInFirstTab(password);
}
@When("I confirm the password by re-entering it")
public void i_confirm_the_password_by_re_entering_it() {
testCasesPage.reEnterPassword();
}
@When("I enter {string} in the second tab")
public void i_enter_in_the_second_tab(String input) {
testCasesPage.enterInputInSecondTab(input);
}
@When("I confirm the password by entering {string} in the second tab")
public void i_confirm_the_password_by_entering_in_the_second_tab(String password) {
testCasesPage.confirmPasswordInSecondTab(password);
}
@When("I enter a password {string}")
public void i_enter_a_password(String password) {
testCasesPage.enterPassword(password);
}
@Given("I clickElement the register button in the second tab")
public void i_click_the_register_button_in_the_second_tab() {
testCasesPage.clickRegisterButtonInSecondTab();
}
@Given("I simulate a network timeout clicking the register button")
public void i_simulate_a_network_timeout_clicking_the_register_button() {
testCasesPage.simulateNetworkTimeout();
}
}