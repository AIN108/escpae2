package com.example.escape2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registerpage extends AppCompatActivity {
    EditText name;
    EditText email;
    EditText password;
    EditText password2;
    EditText phone;
    EditText address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerpage);

        name = findViewById(R.id.textView14);
        email = findViewById(R.id.textView9);
        password = findViewById(R.id.textView10);
        password2 = findViewById(R.id.textView11);
        phone = findViewById(R.id.textView12);
        address = findViewById(R.id.textView13);


        Button button = (Button) findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"사용가능한 이메일입니다",Toast.LENGTH_LONG).show();
            }
        });

        Button btn6= (Button) findViewById(R.id.button10);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setdata();


                Intent intent = new Intent(registerpage.this, loginpage.class);
                startActivity(intent);
            }
        });
    }

    public void setdata()
    {
        //SharedPreferences sharedPreferences= getSharedPreferences("test", MODE_PRIVATE);    // test 이름의 기본모드 설정
        //SharedPreferences.Editor editor= sharedPreferences.edit(); //sharedPreferences를 제어할 editor를 선언

        SharedPreferences.Editor editor = getSharedPreferences("test", Context.MODE_PRIVATE).edit();

        editor.putString("name", name.getText().toString()); // key,value 형식으로 저장 이름
        editor.putString("email", email.getText().toString()); // key,value 형식으로 저장 이메일
        editor.putString("password",password.getText().toString()); // key,value 형식으로 저장 비밀번호
        editor.putString("password2",password2.getText().toString()); // key,value 형식으로 저장 비밀번호확인
        editor.putString("phone", phone.getText().toString()); // key,value 형식으로 저장 전화번호
        editor.putString("address", address.getText().toString()); // key,value 형식으로 저장 주소


        editor.commit();    //최종 커밋. 커밋을 해야 저장이 된다.
    }
}