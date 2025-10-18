package admin.example.giuaky;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity_note_detail extends AppCompatActivity {
    private TextView  tvNoteTitle,tvNoteContent,tvCalculation;
    private Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_detail);

        tvNoteTitle=findViewById(R.id.tvNoteTitle);
        tvNoteContent=findViewById(R.id.tvNoteContent);
        tvCalculation=findViewById(R.id.tvCalculation);
        btnBack=findViewById(R.id.btnBack);

        Intent intent = getIntent();
        String title =intent.getStringExtra("note_title");
        String content =intent.getStringExtra("note_content");

        tvNoteTitle.setText(title);
        tvNoteContent.setText(content);

        int totalChars =(title!= null?title.length():0)+(content!=null?content.length():0);
        int wordCount = 0;
        if(content!=null && !content.trim().isEmpty()){
            wordCount=content.trim().split("\\s+").length;
        }

        String calcText ="tổng ký tự : "+totalChars+"|số từ trong nội dung: "+wordCount;
        tvCalculation.setText(calcText);
        btnBack.setOnClickListener(v->finish());
    }
}