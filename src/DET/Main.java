package DET;

public class Main {
    public static void main(String[] args) {
        
        ApartmentBuilding apartmentBuilding = new ApartmentBuilding(5, 3, true, true, "Luxury Realty");

        System.out.println("Total Units: " + apartmentBuilding.getTotalUnits());
        System.out.println("Is Luxury Building: " + apartmentBuilding.isLuxuryBuilding());
    }
}
