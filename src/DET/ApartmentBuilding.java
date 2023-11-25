package DET;

public class ApartmentBuilding extends Building {
    private int numFloors;
    private int unitsPerFloor;
    private boolean hasElevator;
    private boolean hasCentralAir;
    private String managingCompany;

    public ApartmentBuilding(int numFloors, int unitsPerFloor, boolean hasElevator, boolean hasCentralAir, String managingCompany) {
        this.numFloors = numFloors;
        this.unitsPerFloor = unitsPerFloor;
        this.hasElevator = hasElevator;
        this.hasCentralAir = hasCentralAir;
        this.managingCompany = managingCompany;
    }

    public int getTotalUnits() {
        return numFloors * unitsPerFloor;
    }

    public boolean isLuxuryBuilding() {
        return hasCentralAir && hasElevator && unitsPerFloor <= 2;
    }
}
