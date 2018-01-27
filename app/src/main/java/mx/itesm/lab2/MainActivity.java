package mx.itesm.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Button button_C1= (Button) findViewById(R.id.button);
        button_C1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent1 = new Intent(MainActivity.this, Child1_Activity.class);
            startActivity(intent1);

        }

    });

    Button button_C2= (Button) findViewById(R.id.button);
        button_C2.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent2 = new Intent(MainActivity.this, Child2_Activity.class);
            startActivity(intent2);

        }

    });



}
