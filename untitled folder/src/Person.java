//javaBean
import net.sf.json.*;
public class Person {
    public String name;
    public int age;
    public String idCard;
    //省略getter&setter

    public String getName(){
        return name;
    }
    void setName(String a){
        name = a;
    }
    void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
    void setIdCard(String a){
        idCard = a;
    }
    public String getIdCard(){
        return idCard;
    }
    public String toString(){
        return "name = " + name;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("孙亚龙");
        person.setAge(30);
        person.setIdCard("512445546565164641212");

        JSONObject json2 =JSONObject.fromObject(person);
        String stu = json2.toString();
        System.out.println(stu);
    }

}



