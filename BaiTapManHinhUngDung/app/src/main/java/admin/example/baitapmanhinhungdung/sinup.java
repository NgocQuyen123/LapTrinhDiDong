package admin.example.baitapmanhinhungdung;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class sinup extends AppCompatActivity {

    EditText editEmail, editUsername, editPassword;
    ImageView eyeIcon;
    MaterialButton btnSignUp;
    boolean isPasswordVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinup);

        editEmail = findViewById(R.id.editTextText);
        editUsername = findViewById(R.id.editTextUserName1);
        editPassword = findViewById(R.id.editTextPassword1);
        btnSignUp = findViewById(R.id.button);
        Toast.makeText(this, "Nút Sign Up đã được nhấn", Toast.LENGTH_SHORT).show();
        btnSignUp.setOnClickListener(v -> {
            Toast.makeText(this, "Nút Sign Up đã được nhấn", Toast.LENGTH_SHORT).show();
            String email = editEmail.getText().toString().trim();
            String username = editUsername.getText().toString().trim();
            String password = editPassword.getText().toString().trim();

            if(email.isEmpty() || username.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                return;
            }

            SharedPreferences sharedPreferences = getSharedPreferences("MyUserPrefs", MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("email", email);
            editor.putString("username", username);
            editor.putString("password", password);
            editor.apply();

            Toast.makeText(this, "Đăng ký thành công!", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(sinup.this, MainActivity.class); // MainActivity là màn hình Login
            startActivity(intent);
            finish();
        });
    }
    public void goToLoginScreen(View view) {
        Intent intent = new Intent(sinup.this, MainActivity.class); // Chắc chắn rằng MainActivity là màn hình Login
        startActivity(intent);
        finish();
    }


}