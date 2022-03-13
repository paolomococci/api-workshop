package local.example.outcome.model;

public class SignedClaim {

    public String country;
    public String city;
    public String name;
    public String email;
    public String subject;

    public SignedClaim() {
    }

    public SignedClaim(
            String country,
            String city,
            String name,
            String email,
            String subject
    ) {
        this.country = country;
        this.city = city;
        this.name = name;
        this.email = email;
        this.subject = subject;
    }
}
