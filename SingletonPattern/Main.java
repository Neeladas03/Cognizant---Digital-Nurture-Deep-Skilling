public class Main{
    public static void main(String args[]){
        Logger logger1=Logger.getInstance();
        logger1.log("First logger");

        Logger logger2=Logger.getInstance();
        logger2.log("Second logger");


        System.out.println("logger1 hashcode: "+logger1.hashCode());
        System.out.println("logger2 hashcode: "+logger2.hashCode());

        if(logger1.hashCode()==logger2.hashCode()){
            System.out.println("Both loggers are same instances, verified using hashcodes");
        }
        else{
            System.out.println("Different instances,SingletonPattern failed");
        }
    } 
}