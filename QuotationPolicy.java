public class QuotationPolicy {
    // Attributes linking to Customer, Vehicle, and the Quote itself
    public int quoteID;
    public int customerID;
    public int vehicleID;
    public double finalQuote;
    public boolean isDeclined;

    // Constructor
    public QuotationPolicy(int customerID, int vehicleID, String gender, int age, String county, String make, String model, String emissions, String category) {
        this.quoteID = (int) (Math.random() * 90000) + 10000; // Generates a 5-digit Quote ID
        this.customerID = customerID;
        this.vehicleID = vehicleID;
        this.finalQuote = 0.0;
        this.isDeclined = false;

        // Triggers the mathematical logic upon object creation
        calculateQuote(gender, age, county, make, model, emissions, category);
    }

    // Business Logic Method (OOP)
    private void calculateQuote(String gender, int age, String county, String make, String model, String emissions, String category) {
        // 1. Base Quote & Gender
        if (gender.equalsIgnoreCase("M")) {
            this.finalQuote += 2000.0;
        } else if (gender.equalsIgnoreCase("F")) {
            this.finalQuote += 800.0;
        }

        // 2. Age Rule (>= 80 declines the quote)
        if (age >= 80) {
            this.isDeclined = true;
            return; // Stops calculation
        }

        if (gender.equalsIgnoreCase("M")) {
            if (age < 20) this.finalQuote += 400;
            else if (age <= 35) this.finalQuote -= 800;
            else if (age < 80) this.finalQuote -= 1300;
        } else {
            if (age < 20) this.finalQuote += 160;
            else if (age <= 35) this.finalQuote -= 320;
            else if (age < 80) this.finalQuote -= 520;
        }

        // 3. County Modifier
        switch (county) {
            case "Cork": this.finalQuote += 50; break;
            case "Clare": this.finalQuote += 225; break;
            case "Kerry": this.finalQuote += 50; break;
            case "Limerick": this.finalQuote -= 75; break;
            case "Tipperary": this.finalQuote -= 80; break;
            case "Waterford": this.finalQuote -= 100; break;
        }

        // 4. Make & Model Modifier
        if (make.equalsIgnoreCase("BMW")) {
            switch (model) {
                case "Convertible": this.finalQuote += 200; break;
                case "Gran Turismo": this.finalQuote += 250; break;
                case "BMW X6": this.finalQuote += 300; break;
                case "BMW Z4": this.finalQuote += 175; break;
            }
        } else if (make.equalsIgnoreCase("Opel")) {
            switch (model) {
                case "Corsa": this.finalQuote += 50; break;
                case "Astra": this.finalQuote += 105; break;
                case "Vectra": this.finalQuote += 150; break;
            }
        } else if (make.equalsIgnoreCase("Toyota")) {
            switch (model) {
                case "Yaris": this.finalQuote += 50; break;
                case "Auris": this.finalQuote += 75; break;
                case "Corolla": this.finalQuote += 100; break;
                case "Avensis": this.finalQuote += 125; break;
            }
        } else if (make.equalsIgnoreCase("Renault")) {
            switch (model) {
                case "Fleunce": this.finalQuote += 100; break;
                case "Megane": this.finalQuote += 75; break;
                case "Clio": this.finalQuote += 50; break;
            }
        }

        // 5. Emissions Modifier
        if (emissions.equalsIgnoreCase("High")) this.finalQuote += 300;
        else if (emissions.equalsIgnoreCase("Medium")) this.finalQuote += 150;
        else if (emissions.equalsIgnoreCase("Low")) this.finalQuote -= 55;

        // 6. Insurance Category Modifier
        if (category.equalsIgnoreCase("Fully Comprehensive Plus")) this.finalQuote += 200;
        else if (category.equalsIgnoreCase("Third Party Fire and Theft")) this.finalQuote -= 120;
    }

    // Output Method
    public String DisplayDetails() {
        if (this.isDeclined) {
            return "Quote ID: #" + this.quoteID + "\nCustomer ID: " + this.customerID + "\nVehicle ID: " + this.vehicleID + "\nStatus: DECLINED (Age >= 80. No Quote Provided.)";
        } else {
            return "Quote ID: #" + this.quoteID + "\nCustomer ID: " + this.customerID + "\nVehicle ID: " + this.vehicleID + "\nStatus: APPROVED\nFinal Quote: €" + this.finalQuote;
        }
    }
}
