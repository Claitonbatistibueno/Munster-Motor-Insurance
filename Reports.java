public class Reports {
    public String Owner;
    public String IncidentDate;
    public String Time;
    public String Location;
    public String Description;
    public String Damage;
    public String DatePublished;
    public Reports(String owner, String incidentDate, String time, String location, String description, String damage, String datePublished)

    {
        this.Owner = owner;
        this.IncidentDate = incidentDate;
        this.Time = time;
        this.Location = location;
        this.Description = description;
        this.Damage = damage;
        this.DatePublished = datePublished;

    }
    public String DisplayDetails()

    {
        return "Owner: " + this.Owner + "\nDate of Incident: " + this.IncidentDate + "\nTime of Incident: " + this.Time + "\nLocation: " + this.Location + "\nDescription: " + this.Description + "\nDamage: " + this.Damage + "\nDate Published: " + this.DatePublished;

    }

}

