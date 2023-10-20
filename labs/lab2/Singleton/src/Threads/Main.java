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
public class Main {
    public static void main(String[] args) {
        // Get the Singleton instance
        ThreadSafeSingleton singleton1 = ThreadSafeSingleton.getInstance();
        
        // Get another instance, it should be the same as the first one
        ThreadSafeSingleton singleton2 = ThreadSafeSingleton.getInstance();
        
        // Check if both instances are the same
        if (singleton1 == singleton2) {
            System.out.println("singleton1 and singleton2 are the same instance. It's a Singleton!");
        } else {
            System.out.println("singleton1 and singleton2 are different instances. Something went wrong.");
        }
    }
}
