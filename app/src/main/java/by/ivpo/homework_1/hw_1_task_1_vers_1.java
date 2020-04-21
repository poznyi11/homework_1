package by.ivpo.homework_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class hw_1_task_1_vers_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw_1_task_1_vers_1);

        setNumber(100);

    }

    private void setNumber (int number){
        TextView textView = findViewById(R.id.textView);
        textView.setText(Integer.toString(number));
    }

    public void subNumber (View view){
        TextView textView = findViewById(R.id.textView);
        String textNumber = textView.getText().toString();
        int number = Integer.parseInt(textNumber);
        textView.setText(Integer.toString(number - 1));
    }

    public void addNumber (View view){
        TextView textView = findViewById(R.id.textView);
        String textNumber = textView.getText().toString();
        int number = Integer.parseInt(textNumber);
        textView.setText(Integer.toString(number + 1));
    }
}
