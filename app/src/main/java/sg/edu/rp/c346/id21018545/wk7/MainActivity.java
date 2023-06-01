package sg.edu.rp.c346.id21018545.wk7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    TextView tv;
    //String[] fruits;
    ArrayList<String> fruits;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);

        //fruits = new String[3];
        //fruits[0] = "apple";
        //fruits[1] = "banana";
        //fruits[2] = "cherry";Co

        //String text = "Fruits\n====\n" + fruits[0] + "\n" +
        //        fruits[1] + "\n" + fruits[2];
        //tv.setText(text);

        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        String text = "Fruits\n====\n" + fruits.get(0) + "\n" +
                fruits.get(1) + "\n" + fruits.get(2);
        tv.setText(text);

    }
}