package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestUnorderedList {

    @Test
    public void givenInteger_WhenAdded_Should_Return_Size() {
        UnorderedList unorderedList=new UnorderedList();
        unorderedList.add(1);
        unorderedList.add(2);
        Assert.assertEquals(2,unorderedList.size());
    }

    @Test
    public void givenString_WhenAdded_Should_Return_Size() {
        UnorderedList unorderedList=new UnorderedList();
        unorderedList.add("Shaik");
        unorderedList.add("Mohammed");
        Assert.assertEquals(2,unorderedList.size());
    }

    @Test
    public void givenFloat_WhenAdded_Should_Return_Size() {
        UnorderedList unorderedList=new UnorderedList();
        unorderedList.add(10.25f);
        unorderedList.add(65.77f);
        Assert.assertEquals(2,unorderedList.size());
    }

}

