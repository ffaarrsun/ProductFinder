package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detailActivity extends AppCompatActivity {
 /*
    private TextView addtocartbtn;
    private TextView titletxt,feetxt,numberordertxt;
    private ImageView plusbtn,minusbtn,picfood;
    private FoodDomain object;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
/*
        initView();
        getBundle();
        */
    }
    /*
    private void getBundle(){
        object=(foodDomain)getIntent().getSerializableExtra("object");
        int drawablesourceid=this.getResources().getIdentifier(object.getPic(),"drawable",this.getPackageName());
        Glide.with(this)
                .load
    }

    private void initView(){
        addtocartbtn=findViewById(R.id.addtocartbtn);
        titletxt=findViewById(R.id.titletext);
        feetxt=findViewById(R.id.feetxt);
        numberordertxt=findViewById(R.id.numberordertxt);
        plusbtn=findViewById(R.id.plusbtn);
        minusbtn=findViewById(R.id.minusbtn);
        picfood=findViewById(R.id.picfood);

    }

  */
}