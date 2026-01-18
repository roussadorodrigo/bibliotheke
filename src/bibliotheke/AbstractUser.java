package bibliotheke;

public abstract class AbstractUser implements UserInterface{
    /*FIELDS FOR ALL USERS*/
    private String full_name;
    private String birth_date;
    private String email;
    private String address;
    private String encrypted_login;
    private String encrypted_password;

    /*FIELDS FOR EMPLOYEES ONLY*/
    protected Integer id_number; //only for employees

    /*METHODS*/
    public AbstractUser(String full_name, String birth_date, String email, String address){
        this.full_name = full_name;
        this.birth_date = birth_date;
        this.email = email;
        this.address = address;
        this.encrypted_login = Utils.encrypt(full_name);
        this.encrypted_password = (birth_date + address + Utils.getRandomKey());
    }

    public String getLogin(){
        return Utils.decrypt(this.encrypted_login);
    }


    public String getPassword(){
        return Utils.decrypt(this.encrypted_password);
    }


    public String getFullName(){return this.full_name;}

    public String getBirthDate(){return this.birth_date;}

    public String getEmail(){return this.email;}

    public String getAddress(){return this.address;}

    public abstract Integer getIDNumber();
}
