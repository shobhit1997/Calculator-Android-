package com.example.shobhit.calculator;

/**
 * Created by Shobhit on 5/7/2017.
 */

public class CharStack {
    private char ar[];
    private int i,l;
    public CharStack(int s)
    {
        i=-1;
        l=s;
        ar=new char[l];
    }
    public void push(char ch)
    {
        if(i+1<l)
        {
            ar[++i]=ch;
        }

    }
    public char pop()
    {
        if(i>=0)
        {
            return ar[i--];
        }
        return (char)0;
    }
    public char peep()
    {
        if(i>=0)
        {
            return ar[i];
        }
        return (char)0;
    }
    public boolean isEmpty()
    {
        return i<0;
    }
}
