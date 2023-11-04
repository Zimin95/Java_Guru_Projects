package src.main.java.homeworks.HW7.Person;

public class mainProgram {
    public static void main(String[] args) {
        person vanya= new person(1991,"Ivan");
        person zhenya= new person("Eugene");
        vanya.setSurname("Ivanov");
        zhenya.setSurname("Petrov");

        if (vanya.age>=18){
            vanya.hire();
            System.out.println(vanya.name +" "+ vanya.getSurname() +" "+"is hired");
             }
            else{
             vanya.fire();
             System.out.println(vanya.name+ " "+ vanya.getSurname()+" "+ "can't be hired");
            }
                if(zhenya.age>=18){
                zhenya.hire();
                System.out.println(zhenya.name+" "+ zhenya.getSurname()+" "+"is hired");
            }
                     else{
                    zhenya.fire();
                     System.out.println(zhenya.name+ " "+ zhenya.getSurname()+" "+ "can't be hired");
            }
            vanya.makeOlder();

                     System.out.println("Happy birthday,"+vanya.name+" "+vanya.getSurname());

              zhenya.makeOlder();
                     System.out.println("Happy birthday,"+vanya.name+" "+vanya.getSurname());
        }

}

