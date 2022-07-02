package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyPagesAppointmentPage {
    public MyPagesAppointmentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-user fa-w-14 ']")
    public WebElement firstSignIn;

    @FindBy(id = "login-item")
    public WebElement signIn;

 @FindBy(xpath ="//*[@id='entity-menu']/a/span")
  public WebElement myPages;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-calendar-week fa-w-14 fa-fw ']")
    public WebElement myAppointments;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement editButton;

    @FindBy(xpath = "//*[@id='hospitalmsappfrontendApp.appointment.home.createOrEditLabel']/span")
    public WebElement createEditAppointmentText;

    @FindBy(name = "id")
    public WebElement id;

    @FindBy(name = "startDate")
    public WebElement startDate;

    @FindBy(name = "endDate")
    public WebElement endDate;

    @FindBy(name = "status")
    public WebElement status;

    @FindBy(name = "physician.id")
    public WebElement physician;

    @FindBy(name = "anamnesis")
    public WebElement anamnesis;

    @FindBy(name = "treatment")
    public WebElement treatment;

    @FindBy(name = "diagnosis")
    public WebElement diagnosis;

    @FindBy(xpath= "//*[@class='btn btn-primary']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement savedSuccessfullyText;




}
