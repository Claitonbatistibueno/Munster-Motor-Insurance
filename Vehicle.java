public class Vehicle {
    public int VehicleID;
    public String Make;
    public String Model;
    public int Year;
    public String Colour;

    public Vehicle(int vehicleID, String make, String model, int year, String colour) {
        this.VehicleID = vehicleID;
        this.Make = make;
        this.Model = model;
        this.Year = year;
        this.Colour = colour;
    }

    public String DisplayDetails() {
        return "ID: " + this.VehicleID + "\nMake: " + this.Make + "\nModel: " + this.Model + "\nYear: " + this.Year + "\nColour: " + this.Colour;
    }

    //
    public String toCSV() {
        return VehicleID + "," + Make + "," + Model + "," + Year + "," + Colour;
    }
}
