package testcase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.calculation.Calculation;

public class CalculationTest {
	private static Calculation cal;
	
@BeforeAll
public static void beforeAlltest() {
	cal = new Calculation();
	System.out.println("Before All");
}
@BeforeEach	
public void beforeEachTest()
{
	System.out.println("Before each test....");
}

@Test
public void Add() {
	assertEquals(14,cal.Addition(5, 9));
}

@ParameterizedTest
@ValueSource(strings= {"abba","racecar"})
public void palindrometest(String i) {
	assertTrue(cal.Palindrome(i));
}

@Test
public void arrayList() {
	List <String> li= new ArrayList<String>();
	li.add("A");
	li.add("K");
	li.add("S");
	li.add("H");
	li.add("A");
	li.add("Y");
	
	assertEquals(6,cal.sizeOflist(li));
}

@Test
public void arrayListZero() {
	List <String> li= new ArrayList<String>();
	li.add("A");
	li.add("K");
	li.add("S");
	li.add("H");
	li.add("A");
	li.add("Y");
	
	assertFalse(cal.isZero(li));
}

@AfterEach
public void afterEachTest()
{
	System.out.println("After each test....");
}

@AfterAll
public static void afterAllTests()
{
	System.out.println("Once After all tests....");	
}



}
