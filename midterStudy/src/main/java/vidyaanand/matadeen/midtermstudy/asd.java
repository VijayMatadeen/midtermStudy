package vidyaanand.matadeen.midtermstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class asd extends AppCompatActivity {

    RadioGroup g1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        g1 = (RadioGroup) findViewById(R.id.radioGroup1);
        b1 = (Button) findViewById(R.id.button1);

        g1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radio_one)
                {
                    Toast.makeText(asd.this,"ONE",Toast.LENGTH_SHORT).show();
                }
                if(checkedId == R.id.radio_two)
                {
                    Toast.makeText(asd.this,"TWO",Toast.LENGTH_SHORT).show();
                }
                if(checkedId == R.id.radio_three)
                {
                    Toast.makeText(asd.this,"THREE",Toast.LENGTH_SHORT).show();
                }

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(asd.this,"Button Clicked",Toast.LENGTH_SHORT).show();
                openMatadeen();
            }
        });
    }
    public void openMatadeen(){
        Intent intent = new Intent(this, Matadeen.class);
        startActivity(intent);
    }
}