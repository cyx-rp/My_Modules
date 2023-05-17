package sg.edu.rp.c346.id22022868.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView modCode;
    TextView modName;
    TextView acadYear;
    TextView year;
    TextView sem;
    TextView modCred;
    TextView venue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_programming);


        modCode = findViewById(R.id.moduleCode);
        modName = findViewById(R.id.moduleName);
        acadYear = findViewById(R.id.academicYear);
        year = findViewById(R.id.year);
        sem = findViewById(R.id.sem);
        modCred = findViewById(R.id.moduleCredit);
        venue = findViewById(R.id.venue);

        Intent intentReceived = getIntent();
        String moduleCode = intentReceived.getStringExtra("Module");

        if (moduleCode.equals("C218")) {

            modCode.setText(String.format("Module Code: %s",moduleCode));
            modName.setText("Module Name: UI/UX Design for Apps");
            acadYear.setText("Academic Year: 2023");
            year.setText("Year: 2");
            sem.setText("Semester: 1");
            modCred.setText("Module Credits: 4");
            venue.setText("Venue: W65C");

        }
        else if (moduleCode.equals("C235")){

            modCode.setText(String.format("Module Code: %s",moduleCode));
            modName.setText("Module Name: IT Security and Management");
            acadYear.setText("Academic Year: 2023");
            year.setText("Year: 2");
            sem.setText("Semester: 1");
            modCred.setText("Module Credits: 4");
            venue.setText("Venue: W65C");

        }
        else if (moduleCode.equals("C346")){

            modCode.setText(String.format("Module Code: %s",moduleCode));
            modName.setText("Module Name: Mobile App Development in Android");
            acadYear.setText("Academic Year: 2023");
            year.setText("Year: 2");
            sem.setText("Semester: 1");
            modCred.setText("Module Credits: 4");
            venue.setText("Venue: W65C");

        }
        else if (moduleCode.equals("C206")){

            modCode.setText(String.format("Module Code: %s",moduleCode));
            modName.setText("Module Name: Software Development Process");
            acadYear.setText("Academic Year: 2023");
            year.setText("Year: 2");
            sem.setText("Semester: 1");
            modCred.setText("Module Credits: 4");
            venue.setText("Venue: W65C");

        }
        else {

            modCode.setText(String.format("Module Code: %s",moduleCode));
            modName.setText("Module Name: Web App in Development in php");
            acadYear.setText("Academic Year: 2023");
            year.setText("Year: 2");
            sem.setText("Semester: 1");
            modCred.setText("Module Credits: 4");
            venue.setText("Venue: W65C");

        }




    }
}