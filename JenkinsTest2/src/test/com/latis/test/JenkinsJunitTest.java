package com.latis.test;

import static org.junit.Assert.*;

import com.latis.test.Count;

import org.junit.Test;

public class JenkinsJunitTest {
	@Test
	public void test() {
		int count = new Count().returnCount("abc");
		
		assertEquals(count, 3);
	}
	
	@Test
	public void test2() {
		int num = 1;		
		assertEquals(num, 1);
	}
	
	@Test
	public void test3() {
		int num = 1;		
		assertEquals(num, 1);
		
		
		
		
	}


}
