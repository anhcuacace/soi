package com.tunanh.lsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.tunanh.lsi.model.Verify_first_model;

public class verify_first extends AppCompatActivity {
    private CheckBox age_term,check_term;
    private boolean age_term_check,check_term_check;
    private TextView feedBack,confirm;
    Verify_first_model verify_first_model= new Verify_first_model();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_first);
        anhxa();
        Check();
        if(Check(check_term_check,age_term_check)){
            confirm.findViewById(R.id.tx_first_confirm);
            confirm.setTextColor(getResources().getColor(R.color.pink));
            confirm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent= new Intent(verify_first.this,HomeActivity.class);
                    startActivity(intent);
                }
            });
        }

    }
    boolean Check(boolean b,boolean a){
        if (a&b==true){
            return true;
        }
        else return false;
    }
    private void Check(){
        age_term.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    verify_first_model.setAge(true);
                    age_term_check=true;
                }

            }
        });
        check_term.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    verify_first_model.setAge(true);
                    check_term_check=true;
                }

            }
        });

    }


    private void anhxa(){
        age_term= (CheckBox) findViewById(R.id.checkBox_age);
        check_term=(CheckBox) findViewById(R.id.checkBox_term);
        feedBack=(TextView) findViewById(R.id.tx_feedback);

    }
}