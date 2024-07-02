package Page;

import Utility.Utility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookPage extends BasePage {
    public BookPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(), this);
    }

    //Input first name
    @FindBy(xpath = "//input[@id='input_first_name']")
    WebElement inputFirstName;

    public void inptFirstName(String firstName) {
        doSetText(inputFirstName, firstName);
    }

    //input last name
    @FindBy(xpath = "//input[@id='input_last_name']")
    WebElement inputLastName;

    public void inptLastName(String lastName) {
        doSetText(inputLastName, lastName);
    }

    @FindBy(xpath = "//input[@id='input_email_address']")
    WebElement inputEmail;

    public void inptEmailAddress(String emailAddress) {
        doSetText(inputEmail, emailAddress);
    }

    @FindBy(xpath = "//div[@class='iti__selected-flag']")
    WebElement clickPhone;

    public void clickPhoneDropDown() {
        doClick(clickPhone);
    }

    @FindBy(xpath = "//span[.='+65']")
    WebElement slctPhoneRegion;

    public void selectPhoneRegion() {
        doClick(slctPhoneRegion);
    }

    @FindBy(xpath = "//input[@id='input_phone_number']")
    WebElement inputPhoneNo;

    public void InputPhoneNum(String inputPhonNo) {
        doSetText(inputPhoneNo, inputPhonNo);
    }

    @FindBy(xpath = "//input[@id='datepicker_preferred_date']")
    WebElement slctDate;

    public void selectDate() {
        doClick(slctDate);
    }

    @FindBy(css = ".today")
    WebElement datePicker;

    public void pickDate() {
        doClick(datePicker);
    }

    @FindBy(xpath = "//form[@class='form__cont is_shown']//div[@class='choices__list choices__list--single']/div[.='Preferred timeRemove item']")
    WebElement slctPreferedTime;

    public void clickPreferedTime() {
        doClick(slctPreferedTime);
    }

    @FindBy(css = "[data-value='18:00']")
    WebElement slctTime;

    public void selectTime() {
        doClick(slctTime);
    }


    @FindBy(xpath = "//form[@class='form__cont is_shown']//div[@class='choices__list choices__list--single']/div[.='Preferred sales consultant (optional)Remove item']")
    WebElement clicktSales;

    public void clickPreferedSales() {
        doClick(clicktSales);
    }

    @FindBy(css = "[data-value='Cai Yu Tong : yutong.cai@inchcape.com.sg']")
    WebElement slctSales;

    public void selectSales() {
        doClick(slctSales);
    }

    @FindBy(xpath = "//form[@class='form__cont is_shown']//div[@class='choices__list choices__list--single']/div[.='Number of pax Remove item']")
    WebElement clickNumberPax;

    public void clickPax() {
        doClick(clickNumberPax);
    }

    @FindBy(css = "[data-value='1']")
    WebElement slctPax;

    public void selectPax() {
        doClick(slctPax);
    }

    @FindBy(xpath = "//div[@class='choices__list choices__list--multiple']//button[@class='choices__button']")
    WebElement dltemodel;

    public void deleteModel() {
        doClick(dltemodel);
    }

    @FindBy(xpath = "//input[@id='checkbox_privacy_policy']")
    WebElement clickCheckBox1;

    public void clickCheckBox() {
        doClick(clickCheckBox1);
    }

    @FindBy(xpath = "//input[@id='checkbox_marketing']")
    WebElement clickCheckBox2;

    public void clickCheckBoxMarketing() {
        doClick(clickCheckBox2);
    }

    //cookies
    @FindBy(xpath = "//span[normalize-space()='Accept all cookies']")
    WebElement clickCookies;

    public void acceptcookies() {
        doClick(clickCookies);
    }

    @FindBy(xpath = "//input[@class='choices__input choices__input--cloned']")
    WebElement clickModel;

    public void clickPreferedModel() {
        doClick(clickModel);
    }

    @FindBy(css = "[data-value='NX 350h']")
    WebElement slctModel;

    public void selectModelPrefered() {
        doClick(slctModel);
    }

    @FindBy(css = "[value='NX 350h']")
    WebElement clickTestDrive;
    public void clickTestdriveDropBtn(){
        doClick(clickTestDrive);
    }
    @FindBy(css = "[data-value='UX 300h']")
    WebElement slctNewModel;

    public void selectModel() {
        doClick(slctNewModel);
    }
    @FindBy(css = "[data-value='lexus-test-drive-concierge']")
    WebElement slctTestDrive;
    public void selectTestDriveOption(){
        doClick(slctTestDrive);
    }

    @FindBy(xpath = "//div[@class='button__wrp inline']")
    WebElement btnSubmit;

    public boolean BtnSubmitDisable(){
        return btnSubmit.isDisplayed();
    }

    @FindBy(css = "[data-value='UX 300e']")
    WebElement prefModel;
    public boolean verifyModel(){
        return prefModel.isDisplayed();
    }

    @FindBy(xpath = "//input[@id='checkbox_driving_license']")
    WebElement driveLicense;
    public void checkboxDriveLicense(){
        doClick(driveLicense);
    }
    @FindBy(xpath = "//input[@id='checkbox_terms_conditions']")
    WebElement termCondition;
    public void checkboxTermCondition(){
        doClick(termCondition);

    }
    @FindBy(xpath = "//input[@id='input_vehicle_model']")
    WebElement inputVehicle;
    public void inputVehicleModel(String inptVehicleMode){
        waitForElementPresent(inputVehicle);
        doSetText(inputVehicle,inptVehicleMode);
    }
    @FindBy(xpath = "//input[@id='input_year_of_vehicle']")
    WebElement inputYearVehicle;
    public void inputYearVehicle(String yearVehicle){
        waitForElementPresent(inputYearVehicle);
        doSetText(inputYearVehicle,yearVehicle);
    }
    }

