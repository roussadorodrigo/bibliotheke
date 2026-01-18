package bibliotheke;

public class Client extends AbstractUser{

    public Client(String full_name, String birth_date, String email, String address){
        super(full_name, birth_date, email, address);
    }


    @Override
    public Integer getIDNumber() {
        return -1; //This means that the user is not an employee
    }
}
