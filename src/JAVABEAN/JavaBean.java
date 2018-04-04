package JAVABEAN;
import java.util.ArrayList;
import java.util.List;

public class JavaBean {
    public static void main(String args[]){
    
        List<Person> listPerson=new ArrayList<Person>();
        
        Person person=new Person();
        
        person.setHeight(100);
        person.setWeight(100);
        
        listPerson.add(person);
  
    }
    
}
