package nikhil.assignment.main;

import nikhil.assignment.data.DefaultInitializationAssignment;
import nikhil.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        DefaultInitializationAssignment obj1=new DefaultInitializationAssignment();

        obj1.printVariables();
        //obj1.printLocal();

        Singleton singleton=new Singleton();
        Singleton returnedObj=singleton.initialize("nikhil");
        returnedObj.printString();
    }
}
