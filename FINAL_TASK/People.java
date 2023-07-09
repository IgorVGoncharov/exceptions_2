package FINAL_TASK;

public class People {
    private String name;
    private String secname;
    private String lastname;
    private String birthday;
    private String telNumber;
    private String male;
    
    public People(String name, String secname, String lastname, String birthday, String telNumber, String male) {
        this.name = name;
        this.secname = secname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.telNumber = telNumber;
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public String getSecname() {
        return secname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public String getMale() {
        return male;
    }
    
    @Override
    public String toString() {
        return "<" + this.name + ">" + "<" + this.secname + ">" 
        + "<" + this.lastname + ">" + "<" + this.birthday + ">" 
        + "<" + this.telNumber + ">" + "<" + this.male + ">";
    }




}
