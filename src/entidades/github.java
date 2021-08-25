package entidades;

public class github {
    
    
    private String name;
    private String adress;
    private Integer dni;
    private Integer age;
    private Integer bornAge;
    
    public github() {
    }

    public github(String name, String adress, Integer dni, Integer age) {
        this.name = name;
        this.adress = adress;
        this.dni = dni;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "github{" + "name=" + name + ", adress=" + adress + ", dni=" + dni + ", age=" + age + '}';
    }
      
}
