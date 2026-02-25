public class Customer {
    public int CustomerID;
    public String FirstName;
    public String Surname;
    public String Address;
    public String City;
    public String DOB;
    public String Gender;
    public String PhoneNumber;
    public String Email;

    public Customer(int customerID, String firstName, String surname, String address, String city, String dob, String gender, String phoneNumber, String email) {
        this.CustomerID = customerID;
        this.FirstName = firstName;
        this.Surname = surname;
        this.Address = address;
        this.City = city;
        this.DOB = dob;
        this.Gender = gender;
        this.PhoneNumber = phoneNumber;
        this.Email = email;
    }

    public String DisplayDetails() {
        return "ID: " + this.CustomerID + "\nFirst Name: " + this.FirstName + "\nSurname: " + this.Surname + "\nAddress: " + this.Address + "\nCity: " + this.City +"\nDOB: " + this.DOB + "\nGender: " + this.Gender + "\nPhone Number: " + this.PhoneNumber + "\nEmail: " + this.Email;
    }

    // Novo método para salvar os dados em formato estruturado
    public String toCSV() {
        return CustomerID + "," + FirstName + "," + Surname + "," + Address + "," + City + "," + DOB + "," + Gender + "," + PhoneNumber + "," + Email;
    }
}