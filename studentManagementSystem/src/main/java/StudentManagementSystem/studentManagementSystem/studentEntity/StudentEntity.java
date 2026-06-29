package StudentManagementSystem.studentManagementSystem.studentEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
 import jakarta.validation.constraints.*;


@Entity
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Name Cannot be Empty")
    private String name;

    @NotBlank(message = "Course Cannot be Empty")
    private String course;

    @Min(value = 1 , message = "Rollno Cannot be Empty")
    private int rollno;

    @NotBlank(message = "Phone Number is Cannot be Empty")
    @Pattern(
            regexp = "^[0-9]{10}$",
            message = "Phone Number must be Exactly 10 digits"
    )
    private String phone;

    @NotBlank(message = "Email is Cannot be Empty")
    @Email(message = "Please Enter a Valid Email")
    private String email;

    @NotBlank(message = "Address is Cannot be Empty")
    private String address;

     @Min(value = 18, message = "Age must be at least 18")
     @Max(value = 60, message = "Age must be below 60")
    private int age;

    @NotBlank(message = "Gender is cannot be Empty")
    private String gender;

    @NotBlank(message = "City is Cannot be Empty")
    private String city;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;

    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;

    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
}
