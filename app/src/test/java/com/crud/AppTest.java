/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.crud;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        CRUDApp classUnderTest = new CRUDApp();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}