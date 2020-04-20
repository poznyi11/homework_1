package by.ivpo.homework_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class HW_1_task_2_vers_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw_1_task_2_vers_1);

    }

    public void goText (View view){

        EditText editText = findViewById(R.id.mainText);

        TextView textView = findViewById(R.id.newText);

        textView.setText(editText.getText());

    }
}
