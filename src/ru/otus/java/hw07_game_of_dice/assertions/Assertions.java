package ru.otus.java.hw07_game_of_dice.assertions;

public class Assertions {
    public static void assertEqualsLessOne(int expected, int actual) {
        if (actual < expected) {
            throw new AssertionError("На кубике выпало значение меньше 1, выпало: " + actual);
        }
    }

    public static void assertEqualsMoreSix(int expected, int actual) {
        if (actual > expected) {
            throw new AssertionError("На кубике выпало значение больше 6, выпало: " + actual);
        }
    }

//    public static void assertEquals(long expected, long actual) {
//        if (expected != actual) {
//            throw new AssertionError(String.format("Expected %d = %d", expected, actual));
//        }
//    }
//
//    public static void assertEquals(String expected, String actual) {
//        if (!expected.equals(actual)) {
//            throw new AssertionError(String.format("Expected \"%s\" = \"%s\"", expected, actual));
//        }
//    }
//
//    public static void assertEquals(Class<? extends Throwable> expected, Class<? extends Throwable> actual) {
//        if (!expected.equals(actual)) {
//            throw new AssertionError(String.format("Expected \"%s\" = \"%s\"", expected, actual));
//        }
//    }
//
//    public static void assertThrows(Class<? extends Throwable> expected, Runnable code) {
//        Throwable actual = null;
//        try {
//            code.run();
//        } catch (Throwable e) {
//            actual = e;
//        }
//        if (actual == null) {
//            throw new AssertionError("Given code does not throw any exception");
//        }
//
//        if (!actual.getClass().equals(expected)) {
//            throw new AssertionError(String.format("Expected \"%s\" = \"%s\"", expected.getSimpleName(), actual.getClass().getSimpleName()));
//        }
//    }
}