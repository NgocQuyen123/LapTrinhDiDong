package admin.example.baitapmanhinhungdung;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editUsername, editPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editUsername = findViewById(R.id.editTextText);
        editPassword = findViewById(R.id.editTextText2);
    }

    public void login(View view) {
        String usernameInput = editUsername.getText().toString().trim();
        String passwordInput = editPassword.getText().toString().trim();

        if(usernameInput.isEmpty() || passwordInput.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
            return;
        }

        SharedPreferences sharedPreferences = getSharedPreferences("MyUserPrefs", MODE_PRIVATE);
        String savedUsername = sharedPreferences.getString("username", "");
        String savedPassword = sharedPreferences.getString("password", "");

        if(usernameInput.equals(savedUsername) && passwordInput.equals(savedPassword)) {
            Toast.makeText(this, "Đăng nhập thành công!", Toast.LENGTH_SHORT).show();
            // Nếu muốn chuyển màn hình sang một Activity khác sau khi đăng nhập, dùng Intent ở đây
        } else {
            Toast.makeText(this, "Tên đăng nhập hoặc mật khẩu không đúng", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToSignUpScreen(View view) {
        Intent intent = new Intent(MainActivity.this, sinup.class);
        startActivity(intent);
        finish();
    }
}
