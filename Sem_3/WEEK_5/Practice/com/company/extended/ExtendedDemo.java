// File: com/company/extended/ExtendedDemo.java
package com.company.extended;

import com.company.security.AccessModifierDemo;

public class ExtendedDemo extends AccessModifierDemo {
    public ExtendedDemo(int privateField, String defaultField,
                        double protectedField, boolean publicField) {
        super(privateField, defaultField, protectedField, publicField);
    }

    public void testInheritedAccess() {
        // privateField ❌ NOT inherited
        // defaultField ❌ NOT visible (different package)
        System.out.println(protectedField); // ✅ inherited & visible
        System.out.println(publicField);    // ✅ works everywhere

        // privateMethod(); ❌
        // defaultMethod(); ❌
        protectedMethod(); // ✅
        publicMethod();    // ✅
    }

    // Override protected method
    @Override
    protected void protectedMethod() {
        System.out.println("Overridden protected method called");
    }

    public static void main(String[] args) {
        ExtendedDemo child = new ExtendedDemo(5, "Child", 8.8, true);
        child.testInheritedAccess();

        AccessModifierDemo parent = new AccessModifierDemo(7, "Parent", 9.9, false);
        // parent.protectedField; ❌ (not subclass reference)
        System.out.println(parent.publicField); // ✅
    }
}
