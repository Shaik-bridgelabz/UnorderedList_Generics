package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestUnorderedList {

    @Test
    public void givenInteger_WhenAdded_Should_Return_Size() throws UnorderedListException {
        UnorderedList unorderedList=new UnorderedList();
        unorderedList.add(1);
        unorderedList.add(2);
        Assert.assertEquals(2,unorderedList.size());
    }

    @Test
    public void givenString_WhenAdded_Should_Return_Size() throws UnorderedListException {
        UnorderedList unorderedList=new UnorderedList();
        unorderedList.add("Shaik");
        unorderedList.add("Mohammed");
        Assert.assertEquals(2,unorderedList.size());
    }

    @Test
    public void givenFloat_WhenAdded_Should_Return_Size() throws UnorderedListException {
        UnorderedList unorderedList=new UnorderedList();
        unorderedList.add(10.25f);
        unorderedList.add(65.77f);
        Assert.assertEquals(2,unorderedList.size());
    }

    @Test
    public void givenNullValue_WhenAdded_Should_Throw_NullException() {
        UnorderedList unorderedList=new UnorderedList();
        try {
            unorderedList.add(null);
        } catch (UnorderedListException e) {
            Assert.assertEquals(UnorderedListException.ExceptionType.ENTERED_NULL,e.type);
        }
    }

    @Test
    public void givenEmptyValue_WhenAdded_Should_Throw_EmptyException() {
        UnorderedList unorderedList=new UnorderedList();
        try {
            unorderedList.add("");
        } catch (UnorderedListException e) {
            Assert.assertEquals(UnorderedListException.ExceptionType.ENTERED_EMPTY,e.type);
        }
    }

    @Test
    public void givenInteger_WhenRemoved_Should_Return_Size() throws UnorderedListException {
        UnorderedList unorderedList=new UnorderedList();
        unorderedList.add(1);
        unorderedList.add(2);
        unorderedList.remove(1);
        Assert.assertEquals(1,unorderedList.size());
    }

    @Test
    public void givenString_WhenRemoved_Should_Return_Size() throws UnorderedListException {
        UnorderedList unorderedList=new UnorderedList();
        unorderedList.add("Shaik");
        unorderedList.add("Mohammed");
        unorderedList.remove("Shaik");
        Assert.assertEquals(1,unorderedList.size());
    }

    @Test
    public void givenFloat_WhenRemoved_Should_Return_Size() throws UnorderedListException {
        UnorderedList unorderedList=new UnorderedList();
        unorderedList.add((Float)10.25f);
        unorderedList.add((Float)65.77f);
        unorderedList.remove((Float)10.25f);
        Assert.assertEquals(1,unorderedList.size());
    }

    @Test
    public void givenNullValue_WhenRemoved_Should_Throw_NullException() {
        UnorderedList unorderedList=new UnorderedList();
        try {
            unorderedList.remove(null);
        } catch (UnorderedListException e) {
            Assert.assertEquals(UnorderedListException.ExceptionType.ENTERED_NULL,e.type);
        }
    }

    @Test
    public void givenEmptyValue_WhenRemoved_Should_Throw_EmptyException() {
        UnorderedList unorderedList=new UnorderedList();
        try {
            unorderedList.remove("");
        } catch (UnorderedListException e) {
            Assert.assertEquals(UnorderedListException.ExceptionType.ENTERED_EMPTY,e.type);
        }
    }
}