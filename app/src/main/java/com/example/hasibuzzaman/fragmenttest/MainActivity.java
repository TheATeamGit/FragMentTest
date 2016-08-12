package com.example.hasibuzzaman.fragmenttest;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    FragmentManager fm;
    Fragment fg;
    FragmentTransaction ft,ft2,ft3;
    public final static String FRAGMENT_MAIN = "main";
    public final static String FRAGMENT_2 = "f2";
    public final static String FRAGMENT_3 = "f2";
    Fragment2 f2;Button changeBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        changeBtn = (Button) findViewById(R.id.changeBtn);
        ft= getFragmentManager().beginTransaction().add(R.id.buttonFG,new FragmentMain(),FRAGMENT_MAIN);
        ft.commit();

        ft2=getFragmentManager().beginTransaction().add(R.id.niche,new Fragment2(),FRAGMENT_2);
        ft2.commit();
        changeBtn.setOnClickListener(this);

    }


   public void action()
   {
       f2= (Fragment2) getFragmentManager().findFragmentById(R.id.niche);
       f2.post();
   }

    @Override
    public void onClick(View view) {
        ft3=getFragmentManager().beginTransaction();
        ft3.replace(R.id.niche,new Fragment3(),FRAGMENT_3).commit();
    }
}
