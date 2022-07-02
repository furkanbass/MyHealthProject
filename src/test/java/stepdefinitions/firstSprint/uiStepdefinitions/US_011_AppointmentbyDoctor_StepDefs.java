package stepdefinitions.firstSprint.uiStepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.LoginPage;
import pages.MyPagesAppointmentPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_011_AppointmentbyDoctor_StepDefs {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    MyPagesAppointmentPage myPagesAppointmentPage = new MyPagesAppointmentPage();


    @Then("user navigates the sign in page with validUsername and validPassword")
    public void user_navigates_the_sign_in_page_with_and() {


        myPagesAppointmentPage.firstSignIn.click();
        myPagesAppointmentPage.signIn.click();
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("validDoctorUsername"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("validDoctorPassword"));
    }
    @Then("user signs in")
    public void user_signs_in() {
        loginPage.signInButton.click();

    }
    @Then("user navigates to My Pages segment")
    public void user_navigates_to_my_pages_segment() {
        myPagesAppointmentPage.myPages.click();
    }
    @Then("user clicks on My appointments")
    public void user_clicks_on_my_appointments() {
        myPagesAppointmentPage.myAppointments.click();
    }
    @Then("user clicks on Edit button")
    public void user_clicks_on_edit_button() {
        myPagesAppointmentPage.editButton.click();
    }
    @Then("user verifies the website shows the Create or Edit an Appointment text")
    public void user_verifies_the_website_shows_the_text() {
        String expected = "Create or Edit an Appointment";
        String actual = myPagesAppointmentPage.createEditAppointmentText.getText();
        Assert.assertEquals(expected,actual);
    }
    @Then("user verifies patient's info id is visible")
    public void user_verifies_patient_s_info_id_is_visible() {
        Assert.assertTrue(myPagesAppointmentPage.id.isDisplayed());

    }
    @Then("closes the page")
    public void closes_the_page() {
        Driver.closeDriver();

    }
    @Then("user verifies patient's start date is visible")
    public void user_verifies_patient_s_start_date_is_visible() {
        Assert.assertTrue(myPagesAppointmentPage.startDate.isDisplayed());
    }
    @Then("user verifies patient's end date is visible")
    public void user_verifies_patient_s_end_date_is_visible() {
       Assert.assertTrue(myPagesAppointmentPage.endDate.isDisplayed());
    }
    @Then("user verifies patient's status is visible")
    public void user_verifies_patient_s_status_is_visible() {
        Assert.assertTrue(myPagesAppointmentPage.status.isDisplayed());
    }
    @Then("user verifies patient's physician is visible")
    public void user_verifies_patient_s_physician_is_visible() {
       Assert.assertTrue(myPagesAppointmentPage.physician.isDisplayed());
    }
    @Then("verify the patient's physician name which should be the same with login user's name")
    public void verify_the_patient_s_physician_name_which_should_be_the_same_with_login_user_s_name() {
        String expectedPhysician = ConfigurationReader.getProperty("102969:"+"validDoctorName"+":FAMILY_MEDICINE");
        String actualPhysician = myPagesAppointmentPage.physician.getText();
        Assert.assertEquals(expectedPhysician,actualPhysician);
    }
    @Then("user verifies patient's name is visible")
    public void user_verifies_patient_s_name_is_visible() {

    }
    @Then("user fills in required fields, anemnesis, treatment, diagnosis")
    public void user_fills_in_required_fields_anemnesis_treatment_diagnosis() {
        myPagesAppointmentPage.anamnesis.sendKeys();
        myPagesAppointmentPage.treatment.sendKeys();
        myPagesAppointmentPage.diagnosis.sendKeys();
    }
    @Then("user clicks on Save button")
    public void user_clicks_on_save_button() {
        myPagesAppointmentPage.saveButton.click();
    }
    @Then("verify appointment is saved successfully")
    public void verify_appointment_is_saved_successfully() {
        String expected = "The Appointment is updated with identifier "+myPagesAppointmentPage.id;

        Assert.assertEquals(expected,myPagesAppointmentPage.savedSuccessfullyText.getText());

    }


    @And("user waits {int} seconds")
    public void userWaitsSeconds(int sec) throws InterruptedException {
        Thread.sleep(sec);
    }
}
