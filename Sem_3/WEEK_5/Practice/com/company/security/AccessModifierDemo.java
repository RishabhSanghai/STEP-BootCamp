// File: AccessModifierDemo.java
package com.company.security;

public class AccessModifierDemo {
    // Fields with different access levels
    private int privateField;          // accessible only in this class
    String defaultField;               // package-private
    protected double protectedField;   // package + subclasses
    public boolean publicField;        // everywhere

    // Constructor
    public AccessModifierDemo(int privateField, String defaultField,
                              double protectedField, boolean publicField) {
        this.privateField = privateField;
        this.defaultField = defaultField;
        this.protectedField = protectedField;
        this.publicField = publicField;
    }

    // Methods with different access levels
    private void privateMethod() {
        System.out.println("Private method called");
    }

    void defaultMethod() {
        System.out.println("Default method called");
    }

    protected void protectedMethod() {
        System.out.println("Protected method called");
    }

    public void publicMethod() {
        System.out.println("Public method called");
    }

    // Demonstrates internal access
    public void testInternalAccess() {
        // ✅ All fields accessible
        System.out.println("Private Field: " + privateField);
        System.out.println("Default Field: " + defaultField);
        System.out.println("Protected Field: " + protectedField);
        System.out.println("Public Field: " + publicField);

        // ✅ All methods accessible
        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }

    public static void main(String[] args) {
        AccessModifierDemo demo = new AccessModifierDemo(10, "Hello", 20.5, true);

        // Direct access:
        // demo.privateField;   ❌ ERROR (private)
        System.out.println(demo.defaultField);     // ✅ works (same package)
        System.out.println(demo.protectedField);   // ✅ works (same package)
        System.out.println(demo.publicField);      // ✅ works (public)

        // Method calls:
        // demo.privateMethod();   ❌ ERROR
        demo.defaultMethod();      // ✅
        demo.protectedMethod();    // ✅
        demo.publicMethod();       // ✅

        // Internal test
        demo.testInternalAccess(); // ✅ shows private is accessible inside class
    }
}

// Second class in SAME package
class SamePackageTest {
    public static void testAccess() {
        AccessModifierDemo demo = new AccessModifierDemo(1, "Hi", 2.2, false);

        // demo.privateField;   ❌ ERROR
        System.out.println(demo.defaultField);     // ✅ works (same package)
        System.out.println(demo.protectedField);   // ✅ works (same package)
        System.out.println(demo.publicField);      // ✅ works

        // demo.privateMethod();   ❌ ERROR
        demo.defaultMethod();      // ✅
        demo.protectedMethod();    // ✅
        demo.publicMethod();       // ✅
    }
}
