package org.springframework.core;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Jdk8VersionTest {

    @Before
    public void setup(){
        System.setProperty("java.version", "1.8.0_123");
    }

    @Test
    public void isAtLeastJava4() {
        assertTrue(JdkVersion.isAtLeastJava14());
    }

    @Test
    public void isAtLeastJava5() {
        assertTrue(JdkVersion.isAtLeastJava15());
    }

    @Test
    public void isAtLeastJava6() {
        assertTrue(JdkVersion.isAtLeastJava16());
    }

    @Test
    public void isAtLeastJava7() {
        assertTrue(JdkVersion.isAtLeast(JdkVersion.JAVA_17));
    }

    @Test
    public void isAtLeastJava8() {
        assertTrue(JdkVersion.isAtLeast(JdkVersion.JAVA_18));
    }

    @Test
    public void isAtLeastJava9() {
        assertFalse(JdkVersion.isAtLeast(JdkVersion.JAVA_19));
    }
}