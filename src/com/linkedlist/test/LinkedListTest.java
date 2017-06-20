package com.linkedlist.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.linkedlist.LinkedList;

public class LinkedListTest {
	LinkedList list;
	
	@Before
	public void setUp() {
		list = new LinkedList();
	}

	@Test
	public void testAdd() {
		assertEquals(list.size(), 0);
		list.add(1);
		assertEquals(list.size(), 1);
		for(int i=0; i<5; i++) {
			list.add(i);
		}
		assertEquals(list.size(), 6);
	}

	@Test
	public void testGet() {
		for(int i=0; i<5; i++) {
			list.add(i);
		}
		for(int i=0; i<5; i++) {
			assertEquals(list.get(i), i);
		}
	}
	
	@Test
	public void testGetFirst() {
		assertEquals(list.getFirst(), null);
		list.add(3);
		list.add(4);
		assertEquals(list.getFirst(), 3);
	}
	
	@Test
	public void testGetLast() {
		for(int i=0; i<5; i++) {
			list.add(i);
		}
		assertEquals(list.getLast(), 4);
	}
	
	@Test
	public void testRemove() {
		boolean result;
		for(int i=0; i<5; i++) {
			list.add(i + 5);
		}
		assertEquals(list.getFirst(), 5);
		result = list.remove(0);
		assertTrue(result);
		assertEquals(list.getFirst(), 6);
		assertEquals(list.size(), 4);
		result = list.remove(5);
		assertFalse(result);
		result = list.remove(2);
		assertTrue(result);
		assertEquals(list.get(2), 9);
		assertEquals(list.size(), 3);
	}

	@Test
	public void testToString() {
		list.add(1);
		list.add(3);
		list.add("hello");
		assertEquals(list.toString(), "[1, 3, hello]");
	}
	
}
