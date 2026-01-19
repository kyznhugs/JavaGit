public class DeliveryService {

    private String packageType;
    private String serviceType;
    private double packageWeight;
    private double packageCharge;


    public DeliveryService (String pT, String sT ,double pW ){
        packageType = pT;
        serviceType = sT;
        packageWeight = pW; 
        packageCharge = 0.00;
    }

    public double calculatePackageCharge() {

        if (packageType.equals("letter") && packageWeight > 8) {
            System.out.println("Not Applicable");
            
            return 0.00;
        }

        double additionalCost = 0.0;

                
        if (packageType.equals("letter")){
            packageCharge = 2.00 + (packageWeight * additionalCost);  
        } else if (packageType.equals("box")){
            packageCharge = 5.00 + (packageWeight * additionalCost);
        }

        return packageCharge;

    }   
    public void displayPackageDetails(){
        System.out.println("Package Type" + packageType  ());
        System.out.println("Service Type" + serviceType());
        System.out.println("Package Weight"  + packageWeight  ());
        System.out.println("Package Charge" + packageCharge());
    }

}
