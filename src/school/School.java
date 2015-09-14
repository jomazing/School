
package school;

public class School {

    public static void main(String[] args) {
        Person billy = Person.addPerson("Billy", Person.Gender.Male, 400);
        Person joe = Person.addPerson("Joe", Person.Gender.Female, 200);
//        joe.setName("Bobby");
        Person billyJoe = Person.addPerson("Billy-Joe", Person.Gender.Male, 100);
        Person gertrude = Person.addPerson("Gertrude", Person.Gender.Female, 110);
        Person billyJoeGertrude = Person.addPerson("Billy-Joe-Gertrude", Person.Gender.Male, 400);
        Person jack = Person.addPerson("Jack", Person.Gender.Male, 800);
        Person billyJoeGertrudeJack = Person.addPerson("Billy-Joe-Gertrude-Jack", Person.Gender.Female, 1200);
        System.out.println(jack);
        
//        Person.printNames();
        
        Person.printNames(Person.Gender.Male);
                
    }
    
}
