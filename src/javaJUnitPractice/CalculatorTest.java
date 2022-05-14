package javaJUnitPractice;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void multiplyで5と10の乗算結果を取得できる() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.multiply(5, 10), 50);
	}
	
	@Test
	void multiplyで0と1の乗算結果を取得できる() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.multiply(0, 1), 0);
	}
	
	@Test
	void divideで3と2の除算結果を取得できる() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.divide(3, 2), 1.5, 0);
	}
	
	@Test
	void divideで10と0ののときIllegalArgumentExceptionを送出する() {
		Calculator calculator = new Calculator();
		assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
	}

}
