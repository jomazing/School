
package school;
import java.util.ArrayList;

public class Person {
//    public static int numPeople = 10;
//    private static int currentPeopleIndex = 0;
//    private static Person people[] = new Person[numPeople];
    private static ArrayList<Person> people = new ArrayList<Person>();
    enum Gender{
        Male,Female
    }
    private String name;
    private int weight;
    private Gender gender;
    
    Person(String name_,int weight_,Gender gender_)
    {
        name = name_;
        weight = weight_;
        gender = gender_;
    }
    public int getWeight()
    {
        return(weight);
    }
    public void setWeight(int _weight)
    {
       weight = _weight;
    }
    public String getName()
    {
        return(name);
    }
    public void setName(String _name)
    {
       name = _name;
    }
    public Gender getGender()
    {
        return(gender);
    }
    public void setGender(Gender _gender)
    {
       gender = _gender;
    }
    public static Person addPerson(String name_, Gender gender_, int weight_)
    {
        Person temp = new Person(name_,weight_,gender_);
//        people[currentPeopleIndex++] = temp;
        people.add(temp);
        return(temp);
    }
    public static void printNames()
    {
        System.out.println("======printNames======");
//        for (int i=0;i<people.length;i++)
//        {
//            if (people[i] != null)
//            {
//                System.out.println(people[i].getName());
//            }
//        }
        for (Person temp : people)
        {     
                System.out.println(temp.getName());
        }
    }
    public static void printNames(Gender gender_)
    {
        System.out.println("======printNames======");
//        for (int i=0;i<people.length;i++)
//        {
//            if (people[i] != null)
//            {
//                System.out.println(people[i].getName());
//            }
//        }
        for (Person temp : people)
        {
            if (temp.gender == gender_)
                System.out.println(temp.getName());
        }
    }
    public String toString()
    {
        return(name + " " + gender + " " + weight);
    }
    
}
