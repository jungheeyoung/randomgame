package kr.hs.emirim.young24.monpizza;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by appcreator05 on 2016. 3. 28..
 */
public class ResultActivity  extends AppCompatActivity {

    TextView mReult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mReult = (TextView)findViewById(R.id.result);
        mReult.setText("결과");

        Intent intent = getIntent();
        String name = intent.getStringExtra("name"); //null값이 들어가도 되는 것은 그냥 name만
        int age = intent.getIntExtra("age", -1); //null 값이 들어가면 안되므로 -1입력
        mReult.setText(name+"님, 안녕하세요!");
    }
}