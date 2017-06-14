package concrete.com.br.textviewautosizing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSizePlus = findViewById(R.id.btnSizePlus);
        btnSizePlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plus((TextView) findViewById(R.id.txtText));
                plus((TextView) findViewById(R.id.txtTextMM));
                plus((TextView) findViewById(R.id.txtTextS));
                plus((TextView) findViewById(R.id.txtTextA));
            }
        });

        Button btnSizeMinus = findViewById(R.id.btnSizeMinus);
        btnSizeMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                minus((TextView) findViewById(R.id.txtText));
                minus((TextView) findViewById(R.id.txtTextMM));
                minus((TextView) findViewById(R.id.txtTextS));
                minus((TextView) findViewById(R.id.txtTextA));
            }
        });
    }

    private void plus(TextView view) {
        view.setHeight(view.getHeight() + 50);
        view.setWidth(view.getWidth() + 50);
    }

    private void minus(TextView view) {
        view.setHeight(view.getHeight() - 50);
        view.setWidth(view.getWidth() - 50);
    }

}
