package com.example.shobhit.calculator;


import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by Shobhit on 5/7/2017.
 */

public class Expression {
    public double expCal(String s) {

        StringTokenizer st1 = new StringTokenizer(s,"+*/-");
        StringTokenizer st = new StringTokenizer(s, "+*-/", true);
        if (st1.countTokens() == st.countTokens() - st1.countTokens() + 1) {
            CharStack op = new CharStack(st.countTokens() - st1.countTokens());
            IntStack n = new IntStack(st1.countTokens());
            String ope = "+/*-";
            System.out.println(st.countTokens());
            String ar[]=new String[st.countTokens()];
            int i=0;
            while(st.hasMoreTokens())
            {
                ar[i] = st.nextToken();

                i++;
            }



            for (int x = 0; x<ar.length; x++)
            {
                String t = ar[x];
                System.out.println(t);
                if (ope.indexOf(t) < 0) {
                    n.push(Double.parseDouble(t));
                }
                else
                {
                    char ch = t.charAt(0);
                    if (op.isEmpty())
                    {
                        op.push(ch);
                    }
                    else
                    {
                        char peep = (char) op.peep();
                        if (check(peep, ch))
                        {
                            op.push(ch);
                        }
                        else
                        {
                            char oper = (char) op.pop();
                            double n2 = (double) n.pop();
                            double n1 = (double) n.pop();
                            n.push(calc(n1, n2, oper));
                            x--;
                        }
                    }
                }
            }
            while (!op.isEmpty()) {
                char oper = (char) op.pop();
                double n2 = (double) n.pop();
                double n1 = (double) n.pop();

                n.push(calc(n1, n2, oper));
            }
            return (double) n.pop();
        }
        else
        {
            return -9999999;
        }
    }
    private double calc(double n1,double n2,char op)
    {
        switch(op)
        {
            case '+': return n1+n2;
            case '*': return n1*n2;
            case '-': return n1-n2;
            case '/': return n1/n2;

            default:return 0;
        }
    }
    private boolean check(char op1, char op2)
    {
        if((op2=='*'||op2=='/')&&(op1=='+'||op1=='-'))
        {
            return true;
        }
        return false;
    }
}
