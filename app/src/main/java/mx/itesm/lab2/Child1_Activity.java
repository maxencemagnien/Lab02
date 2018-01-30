package mx.itesm.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class Child1_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child1_);



        Button buttonBack= (Button) findViewById(R.id.button4);
        buttonBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intentC1 = new Intent(Child1_Activity.this, MainActivity.class);
                startActivity(intentC1);

            }

        });
    }
}
