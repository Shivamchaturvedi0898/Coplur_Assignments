<<<<<<< HEAD
interface Ilogger{
 void logtype(String message );

}
 class Databaselogger implements Ilogger{
   @Override
    public void logtype(String message){
        System.err.println("log writteen to database :" + message);

    }
 }


class Cloudlogger implements Ilogger{
@Override
    public void logtype( String message){
        System.out.println("log writteen to cloud :" + message);
    }
}


class Filelogger implements Ilogger{
    @Override
public void logtype(String message){
    System.out.println("log writteen to file :" + message);
}
}



class LoggerService {
    private Ilogger logger; // Dependency (ILogger)

   public LoggerService(Ilogger logger) {
       this.logger = logger;
   }

    public void logMessage(String message) {
        logger.logtype(message);
    }
}


public class test {
    public static void main(String[] args) {
        // Inject DatabaseLogger
        LoggerService dbLogger = new LoggerService(new Databaselogger());
        dbLogger.logMessage("User data saved");

        // Inject FileLogger
        LoggerService fileLogger = new LoggerService(new Filelogger());
        fileLogger.logMessage("Error log saved to file");

        // Inject CloudLogger
        LoggerService cloudLogger = new LoggerService(new Cloudlogger());
        cloudLogger.logMessage("System logs uploaded to cloud");
    }
}
=======
interface Ilogger{
 void logtype(String message );

}
 class Databaselogger implements Ilogger{
   @Override
    public void logtype(String message){
        System.err.println("log writteen to database :" + message);

    }
 }


class Cloudlogger implements Ilogger{
@Override
    public void logtype( String message){
        System.out.println("log writteen to cloud :" + message);
    }
}


class Filelogger implements Ilogger{
    @Override
public void logtype(String message){
    System.out.println("log writteen to file :" + message);
}
}



class LoggerService {
    private Ilogger logger; // Dependency (ILogger)

   public LoggerService(Ilogger logger) {
       this.logger = logger;
   }

    public void logMessage(String message) {
        logger.logtype(message);
    }
}


public class test {
    public static void main(String[] args) {
        // Inject DatabaseLogger
        LoggerService dbLogger = new LoggerService(new Databaselogger());
        dbLogger.logMessage("User data saved");

        // Inject FileLogger
        LoggerService fileLogger = new LoggerService(new Filelogger());
        fileLogger.logMessage("Error log saved to file");

        // Inject CloudLogger
        LoggerService cloudLogger = new LoggerService(new Cloudlogger());
        cloudLogger.logMessage("System logs uploaded to cloud");
    }
}
>>>>>>> f870a06e32902ecd9fbdbc9229e92bd76ee10758
