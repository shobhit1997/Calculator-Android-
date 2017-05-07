package com.example.shobhit.calculator;

/**
 * Created by Shobhit on 5/7/2017.
 */

public class IntStack {

        private double ar[];
        private int i,l;
        public IntStack(int s)
        {
            i=-1;
            l=s;
            ar=new double[l];
        }
        public void push(double ch)
        {
            if(i+1<l)
            {
                ar[++i]=ch;
            }

        }
        public double pop()
        {
            if(i>=0)
            {
                return ar[i--];
            }
            return 0;
        }
        public double peep()
        {
            if(i>=0)
            {
                return ar[i];
            }
            return 0;
        }
        public boolean isEmpty()
        {
            return i<0;
        }
    }

