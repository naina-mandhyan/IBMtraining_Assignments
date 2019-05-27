package com.project.junitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.project.service.PerformOperation;

@TestInstance(Lifecycle.PER_CLASS)
class junitTests {
	PerformOperation per;
	
	@BeforeEach
	void createObject() {
		per = new PerformOperation();
	}

	@ParameterizedTest
	@ValueSource(ints = {10001001,10001003,10001004})
	void checkAccNo(int acc) {
		boolean expected = true;
		assertEquals(expected, per.validateAccNo(acc), "account number should match");
		
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"123naina","naina","Naina"})
	void checkName(String name) {
		boolean expected = true;
		
		assertEquals(expected, per.validateUserName(name), "name should contain only letters");
		
	}
	
	@ParameterizedTest
	@ValueSource(ints = {50000,1000,3000})
	void checkWithdraw(int amt) {
		boolean expected = true;
		assertAll(
		()-> assertEquals(expected, per.validateAccBal(amt, 10001001), "avilable balance is low"),
		()-> assertEquals(expected, per.validateAccBal(amt, 10001010), "avilable balance is low"),
		()-> assertEquals(expected, per.validateAccBal(amt, 10001008), "avilable balance is low")
		);
	}
	
	@ParameterizedTest
	@ValueSource(longs = {98399,2118456789})
	void checkMobNo(long mob) {
		String expected = "pass";
		assertEquals(expected, per.validateMobNo(mob), "Mob no should contain numbers only and have 10 digits");
		
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1000,2000,3000,4000})
	void checkMinDepositBal(int bal) {
		assertEquals(true, per.validateMinDeposit(bal),"min deposit balance should be 3000 or moress");
	}
	

}
