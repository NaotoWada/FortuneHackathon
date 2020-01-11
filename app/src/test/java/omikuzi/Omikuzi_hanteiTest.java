package omikuzi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Omikuzi_hanteiTest {

    @Test
    void test_大吉() {
        assertEquals(new Omikuzi_hantei().hantei(0), "大吉");
        assertEquals(new Omikuzi_hantei().hantei(5), "大吉");
        assertEquals(new Omikuzi_hantei().hantei(9), "大吉");
    }

    @Test
    void test_中吉() {
        assertEquals(new Omikuzi_hantei().hantei(10), "中吉");
        assertEquals(new Omikuzi_hantei().hantei(20), "中吉");
        assertEquals(new Omikuzi_hantei().hantei(29), "中吉");
    }

    @Test
    void test_小吉() {
        assertEquals(new Omikuzi_hantei().hantei(30), "小吉");
        assertEquals(new Omikuzi_hantei().hantei(45), "小吉");
        assertEquals(new Omikuzi_hantei().hantei(59), "小吉");
    }

    @Test
    void test_吉() {
        assertEquals(new Omikuzi_hantei().hantei(60), "吉");
        assertEquals(new Omikuzi_hantei().hantei(70), "吉");
        assertEquals(new Omikuzi_hantei().hantei(89), "吉");
    }

    @Test
    void test_凶() {
        assertEquals(new Omikuzi_hantei().hantei(90), "凶");
        assertEquals(new Omikuzi_hantei().hantei(95), "凶");
        assertEquals(new Omikuzi_hantei().hantei(99), "凶");
    }
}
