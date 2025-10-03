package mx.edu.tesoem.isc.tsdmh_252_7s21_haeap1e3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PrincipalActivity extends AppCompatActivity {

    Button btnp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnp2 = findViewById(R.id.btnpntalla2);

        btnp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p2 = new Intent(PrincipalActivity.this,P2Activity.class);
                startActivity(p2);
            }
        });

    }

    public void lanzap3(View v){

        Intent intent = new Intent(this, P3Activity.class);
        startActivity(intent);

    }

}