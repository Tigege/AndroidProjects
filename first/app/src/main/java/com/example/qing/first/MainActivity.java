package com.example.qing.first;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity{
    private Button button1,button2,button3,button4;
    private EditText editText;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new MyButtonListenrer1());

        button2=(Button)findViewById(R.id.button_2);
        button2.setOnClickListener(new MyButtonListenrer2());

        button3=(Button)findViewById(R.id.button_3);
        button3.setOnClickListener(new MyButtonListenrer3());

        editText=(EditText)findViewById(R.id.edit_text);

        imageView=(ImageView)findViewById(R.id.image_view);
        button4=(Button)findViewById(R.id.button_4);
        button4.setOnClickListener(new MyButtonListenrer4());
    }
    //通过意图打开浏览器，指定百度的页面
    private class MyButtonListenrer1 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
//          Toast.makeText(MainActivity.this,"使用内部类实现Button点击事件",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(Intent.ACTION_VIEW);
            Uri uri = Uri.parse("http://www.baidu.com");
            intent.setData(uri);
            startActivity(intent);
        }
    }
    //通过意图调用第二个活动
    private class MyButtonListenrer2 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent("MY_ACTION");
            startActivity(intent);
        }
    }
    //显示编辑栏上的信息
    private class MyButtonListenrer3 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String inputtext=editText.getText().toString();  //得到输入值
            Toast.makeText(MainActivity.this,inputtext,Toast.LENGTH_LONG).show();
        }
    }
    //更换图片
    private class MyButtonListenrer4 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
           imageView.setImageResource(R.drawable.img_2);
        }
    }




}
