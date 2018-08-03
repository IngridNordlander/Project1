
package Projekt1;
   
public class Person {

   
    private String personal_id;
    private int age;
    private String gender;
    private String name;
    
    public Person(String personal_id,int age,String name,String gender){
    this.personal_id = personal_id;
    this.age = age;
    this.gender= gender;
    this.name= name;
    }


    
    
    public String getPersonal_id() {
        return personal_id;
    }

    public void setPersonal_id(String personal_id) {
        this.personal_id = personal_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}    

