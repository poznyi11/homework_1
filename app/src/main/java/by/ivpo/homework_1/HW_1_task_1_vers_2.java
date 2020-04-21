package by.ivpo.homework_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HW_1_task_1_vers_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw_1_task_1_vers_2);

        setNumber(200);

        Button subButton = (Button) findViewById(R.id.subButton);
        Button addButton = (Button) findViewById(R.id.addButton);

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = findViewById(R.id.textView);
                String textNumber = textView.getText().toString();
                int number = Integer.parseInt(textNumber);
                textView.setText(Integer.toString(number - 1));
            }
        });


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = findViewById(R.id.textView);
                String textNumber = textView.getText().toString();
                int number = Integer.parseInt(textNumber);
                textView.setText(Integer.toString(number + 1));
            }
        });

    }


    private void setNumber (int number){
        TextView textView = findViewById(R.id.textView);
        textView.setText(Integer.toString(number));
    }
}
