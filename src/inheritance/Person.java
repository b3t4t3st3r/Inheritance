package inheritance;

// Aurelio Martinez.
public abstract class Person     // ABSTRACT CLASSES CANNOT BE INSTANSIATED.
{
    // Data Fields || Class Variables.
    private String firstname;
    private String lastname;
    private int age;

    // Constructor.
    public Person(String firstname, String lastname, int age)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    // Getter.
    public String getFirstname()
    {
        return firstname;
    }

    // Setter.
    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    // Getter.
    public String getLastname()
    {
        return lastname;
    }

    // Setter.
    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    // Getter.
    public int getAge()
    {
        return age;
    }

    // Setter.
    public void setAge(int age)
    {
        this.age = age;
    }    

    // To String.
    @Override
    public String toString()
    {
        return "Firstname: " + firstname + ", Lastname: " + lastname + ", Age: " + age;
    }    
    
    // Abstract Method.
    public abstract boolean isOlder();
}
