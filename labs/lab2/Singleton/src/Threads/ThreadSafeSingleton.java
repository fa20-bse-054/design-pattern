/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author fa20-bse-054
 */
public class ThreadSafeSingleton {
    // Private static variable to hold the single instance of the class
    private static ThreadSafeSingleton instance;
    
    // Private constructor to prevent instantiation from other classes
    private ThreadSafeSingleton() {
        // Initialization code, if needed
    }
    
    // Public static method to get the instance of the Singleton class
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    
    // Other methods and fields can be added here
}
