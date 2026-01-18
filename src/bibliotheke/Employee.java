package bibliotheke;

public class Employee extends AbstractUser{
    public Employee(String full_name, String birth_date, String email, String address){
        super(full_name, birth_date, email, address);

        /*Split all the fields in birth_date and sum*/
        int id = 0;
        String[] pieces = birth_date.split("/");
        for(String s: pieces){
            id += Integer.parseInt(s);
        }
        this.setIDNumber(id);
    }

    private void setIDNumber(Integer id){
        this.id_number = id;
    }

    @Override
    public Integer getIDNumber() {
        return this.id_number;
    }
}
