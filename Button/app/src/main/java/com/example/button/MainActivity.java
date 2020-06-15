package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
//--------------------method-1-------------------------
////-->public class MainActivity extends AppCompatActivity {
//public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//
//
//    int c = 0, c1 = 0;
//    private Button Loginbutton, logoutbutton;
//    private TextView textView;
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Loginbutton = (Button) findViewById(R.id.loginButtonId);
//        logoutbutton = (Button) findViewById(R.id.logoutButtonId);
//        textView = (TextView) findViewById(R.id.textViewId);
//
//        Loginbutton.setOnClickListener(this);
//        logoutbutton.setOnClickListener(this);
//    }
////       -->first method button er jonno
////        Loginbutton.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                c++;
////                textView.setText("login button pressed "+c+" times");
////            }
////        });
////        logoutbutton.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                c1++;
////                textView.setText("logout button pressed "+c1+" times");
////            }
////        });
////
//
//    @Override
//    public void onClick(View v) {
//
//        if (v.getId() == R.id.loginButtonId) {
//            c++;
//            textView.setText("login button pressed " + c + " times");
//        }
//        if (v.getId() == R.id.logoutButtonId) {
//            c1++;
//            textView.setText("logout button pressed " + c1 + " times");
//        }
//    }
//}
//--------------------method-2 best jkn  onk gula button niye kaj kora hoi-------------------------
//public class MainActivity extends AppCompatActivity{
//
//
//    int c = 0, c1 = 0;
//    private Button Loginbutton, logoutbutton;
//    private TextView textView;
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Loginbutton = (Button) findViewById(R.id.loginButtonId);
//        logoutbutton = (Button) findViewById(R.id.logoutButtonId);
//        textView = (TextView) findViewById(R.id.textViewId);
//        handler press = new handler();
//        Loginbutton.setOnClickListener(press);
//        logoutbutton.setOnClickListener(press);
//    }
//class handler implements View.OnClickListener{
//
//    @Override
//    public void onClick(View v) {
//        if (v.getId() == R.id.loginButtonId) {
//            c++;
//            textView.setText("login button pressed " + c + " times");
//        }
//        if (v.getId() == R.id.logoutButtonId) {
//            c1++;
//            textView.setText("logout button pressed " + c1 + " times");
//        }
//    }
//}
//
//
//
//}//--------------------method-3-------------------------
//public class MainActivity extends AppCompatActivity{
//
//
//    int c = 0, c1 = 0;
//    private Button Loginbutton, logoutbutton;
//    private TextView textView;
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Loginbutton = (Button) findViewById(R.id.loginButtonId);
//        logoutbutton = (Button) findViewById(R.id.logoutButtonId);
//        textView = (TextView) findViewById(R.id.textViewId);
//
//    }
//
//    public void showMsg(View v){
//        if (v.getId() == R.id.loginButtonId) {
//            c++;
//            textView.setText("login button pressed " + c + " times");
//        }
//        if (v.getId() == R.id.logoutButtonId) {
//            c1++;
//            textView.setText("logout button pressed " + c1 + " times");
//        }
//    }
//
//
//}

//---------------------toast method-----------------



//public class MainActivity extends AppCompatActivity{
//
//    private Button Loginbutton, logoutbutton;
//    private TextView textView;
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Loginbutton = (Button) findViewById(R.id.loginButtonId);
//        logoutbutton = (Button) findViewById(R.id.logoutButtonId);
//        textView = (TextView) findViewById(R.id.textViewId);
//
//    }
//
//    public void showMsg(View v){
//        if (v.getId() == R.id.loginButtonId) {
//            Toast.makeText(MainActivity.this,"login button pressed ",Toast.LENGTH_SHORT).show();
//
//            //jodi amra msg tar position set korte chai then
////            Toast toast = Toast.makeText(MainActivity.this,"login Successfully",Toast.LENGTH_SHORT);
////            toast.setGravity(Gravity.BOTTOM,0,0);
////            toast.show();
//        }
//        if (v.getId() == R.id.logoutButtonId) {
//            Toast.makeText(MainActivity.this,"logout button pressed ",Toast.LENGTH_SHORT).show();
////            Toast toast = Toast.makeText(MainActivity.this,"logout Successfully",Toast.LENGTH_SHORT);
////            toast.setGravity(Gravity.BOTTOM,0,0);
////            toast.show();
//
//
//
//
//        }
//    }
//
//
//}
//----------------Debug------------
 public class MainActivity extends AppCompatActivity{

    private Button Loginbutton, logoutbutton;
    private TextView textView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Loginbutton = (Button) findViewById(R.id.loginButtonId);
        logoutbutton = (Button) findViewById(R.id.logoutButtonId);
        textView = (TextView) findViewById(R.id.textViewId);

    }

    public void showMsg(View v){
        if (v.getId() == R.id.loginButtonId) {
            Log.d("tag","Login button presssed");
        }
        if (v.getId() == R.id.logoutButtonId) {
            Log.d("tag","Logout button presssed");


        }
    }


}

