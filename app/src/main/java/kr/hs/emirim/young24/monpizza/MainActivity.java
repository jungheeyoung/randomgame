package kr.hs.emirim.young24.monpizza;

import android.content.Intent;
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
        mButton.setOnClickListener(this); //이벤트 핸들러 클래스(객체)가 들어가는 자리, 현재 메인이 이벤트 핸들러로 구현되어 있어 this로 사용 가능
    }

    @Override
    protected void onResume() { //매번 처리해야 되는 것, 화면이 보여질 때마다
        super.onResume();
        mName.setText(null);//text 공간을 비우게 해줌

    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        String name = mName.getText().toString(); //return type : editable / editable에서 입력받은 값을 toString 으로 변환시켜줘야된다.
//        if(name==null){
//            Toast.makeText(this,"이름을 입력해주세요!", Toast.LENGTH_LONG).show();//현재 문맥을 넘겨줌 , duration :기간/ name에 아무것도 넣지 않으면 nullpointexception발생,출력 전에 확인해주어야 함
//        }
//        else{
//            Toast.makeText(this,name+"씨, 배고파요!", Toast.LENGTH_LONG).show();//현재 문맥을 넘겨줌 , duration :기간/ name에 아무것도 넣지 않으면 nullpointexception발생,출력 전에 확인해주어야 함
//            Intent intent = new Intent(this, ResultActivity.class);//객체 생성, 전화번호 호출이나 웹페이지 기능에 유용, context : 문맥(이미지 요청, 현재 상태 등 유용함)
//            startActivity(intent);
//        }
        try{ //공 날라오는 것이라고 생각하면 됨, 이 안에서 예외가 생기면 catch로 넘어감, 예외가 없으면 마무리
            Toast.makeText(this,name+"씨, 배고파요!", Toast.LENGTH_LONG).show();//현재 문맥을 넘겨줌 , duration :기간/ name에 아무것도 넣지 않으면 nullpointexception발생,출력 전에 확인해주어야 함
            Intent intent = new Intent(this, ResultActivity.class);//객체 생성, 전화번호 호출이나 웹페이지 기능에 유용, context : 문맥(이미지 요청, 현재 상태 등 유용함)
            intent.putExtra("name",name); //name을 넘겨주고, 값을 넘겨줌 / extra:추가
            intent.putExtra("age", 10); //원하는 만큼 데이터를 넘겨줄 수 있다. 2번째 activity에 넘겨줄 수 0, 그러나 이미지나 큰 데이터는 옮길 수 없다.
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left); //들어올 때는 오른쪽으로 슬라이드, 나갈 때는 왼쪽으로
        }catch(NullPointerException e){//null이 있으면 이것을 실행된다.
            Toast.makeText(this,"이름을 입력해주세요!", Toast.LENGTH_LONG).show();//현재 문맥을 넘겨줌 , duration :기간/ name에 아무것도 넣지 않으면 nullpointexception발생,출력 전에 확인해주어야 함
        }catch (Exception e){//모든 예외의 어머니, 나머지 에러는 여기서 처리
            Toast.makeText(this,"뭔지는 모르겠지만 잘 안되네요ㅜ_ㅜ", Toast.LENGTH_LONG).show();//현재 문맥을 넘겨줌 , duration :기간/ name에 아무것도 넣지 않으면 nullpointexception발생,출력 전에 확인해주어야 함
        }
    }
}