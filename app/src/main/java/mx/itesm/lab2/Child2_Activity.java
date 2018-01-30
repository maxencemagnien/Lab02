package mx.itesm.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;


public class Child2_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child2_);




        Button buttonnBack= (Button) findViewById(R.id.button3);
        buttonnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intentC2 = new Intent(Child2_Activity.this, MainActivity.class);
                startActivity(intentC2);

            }

        });

    }
}
