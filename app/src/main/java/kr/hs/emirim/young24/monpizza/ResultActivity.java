package kr.hs.emirim.young24.monpizza;

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
    }
}