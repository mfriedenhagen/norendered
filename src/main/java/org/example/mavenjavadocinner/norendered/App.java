package org.example.mavenjavadocinner.norendered;

/**
 * Hello world!
 *
 */
public class App {

    private static class StaticInner {

        private void doPrivate() {
            System.out.println("Hello World from StaticInner!");
        }
        
    }
    public static void main(String... args) {
        doPrivate();
        new StaticInner().doPrivate();
    }

    private static void doPrivate() {
        System.out.println("Hello World from main!");
    }
    
}
