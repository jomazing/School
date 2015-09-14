
package school;

import java.util.ArrayList;

public class Course {
    private static ArrayList<Person> people = new ArrayList<Person>();
    enum type{
        Math, Science, History, English, Language, Elective, PE
    }
    private String name;
    private int period;
    
    Course(String name_, int period_)
    {
        name = name_;
        period = period_;
    }
    public int getPeriod()
    {
        return(period);
    }
    public void setPeriod(int _period)
    {
       period = _period;
    }
    public String getName()
    {
        return(name);
    }
    public void setName(String _name)
    {
       name = _name;
    }
    public static Course addCourse(String name_, int period_)
    {
        Course temp = new Person(name_,period_);
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
    public static void printNames(Person.Gender gender_)
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
