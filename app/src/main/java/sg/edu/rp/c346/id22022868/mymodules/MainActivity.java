package sg.edu.rp.c346.id22022868.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC218;
    TextView tvC235;
    TextView tvC346;
    TextView tvC206;
    TextView tvC203;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC218 = findViewById(R.id.c218);
        tvC235 = findViewById(R.id.c235);
        tvC346 = findViewById(R.id.c346);
        tvC206 = findViewById(R.id.c206);
        tvC203 = findViewById(R.id.c203);

        //Module 1
        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "C218");
                startActivity(intent);

            }
        });

        //Module 2
        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "C235");
                startActivity(intent);

            }
        });

        //Module 3
        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "C346");
                startActivity(intent);

            }
        });

        //Module 4
        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "C206");
                startActivity(intent);

            }
        });

        //Module 5
        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "C203");
                startActivity(intent);

            }
        });







    }
}