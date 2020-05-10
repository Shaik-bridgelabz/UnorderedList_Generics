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

    @Test
    public void givenInteger_WhenSearched_Should_Return_True() throws UnorderedListException {
        UnorderedList unorderedList=new UnorderedList();
        unorderedList.add(1);
        unorderedList.add(2);
        boolean result=unorderedList.search(1);
        Assert.assertTrue(result);
    }

    @Test
    public void givenString_WhenSearched_Should_Return_True() throws UnorderedListException {
        UnorderedList unorderedList=new UnorderedList();
        unorderedList.add("Shaik");
        unorderedList.add("Mohammed");
        boolean result=unorderedList.search("Shaik");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFloat_WhenSearched_Should_Return_True() throws UnorderedListException {
        UnorderedList unorderedList=new UnorderedList();
        unorderedList.add((Float)10.25f);
        unorderedList.add((Float)65.77f);
        boolean result=unorderedList.search((Float)10.25f);
        Assert.assertTrue(result);
    }

    @Test
    public void givenNullValue_WhenSearched_Should_Throw_NullException() {
        UnorderedList unorderedList=new UnorderedList();
        try {
            unorderedList.remove(null);
        } catch (UnorderedListException e) {
            Assert.assertEquals(UnorderedListException.ExceptionType.ENTERED_NULL,e.type);
        }
    }

    @Test
    public void givenEmptyValue_WhenSearched_Should_Throw_EmptyException() {
        UnorderedList unorderedList=new UnorderedList();
        try {
            unorderedList.remove("");
        } catch (UnorderedListException e) {
            Assert.assertEquals(UnorderedListException.ExceptionType.ENTERED_EMPTY,e.type);
        }
    }

    @Test
    public void given_EmptyList_isEmpty_Should_returnTrue() {
        UnorderedList unorderedList=new UnorderedList();
        boolean result=unorderedList.isEmpty();
        Assert.assertTrue(result);
    }

    @Test
    public void given_Non_EmptyList_isEmpty_Should_returnFalse() throws UnorderedListException {
        UnorderedList unorderedList=new UnorderedList();
        unorderedList.add("Hello");
        unorderedList.add("Bridgelabz");
        boolean result=unorderedList.isEmpty();
        Assert.assertFalse(result);
    }

    @Test
    public void given_Non_EmptyList_Should_returnSize() throws UnorderedListException {
        UnorderedList unorderedList=new UnorderedList();
        unorderedList.add("Hello");
        unorderedList.add("Bridgelabz");
        unorderedList.add(25);
        int result=unorderedList.size();
        Assert.assertEquals(3,result);
    }

    @Test
    public void given_EmptyList_Should_returnSize_asZero() {
        UnorderedList unorderedList=new UnorderedList();
        int result=unorderedList.size();
        Assert.assertEquals(0,result);
    }

    @Test
    public void given_N_numberOfItems_shouldAppendToList() throws UnorderedListException {
        UnorderedList unorderedList=new UnorderedList();
        unorderedList.append("Hello","Shaik",1);
        Assert.assertEquals(3,unorderedList.size());
    }

    @Test
    public void givenNullValue_WhenAppended_should_throw_NullException() throws UnorderedListException {
        UnorderedList unorderedList=new UnorderedList();
        try {
            unorderedList.append(null);
        } catch (UnorderedListException e) {
            Assert.assertEquals(UnorderedListException.ExceptionType.ENTERED_NULL,e.type);
        }
    }

    @Test
    public void givenEmptyValue_WhenAppeded_Should_Throw_EmptyException() {
        UnorderedList unorderedList=new UnorderedList();
        try {
            unorderedList.append("");
        } catch (UnorderedListException e) {
            Assert.assertEquals(UnorderedListException.ExceptionType.ENTERED_EMPTY,e.type);
        }
    }

    @Test
    public void givenValue_Whenpassed_TosearchIndex_Should_Return_IndexValue() throws UnorderedListException {
        UnorderedList unorderedList=new UnorderedList();
        unorderedList.add("Hello");
        unorderedList.add("Shaik");
        Assert.assertEquals(1,unorderedList.index("Shaik"));
    }

    @Test
    public void givenNullValue_Whenpassed_TosearchIndex_should_throw_NullException() throws UnorderedListException {
        UnorderedList unorderedList=new UnorderedList();
        try {
            unorderedList.append(null);
        } catch (UnorderedListException e) {
            Assert.assertEquals(UnorderedListException.ExceptionType.ENTERED_NULL,e.type);
        }
    }

    @Test
    public void givenEmptyValue_Whenpassed_TosearchIndex_Should_Throw_EmptyException() {
        UnorderedList unorderedList=new UnorderedList();
        try {
            unorderedList.append("");
        } catch (UnorderedListException e) {
            Assert.assertEquals(UnorderedListException.ExceptionType.ENTERED_EMPTY,e.type);
        }
    }
}