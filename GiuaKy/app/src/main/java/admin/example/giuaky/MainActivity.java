package admin.example.giuaky;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtTitle,edtContent;
    Button btnViewNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTitle=findViewById(R.id.edtTitle);
        edtContent=findViewById(R.id.edtContent);
        btnViewNote=findViewById(R.id.btnViewNote);

        btnViewNote.setOnClickListener(v->{
            String title =edtTitle.getText().toString().trim();
            String content =edtContent.getText().toString().trim();

            Intent intent = new Intent(MainActivity.this, activity_note_detail.class);
            intent.putExtra("note_title",title);
            intent.putExtra("note_content",content);
            startActivity(intent);
        });
    }
}