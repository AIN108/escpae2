package com.example.escape2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Mypage extends AppCompatActivity {
    private final int GET_GALLERY_IMAGE = 200;
    private ImageView imageview;
    EditText editText;
    EditText editText2;
    EditText editText3;
    EditText editText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);
        Log.d("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        getdata();
        Log.d("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

        Button button=(Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        editText=findViewById(R.id.textView);
        editText2=findViewById(R.id.textView2);
        editText3=findViewById(R.id.textView3);
        editText4=findViewById(R.id.textView7);


    }// onCreate()..

    /*
    public void clickSetBt(View view) {    // Set버튼 클릭 시    SharedPreferences에 값 저장.
        if(editText.getText().toString().isEmpty()){ // 공백 또는 size=0이면
            Toast.makeText(this, "값을 입력해주세요.", Toast.LENGTH_SHORT).show();
        }
        else {
            SharedPreferences sharedPreferences= getSharedPreferences("test", MODE_PRIVATE);    // test 이름의 기본모드 설정
            SharedPreferences.Editor editor= sharedPreferences.edit(); //sharedPreferences를 제어할 editor를 선언
            editor.putString("inputText",editText.getText().toString()); // key,value 형식으로 저장
            editor.commit();    //최종 커밋. 커밋을 해야 저장이 된다.
            Toast.makeText(this, "저장되었습니다.", Toast.LENGTH_SHORT).show();

        }
    }// clickSetBt()..

    public void clickGetBt(View view) {     // Get버튼 클릭 시   SharedPreferences에 값 불러오기.
        SharedPreferences sharedPreferences= getSharedPreferences("test", MODE_PRIVATE);    // test 이름의 기본모드 설정, 만약 test key값이 있다면 해당 값을 불러옴.
        String inputText = sharedPreferences.getString("inputText","");
        textView.setText(inputText);    // TextView에 SharedPreferences에 저장되어있던 값 찍기.
        Toast.makeText(this, "불러오기 하였습니다..", Toast.LENGTH_SHORT).show();
    }// clickGetBt()..
*/


    public void getdata()
    {
        SharedPreferences sharedPreferences= getSharedPreferences("test", MODE_PRIVATE);    // test 이름의 기본모드 설정, 만약 test key값이 있다면 해당 값을 불러옴.


        String inputText = sharedPreferences.getString("name",""); // 이름
        Log.d("test : ", inputText);

        ((EditText)findViewById(R.id.textView)).setText(inputText);


    }
}// MainActivity class..

