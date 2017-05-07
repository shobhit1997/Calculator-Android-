package com.example.shobhit.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class calci extends AppCompatActivity {
    String exp="";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calci);
    }
    public void setExp()
    {
        TextView expression= (TextView) findViewById(R.id.Expression);
        expression.setText(exp);
    }
    public void setAns(double res)
    {
        TextView expression= (TextView) findViewById(R.id.Ans_TV);
        expression.setText(""+res);
    }
    public void Add(View view)
    {
        exp=exp+"+";
        setExp();

    }
    public void Substract(View view)
    {
        exp=exp+"-";
        setExp();
    }
    public void Multiply(View view)
    {
        exp=exp+"*";
        setExp();
    }
    public void Divide(View view)
    {
        exp=exp+"/";setExp();
    }
    public void Numpad(View view)
    {
        int id=view.getId();
        switch(id)
        {
            case R.id.k0:exp=exp+"0";break;
            case R.id.k1:exp=exp+"1";break;
            case R.id.k2:exp=exp+"2";break;
            case R.id.k3:exp=exp+"3";break;
            case R.id.k4:exp=exp+"4";break;
            case R.id.k5:exp=exp+"5";break;
            case R.id.k6:exp=exp+"6";break;
            case R.id.k7:exp=exp+"7";break;
            case R.id.k8:exp=exp+"8";break;
            case R.id.k9:exp=exp+"9";break;
            case R.id.dot:exp=exp+".";break;
        }
        setExp();


    }
    public void AC(View view)
    {
        exp="0";
        setExp();
        setAns(0);
    }
    public void Delete(View view)
    {
        exp=exp.substring(0,exp.length()-1);
        setExp();
    }
    public void Answer(View view)
    {
        TextView an= (TextView) findViewById(R.id.Ans_TV);

        exp=(String) an.getText();
        setExp();
    }
    public void Equals(View view)
    {
        Expression ob=new Expression();
        double result =ob.expCal(exp);
        setAns(result);
    }


}
