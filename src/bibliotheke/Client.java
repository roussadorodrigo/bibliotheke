package bibliotheke;

public class Client extends AbstractUser{

    @Override
    public Integer getIDNumber() {
        return -1; //This means that the user is not an employee
    }
}
