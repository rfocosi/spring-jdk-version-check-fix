package org.springframework.core;

public abstract class JdkVersion {
    private static final int BASE_VERSION = 13;

    public static final int JAVA_13 = 0;
    public static final int JAVA_14 = 1;
    public static final int JAVA_15 = 2;
    public static final int JAVA_16 = 3;
    public static final int JAVA_17 = 4;
    public static final int JAVA_18 = 5;
    public static final int JAVA_19 = 6;
    private static final String javaVersion;
    private static final int majorJavaVersion;

    public JdkVersion() {
    }

    public static String getJavaVersion() {
        return javaVersion;
    }

    public static int getJavaVersionNumber() {
        return Integer.parseInt(getJavaVersion().replaceAll(".*(\\d)\\.(\\d*)\\..+", "$1$2"));
    }

    public static int getMajorJavaVersion() {
        return majorJavaVersion;
    }

    public static boolean isAtLeastJava14() {
        return isAtLeast(1);
    }

    public static boolean isAtLeastJava15() {
        return isAtLeast(2);
    }

    public static boolean isAtLeastJava16() {
        return isAtLeast(3);
    }

    public static boolean isAtLeast(int majorJavaVersion) {
        return getMajorJavaVersion() >= majorJavaVersion;
    }

    static {
        javaVersion = System.getProperty("java.version");
        majorJavaVersion = getJavaVersionNumber() - BASE_VERSION;
    }
}
