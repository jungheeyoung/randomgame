package kr.hs.emirim.young24.monpizza;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by appcreator05 on 2016. 3. 28..
 */
public class ResultActivity extends AppCompatActivity {

    static String TAG = "먼피자:ResultActivity";

    TextView mReult;
    ImageView mImageView;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Log.d(TAG, "결과 액티비티 시작!");

        mReult = (TextView) findViewById(R.id.result);
        mImageView = (ImageView)findViewById(R.id.imageView); //image
        //mReult.setText("결과");
        Log.d(TAG, "텍스트 뷰 연결 성공!");

        Random r = new Random();
        int result = r.nextInt(3);//그림갯수
        Log.d(TAG, "랜덤값 생성! : " + result);
        /*if (result == 0){
            mImageView.setImageResource(R.drawable.pizza);
        }
        else if (result == 1){
            mImageView.setImageResource(R.drawable.pizza2);
        }
        else if (result == 2){
            mImageView.setImageResource(R.drawable.chicken);
        }
        switch(result){
            case 0:
                mImageView.setImageResource(R.drawable.pizza);break;
            case 1:
                mImageView.setImageResource(R.drawable.pizza2);break;
            case 2:
                mImageView.setImageResource(R.drawable.chicken);break;
        }*/
        mImageView.setImageResource(R.drawable.chicken+result); //자바의 패키지 파일에 들어가보면 순서에 따라 1씩 차이가 난다 그러므로 result를 더해주면 랜덤의 값에 따라 달라

        Intent intent = getIntent();
        String name = intent.getStringExtra("name"); //null값이 들어가도 되는 것은 그냥 name만
        Log.d(TAG, "인텐트 값 읽기<name> : " + name);

        int age = intent.getIntExtra("age", -1); //null 값이 들어가면 안되므로 -1입력, getStringExtra("age"); => null값나옴
        Log.d(TAG, "인텐트 값 읽기<age> : " + age);

        mReult.setText(name + "님, 안녕하세요!");

    }
}