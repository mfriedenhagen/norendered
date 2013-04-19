package org.example.mavenjavadocinner.norendered;

/**
 * Hello world!
 *
 */
public class App {

    private void doInner() {
        new Inner().doPrivate();
    }

    private static class StaticInner {

        private void doPrivate() {
            System.out.println("Hello World from StaticInner!");
        }
        
    }
    
    private class Inner {

        private void doPrivate() {
            System.out.println("Hello World from Inner!");
        }
        
    }
    public static void main(String... args) {
        doPrivate();
        new StaticInner().doPrivate();
        new App().doInner();
        new PackageScope().doInner();
    }

    private static void doPrivate() {
        System.out.println("Hello World from main!");
    }
    
}
