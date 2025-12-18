package com.backend.pages;

import com.utils.ElementUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCasesPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "registrationEmail")
    private WebElement registrationEmailField;
    @FindBy(id = "registrationPassword")
    private WebElement registrationPasswordField;
    @FindBy(id = "confirmPassword")
    private WebElement confirmPasswordField;
    @FindBy(id = "registerButton")
    private WebElement registerButton;
    @FindBy(id = "successPage")
    private WebElement successPage;
    @FindBy(id = "successMessage")
    private WebElement successMessage;
    @FindBy(id = "emailFormatError")
    private WebElement emailFormatError;
    @FindBy(id = "passwordComplexityError")
    private WebElement passwordComplexityError;
    @FindBy(id = "emailInUseError")
    private WebElement emailInUseError;
    @FindBy(id = "confirmationEmail")
    private WebElement confirmationEmail;
    @FindBy(id = "emailRequiredError")
    private WebElement emailRequiredError;
    @FindBy(id = "passwordRequiredError")
    private WebElement passwordRequiredError;
    @FindBy(id = "passwordMismatchError")
    private WebElement passwordMismatchError;
    @FindBy(id = "networkIssueError")
    private WebElement networkIssueError;
    @FindBy(id = "inputField")
    private WebElement inputField;

    public TestCasesPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email) {
        try {
            elementUtils.clearAndSendKeys(registrationEmailField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPassword(String password) {
        try {
            elementUtils.clearAndSendKeys(registrationPasswordField, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void confirmPassword(String confirmPassword) {
        try {
            elementUtils.clearAndSendKeys(confirmPasswordField, confirmPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickRegisterButton() {
        try {
            elementUtils.clickElement(registerButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isSuccessPageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(successPage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isSuccessMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(successMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isEmailInUseErrorDisplayed() {
        try {
            return elementUtils.isElementDisplayed(emailInUseError);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isEmailRequiredErrorDisplayed() {
        try {
            return elementUtils.isElementDisplayed(emailRequiredError);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isPasswordRequiredErrorDisplayed() {
        try {
            return elementUtils.isElementDisplayed(passwordRequiredError);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isPasswordComplexityErrorDisplayed() {
        try {
            return elementUtils.isElementDisplayed(passwordComplexityError);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isPasswordMismatchErrorDisplayed() {
        try {
            return elementUtils.isElementDisplayed(passwordMismatchError);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isNetworkIssueErrorDisplayed() {
        try {
            return elementUtils.isElementDisplayed(networkIssueError);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    ublic void validateEmailFormat(String expectedEmail) {
        try {
            String actualEmail = elementUtils.getElementText(registrationEmailField);
            Assert.assertEquals(actualEmail, expectedEmail, "Email format does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ublic void validatePasswordComplexity(String expectedComplexity) {
        try {
            String actualComplexity = elementUtils.getElementText(passwordComplexityError);
            Assert.assertEquals(actualComplexity, expectedComplexity, "Password complexity does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ublic void checkEmailInboxIsInvalidEmailFormatErrorDisplayed() {
        try {
            WebElement errorElement = driver.findElement(By.id("invalid-email-error"));
            Assert.assertTrue(elementUtils.isElementDisplayed(errorElement), "Invalid email format error is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void confirmPasswordInSecondTab() {
        try {
            WebElement confirmPasswordField = driver.findElement(By.id("confirm-password-second-tab"));
            Assert.assertTrue(elementUtils.isElementDisplayed(confirmPasswordField), "Confirm password field in second tab is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void arePasswordFieldsCleared() {
        try {
            WebElement passwordField1 = driver.findElement(By.id("password-first-tab"));
            WebElement passwordField2 = driver.findElement(By.id("password-second-tab"));
            Assert.assertEquals(elementUtils.clearElement(passwordField1), "", "Password field in first tab is not cleared!");
            Assert.assertEquals(elementUtils.clearElement(passwordField2), "", "Password field in second tab is not cleared!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterMaxLengthEmail(String email) {
        try {
            WebElement emailField = driver.findElement(By.id("email-field"));
            elementUtils.clearAndSendKeys(emailField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isEmailBodyCorrect(String expectedBody) {
        try {
            WebElement emailBodyElement = driver.findElement(By.id("email-body"));
            String actualBody = elementUtils.getElementText(emailBodyElement);
            Assert.assertEquals(actualBody, expectedBody, "Email body is not correct!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateUsingScreenReader() {
        try {
            // Implementation for navigation using screen reader
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickRegisterButtonInFirstTab() {
        try {
            WebElement registerButton = driver.findElement(By.id("register-button-first-tab"));
            elementUtils.clickElement(registerButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areFormFieldsLabeled() {
        try {
            WebElement emailLabel = driver.findElement(By.id("email-label"));
            Assert.assertEquals(elementUtils.getElementText(emailLabel), "Email", "Email label is not correct!");
            // Continue with other form fields...
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isPasswordSecure() {
        try {
            WebElement passwordField = driver.findElement(By.id("password-first-tab"));
            String passwordValue = elementUtils.getElementText(passwordField);
            Assert.assertTrue(passwordValue.length() >= 8, "Password is not secure!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isInvalidInputErrorDisplayed() {
        try {
            WebElement errorElement = driver.findElement(By.id("invalid-input-error"));
            Assert.assertTrue(elementUtils.isElementDisplayed(errorElement), "Invalid input error is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToRegistrationPage() {
        try {
            driver.get("http://localhost/registration");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isEmailReceivedInTime(long expectedTime) {
        try {
            // Logic to check if the email was received within the expected time.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areFormFieldsAccessible() {
        try {
            // Logic to check accessibility of form fields
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void openConfirmationEmail() {
        try {
            // Logic to open confirmation email
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isFirstTabRegistrationSuccessful() {
        try {
            WebElement successMessage = driver.findElement(By.id("success-message-first-tab"));
            Assert.assertTrue(elementUtils.isElementDisplayed(successMessage), "First tab registration was not successful!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void simulateNetworkTimeout() {
        try {
            // Logic to simulate network timeout
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leavePasswordFieldEmpty() {
        try {
            WebElement passwordField = driver.findElement(By.id("password-first-tab"));
            elementUtils.clearElement(passwordField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isEmailFormatCorrect(String email) {
        try {
            // Logic to check if the email format is correct using regex or similar
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void confirmPasswordInFirstTab() {
        try {
            WebElement confirmPasswordField = driver.findElement(By.id("confirm-password-first-tab"));
            Assert.assertTrue(elementUtils.isElementDisplayed(confirmPasswordField), "Confirm password field in first tab is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doFailedRegistrationRetainValues() {
        try {
            // Logic to check if the values are retained after failed registration
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchForConfirmationEmail(String email) {
        try {
            // Logic to search for confirmation email
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isConfirmationMessageDisplayed() {
        try {
            WebElement confirmationMessage = driver.findElement(By.id("confirmation-message"));
            Assert.assertTrue(elementUtils.isElementDisplayed(confirmationMessage), "Confirmation message is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterMaxLengthPassword(String password) {
        try {
            WebElement passwordField = driver.findElement(By.id("password-first-tab"));
            elementUtils.clearAndSendKeys(passwordField, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickRegisterButtonInSecondTab() {
        try {
            WebElement registerButton = driver.findElement(By.id("register-button-second-tab"));
            elementUtils.clickElement(registerButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doInputFieldsRetainValues() {
        try {
            // Logic to ensure input fields retain values
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isEmailSubjectCorrect(String expectedSubject) {
        try {
            WebElement subjectElement = driver.findElement(By.id("email-subject"));
            String actualSubject = elementUtils.getElementText(subjectElement);
            Assert.assertEquals(actualSubject, expectedSubject, "Email subject is not correct!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isScreenReaderReadingCorrectly(String expectedText) {
        try {
            // Logic to verify if screen reader is reading the correct text
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveEmailFieldEmpty() {
        try {
            WebElement emailField = driver.findElement(By.id("email-field"));
            elementUtils.clearElement(emailField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isConfirmationEmailSent() {
        try {
            // Logic to check if confirmation email was sent
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterEmailInFirstTab(String email) {
        try {
            WebElement emailField = driver.findElement(By.id("email-field-first-tab"));
            elementUtils.clearAndSendKeys(emailField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reEnterPassword(String password) {
        try {
            WebElement confirmPasswordField = driver.findElement(By.id("confirm-password-first-tab"));
            elementUtils.clearAndSendKeys(confirmPasswordField, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterInputInSecondTab(String input) {
        try {
            WebElement inputField = driver.findElement(By.id("input-second-tab"));
            elementUtils.clearAndSendKeys(inputField, input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isConfirmationEmailReceived() {
        try {
            // Logic to check if confirmation email has been received
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isSecondTabRegistrationFailed() {
        try {
            WebElement errorElement = driver.findElement(By.id("registration-error-second-tab"));
            Assert.assertTrue(elementUtils.isElementDisplayed(errorElement), "Second tab registration did not fail as expected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isOnRegistrationPage() {
        try {
            String actualUrl = driver.getCurrentUrl();
            Assert.assertEquals(actualUrl, "http://localhost/registration", "Not on the registration page!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void submitFormUsingKeyboard() {
        try {
            // Logic to submit form using keyboard shortcuts
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void canLoginWithNewCredentials(String username, String password) {
        try {
            WebElement usernameField = driver.findElement(By.id("username-field"));
            WebElement passwordField = driver.findElement(By.id("password-field"));
            elementUtils.clearAndSendKeys(usernameField, username);
            elementUtils.clearAndSendKeys(passwordField, password);
            // Simulate pressing Enter
            passwordField.sendKeys(Keys.RETURN);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillFormUsingKeyboard() {
        try {
            // Logic to fill the form using keyboard interactions
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}