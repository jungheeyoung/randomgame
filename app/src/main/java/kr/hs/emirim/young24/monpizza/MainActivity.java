package kr.hs.emirim.young24.monpizza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mName;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//객체 이어주는 것, 한번만 처리하는것
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText)findViewById(R.id.name);//id값을 가지고 객체를 찾아서 가져와줌,activity_main에서 찾아서 가져와줌/ mName이 EditText이므로 그에 맞게 타입캐스팅해준다. xml에 있는 EditText를 맘대로 가져올 수 o
        mButton = (Button) findViewById(R.id.btn_showmethepizza);
        mButton.setOnClickListener(this);
    }

    @Override
    protected void onResume() { //매번 처리해야 되는 것, 화면이 보여질 때마다
        super.onResume();
        mName.setText("");//text공간을 비우게 해줌
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        Toast.makeText(this,"배고파워!", Toast.LENGTH_LONG).show();//현재 문맥을 넘겨줌 , duration :기간
    }
}