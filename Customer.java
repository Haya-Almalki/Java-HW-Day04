public class Customer {

    int ID;
    String name;
    char gender;

    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        if(gender!='f' && gender!='m'){
            throw new RuntimeException("Gender should be 'f' or 'm' ");
        }
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
