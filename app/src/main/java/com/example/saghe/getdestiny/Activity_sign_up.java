package com.example.saghe.getdestiny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Activity_sign_up extends AppCompatActivity {

    DBmanager mydb;
   // public String mytable;

   // EditText editfullname,editemail,editmbnumber,editcnic,editpassword;
    //Button signup;
    //RadioButton admin_rd,general_rd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        mydb=new DBmanager(this);

      /*  signup=findViewById(R.id.signup_button);

        editfullname=findViewById(R.id.name);
        editemail=findViewById(R.id.emaill);
        editmbnumber=findViewById(R.id.mb_number);
        editcnic=findViewById(R.id.cnic_number);
        editpassword=findViewById(R.id.password);

        admin_rd=(RadioButton)findViewById(R.id.admin);
        general_rd=(RadioButton)findViewById(R.id.general);

*/
      //  onClick_signup_button();
    }
/*
    public void onClick_signup_button()
    {
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean inserted=.insert_data(editfullname.getText().toString(),
                                                editemail.getText().toString(),
                                                editmbnumber.getText().toString(),
                                                editcnic.getText().toString(),
                                                editpassword.getText().toString());
               /* if (admin_rd.isChecked()==true){
                    mytable="admin_table";
                }
                else if (general_rd.isChecked()==true){
                    mytable="general_table";
                }
                else {
                    Toast.makeText(Activity_sign_up.this,"Please select sign up option!",Toast.LENGTH_LONG).show();
                }
*/
    /*            if(inserted==true)
                    Toast.makeText(Activity_sign_up.this,"Data is Inserted",Toast.LENGTH_LONG).show();
                else{
                    Toast.makeText(Activity_sign_up.this,"Data is not Inserted",Toast.LENGTH_LONG).show();
                }
            }
        });

    }

*/

}
