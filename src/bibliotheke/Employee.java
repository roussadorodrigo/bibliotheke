package bibliotheke;

public class Employee extends AbstractUser{
    @Override
    public Integer getIDNumber() {
        return this.id_number;
    }
}
