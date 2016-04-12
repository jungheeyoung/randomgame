package kr.hs.emirim.young24.monpizza;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

public class SplashActivity extends ActionBarActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();//일정시간 지난 후 없어지는 것도 가능하지만 타이머도 만들 수 있다.
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);//activity 시작할 때 필요한 객체 / 현재 사용하는 문맥객체를 받을 수 있음
                startActivity(intent); // 시작! 자동 머신에서 자동으로 intent 생성
                overridePendingTransition(0,R.anim.zoom_exit);   //무시하다
                finish(); //현재 splash Acitvity를 마감해줌,끝
            }
        },3000); //~한 뒤에 ,3초 delay한 다음에 run method작동
    }
}