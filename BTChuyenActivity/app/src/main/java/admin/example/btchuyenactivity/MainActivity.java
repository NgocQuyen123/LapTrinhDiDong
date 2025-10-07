package admin.example.btchuyenactivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextUser, editTextPass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUser = findViewById(R.id.editTextText);
        editTextPass = findViewById(R.id.editTextTextPassword);
        btnLogin = findViewById(R.id.button);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUser.getText().toString();
                String password = editTextPass.getText().toString();

                Intent intent = new Intent(MainActivity.this, Profile.class);

                intent.putExtra("username", username);
                intent.putExtra("password", password);

                startActivity(intent);
            }
        });
    }
}