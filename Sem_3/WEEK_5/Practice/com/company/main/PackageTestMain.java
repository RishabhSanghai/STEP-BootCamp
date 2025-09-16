// File: com/company/main/PackageTestMain.java
package com.company.main;

import com.company.security.AccessModifierDemo;

public class PackageTestMain {
    public static void main(String[] args) {
        AccessModifierDemo demo = new AccessModifierDemo(99, "Main", 55.5, true);

        // demo.privateField;   ❌ ERROR (private)
        // demo.defaultField;   ❌ ERROR (package-private, not visible here)
        // demo.protectedField; ❌ ERROR (not subclass, different package)
        System.out.println(demo.publicField); // ✅ works (public)

        // demo.privateMethod();   ❌
        // demo.defaultMethod();   ❌
        // demo.protectedMethod(); ❌
        demo.publicMethod();      // ✅ works
    }
}
