package pages;

public class ParkingPage extends BasePage {

    private String selectParking = "//select[@name = 'ParkingLot']";
    private String entryDateInput = "//input[@name = 'StartingDate']";
    private String entryTimeInput = "//input[@name = 'StartingTime']";
    private String entryRadioButton = "//input[@name = 'StartingTimeAMPM'][1]";
    private String leavingDateInput = "//input[@name = 'LeavingDate']";
    private String leavingTimeInput = "//input[@name = 'LeavingTime']";
    private String leavingRadioButton = "//input[@name = 'LeavingTimeAMPM'][2]";
    private String calculateButton = "//input[@type = 'submit']";
    private String price = "//span[@class = 'SubHead']/b";

    public ParkingPage() {
        super(driver);
    }

    public void navigateToParking() {

        navigateTo("https://www.shino.de/parkcalc");
    }

    public void fillParkingForm() {

        selectFromDropdownByValue(selectParking, "Economy");
        write(entryDateInput, "12/8/2021");
        write(entryTimeInput, "12:00");
        clickElement(entryRadioButton);
        write(leavingDateInput, "12/25/2021");
        write(leavingTimeInput, "12:00");
        clickElement(leavingRadioButton);
    }

    public void clickCalculateButton() {
        clickElement(calculateButton);
    }

    public String parkingPrice() {
        return textFromElement(price);
    }
}