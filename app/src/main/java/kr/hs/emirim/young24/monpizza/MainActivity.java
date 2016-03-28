package kr.hs.emirim.young24.monpizza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {//객체 이어주는 것, 한번만 처리하는것
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText)findViewById(R.id.name);//id값을 가지고 객체를 찾아서 가져와줌,activity_main에서 찾아서 가져와줌/ mName이 EditText이므로 그에 맞게 타입캐스팅해준다. xml에 있는 EditText를 맘대로 가져올 수 o

    }

    @Override
    protected void onResume() { //매번 처리해야 되는 것
        super.onResume();
        mName.setText("");//text공간을 비우게 해줌
    }
}