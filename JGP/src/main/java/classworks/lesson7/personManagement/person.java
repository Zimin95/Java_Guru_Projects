package src.main.java.classworks.lesson7.personManagement;

public class person {
    // list of fields
    String name;
    String surname;
    int age;
    Boolean isMarried;// true= married,false=single;

    // list of constructors
     public person(){
         this.name ="No name";
         this.surname ="Unknown";
         this.age= 0;
         this.isMarried =false;}
        public person(String name){
             this.name =name;
             this.surname ="Unknown";
             this.age= 0;
             this.isMarried =false;
    }
    public person(String name,String surname,int age){
        this.name =name;
        this.surname =surname;
        this.age=age;
        this.isMarried =false;
    }

    // list of methods
   void celebrateBirthday(){
     this.age++;// plus one year
    }
    void getMarried(){
      this.isMarried=true; //set maritalStatus to true;
    }
    void GetDivorced(){
      this.isMarried=false; //set maritalStatus to false;
    }
}
