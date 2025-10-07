
package admin.example.btchuyenactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    TextView txtName, txtUsername, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        txtName = findViewById(R.id.textView);
        txtUsername = findViewById(R.id.textView2);
        txtPassword = findViewById(R.id.textView3);

        String username = getIntent().getStringExtra("username");
        String password = getIntent().getStringExtra("password");

        txtName.setText("Welcome, " + username);
        txtUsername.setText(username);
        txtPassword.setText(password);

        ImageButton btnSettings = findViewById(R.id.btnSettings);
        btnSettings.setOnClickListener(v -> {
            Intent intent = new Intent(Profile.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
