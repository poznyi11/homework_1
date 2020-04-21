package by.ivpo.homework_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goVers1(View view){
        Intent intent = new Intent(this, hw_1_task_1_vers_1.class);
        startActivity(intent);
    }

    public void goVers2(View view){
        Intent intent = new Intent(this, HW_1_task_1_vers_2.class);
        startActivity(intent);
    }

    public void goVers3(View view){
        Intent intent = new Intent(this, HW_1_task_1_vers_3.class);
        startActivity(intent);
    }

    public void goVers4(View view){
        Intent intent = new Intent(this, HW_1_task_2_vers_1.class);
        startActivity(intent);
    }

}
