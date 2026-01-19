public class DeliveryServiceTest {
    public static void main(String[] args){
        
    DeliveryService ds1 = new DeliveryService("letter", "Next Day Priority", 7.00);
    ds1.calculatePackageCharge();
    ds1.displayPackageDetails();
    DeliveryService ds2 = new DeliveryService("letter", "Next Day Standard", 5.00);
    ds2.calculatePackageCharge();
    ds2.displayPackageDetails();
    DeliveryService ds3 = new DeliveryService("box", "Next Day Priority", 1.00);
    ds3.calculatePackageCharge();
    ds3.displayPackageDetails();
    DeliveryService ds4 = new DeliveryService("box", "Next Day Standard", 1.00);
    ds4.calculatePackageCharge();
    ds4.displayPackageDetails();
    DeliveryService ds5 = new DeliveryService("box", "2-Day", 1.00);
    ds5.calculatePackageCharge();
    ds5.displayPackageDetails();
    DeliveryService ds6 = new DeliveryService("box", "Next Day Priority", 5.00);
    ds6.calculatePackageCharge();
    ds6.displayPackageDetails();
    DeliveryService ds7 = new DeliveryService("box", "Next Day Standard", 5.00);
    ds7.calculatePackageCharge();
    ds7.displayPackageDetails();
    DeliveryService ds8 = new DeliveryService("2-Day", "2-Day", 5.00);
    ds8.calculatePackageCharge();
    ds8.displayPackageDetails();
    }
}