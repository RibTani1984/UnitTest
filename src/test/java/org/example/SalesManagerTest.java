package org.example;

import org.junit.jupiter.api.*;

class SalesManagerTest {
    private SalesManager Manager;

    @BeforeEach
    void setUp() {
        Manager = new SalesManager(new int[]{100, 200, 300, 250, 150});

    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Тестирование закончено");
    }

    @DisplayName("Тест № 1")
    @Test
    void testMax() {
        Assertions.assertEquals(300, Manager.max());
        System.out.println("Тест №1 пройден: максимальное число найдено");

    }

    @DisplayName("Тест № 2")
    @Test
    void testMin() {
        Assertions.assertEquals(100, Manager.min());
        System.out.println("Тест №2 пройден: минимальное число найдено");
    }

    @DisplayName("Тест № 3")
    @Test
    void testAverage() {
        SalesManager Manager = new SalesManager(new int[]{100, 200, 300, 250, 150});
        Assertions.assertEquals(200, Manager.average());
        System.out.println("Тест №3 пройден: среднее число найдено");
    }

}
