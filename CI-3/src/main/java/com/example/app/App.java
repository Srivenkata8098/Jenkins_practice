/*
package com.example.app;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, CI/CD World!");
    }
}
*/

package com.example.app;

public class App {
    private App() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        System.out.println("Hello, CI/CD World!");
    }
}

