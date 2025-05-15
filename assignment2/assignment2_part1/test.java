<<<<<<< HEAD
package assignment2_part1;
//base logger class
 class logger{
public  void log( String message){
    System.out.println("log");
}
}
//derived class
class Databaselogger extends logger{
    @Override
public void log ( String message){
    System.out.println("log written to database :"  + message);

}
}

class filelogger extends logger{
    @Override
    public void log(String message){
System.out.println("log written to filelogger :" + message);
    }
}

class cloudlogger extends logger{
    @Override
    public void log(String message){
    System.out.println("log written to cloudlogger :" + message);
    }
}



public class test{
    public static void main(String[] args) {
        logger dbl= new Databaselogger();
        logger fbl = new filelogger();
         logger cl = new cloudlogger();

        dbl.log("this is a database log");
        fbl.log("this is a file log");
         cl.log("this is a cloud log");
    }
=======
package assignment2_part1;
//base logger class
 class logger{
public  void log( String message){
    System.out.println("log");
}
}
//derived class
class Databaselogger extends logger{
    @Override
public void log ( String message){
    System.out.println("log written to database :"  + message);

}
}

class filelogger extends logger{
    @Override
    public void log(String message){
System.out.println("log written to filelogger :" + message);
    }
}

class cloudlogger extends logger{
    @Override
    public void log(String message){
    System.out.println("log written to cloudlogger :" + message);
    }
}



public class test{
    public static void main(String[] args) {
        logger dbl= new Databaselogger();
        logger fbl = new filelogger();
         logger cl = new cloudlogger();

        dbl.log("this is a database log");
        fbl.log("this is a file log");
         cl.log("this is a cloud log");
    }
>>>>>>> f870a06e32902ecd9fbdbc9229e92bd76ee10758
}