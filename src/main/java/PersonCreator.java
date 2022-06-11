public class PersonCreator {


    public static void main(String[] args) {
        Person Person01=new Person("James Paterson",34,180,73.5);
        Person Person02=new Person("Bob Thornley",25,171,68.2);
        System.out.println("Person01 Name: "+Person01.getName());
        System.out.println("Person01 Age: "+Person01.getAge());
        System.out.println("Person01 height: "+Person01.getHeight());
        System.out.println("Person01 weight: "+Person01.getWeight());



        System.out.println("Person02 Name: "+Person02.getName());
        System.out.println("Person02 Age: "+Person02.getAge());
        System.out.println("Person02 height: "+Person02.getHeight());
        System.out.println("Person02 weight: "+Person02.getWeight());

    }

}
