package service;

public class HelloService {
    public static String sayHello(String name, int age, int id) {
        return "Hola!\n"
                + "Tu nombre es:" + name + "\n" 
                + "Tu edad es: " + age + "\n" 
                + "Tu ID es: " + id;
    }
}