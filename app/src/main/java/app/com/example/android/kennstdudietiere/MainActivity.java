package app.com.example.android.kennstdudietiere;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import static app.com.example.android.kennstdudietiere.R.drawable.redface;
import static app.com.example.android.kennstdudietiere.R.drawable.yellowface;
import static app.com.example.android.kennstdudietiere.R.id.answerTxt;
import static app.com.example.android.kennstdudietiere.R.id.img_middle;
import static app.com.example.android.kennstdudietiere.R.id.img_result;
import static app.com.example.android.kennstdudietiere.R.string.textStart;


public class MainActivity extends AppCompatActivity {

    String birdspin = "yellowface";
    String textYes;
    String textNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();

        ImageView imageView;

        imageView = (ImageView) findViewById(R.id.img_TopRight);
        imageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ImageView) findViewById(img_middle)).setImageResource(R.drawable.jay);
                birdspin = getString(R.string.jay);
                textYes = getString(R.string.textYes1);
                textNo = getString(R.string.textNo1);
            }
        });
        imageView = (ImageView) findViewById(R.id.img_TopLeft);
        imageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ImageView) findViewById(img_middle)).setImageResource(R.drawable.woodpecker);
                birdspin = getString(R.string.woodpecker);
                textYes = getString(R.string.textYes2);
                textNo = getString(R.string.textNo2);
            }
        });
        imageView = (ImageView) findViewById(R.id.img_TopMiddle);
        imageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ImageView) findViewById(img_middle)).setImageResource(R.drawable.chaffinch);
                birdspin = getString(R.string.chaffinch);
                textYes = getString(R.string.textYes3);
                textNo = getString(R.string.textNo3);
            }
        });
        imageView = (ImageView) findViewById(R.id.img_Left);
        imageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ImageView) findViewById(img_middle)).setImageResource(R.drawable.magpie);
                birdspin = getString(R.string.magpie);
                textYes = getString(R.string.textYes4);
                textNo = getString(R.string.textNo4);
            }
        });
        imageView = (ImageView) findViewById(R.id.img_Right);
        imageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ImageView) findViewById(img_middle)).setImageResource(R.drawable.bluetit);
                birdspin = getString(R.string.bluetit);
                textYes = getString(R.string.textYes5);
                textNo = getString(R.string.textNo5);
            }
        });
        imageView = (ImageView) findViewById(R.id.img_ButtonLeft);
        imageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ImageView) findViewById(img_middle)).setImageResource(R.drawable.pigeon);
                birdspin = getString(R.string.pigeon);
                textYes = getString(R.string.textYes6);
                textNo = getString(R.string.textNo6);
            }
        });
        imageView = (ImageView) findViewById(R.id.img_ButtonMiddle);
        imageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ImageView) findViewById(img_middle)).setImageResource(R.drawable.sparrow);
                birdspin = getString(R.string.sparrow);
                textYes = getString(R.string.textYes7);
                textNo = getString(R.string.textNo7);
            }
        });
        imageView = (ImageView) findViewById(R.id.img_ButtonRight);
        imageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ImageView) findViewById(img_middle)).setImageResource(R.drawable.blackbird);
                birdspin = getString(R.string.blackbird);
                textYes = getString(R.string.textYes8);
                textNo = getString(R.string.textNo8);
            }
        });
    }

    private Spinner birdList;
    private Button btnSubmit;

    // get the selected dropdown list value
    public void addListenerOnButton() {
        birdList = (Spinner) findViewById(R.id.list_of_birds);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                TextView textViewToChange = (TextView) findViewById(answerTxt);
                findViewById(img_result).setVisibility(View.INVISIBLE);

                if (birdspin.equals(String.valueOf(birdList.getSelectedItem()))) {
                    textViewToChange.setText(textYes);
                    findViewById(img_result).setBackgroundResource(yellowface);
                } else if (birdspin == "yellowface") {
                    textViewToChange.setText(textStart);
                    findViewById(img_result).setBackgroundResource(0);
                } else {
                    textViewToChange.setText(textNo);
                    findViewById(img_result).setBackgroundResource(redface);
                }

                findViewById(img_result).setVisibility(View.VISIBLE);
                findViewById(answerTxt).setVisibility(View.VISIBLE);
            }
        });
    }

    public void goToNextPage(View view) {
        birdspin = "yellowface";
        textNo = getString(R.string.textStart);
        ((ImageView) findViewById(img_middle)).setImageResource(R.drawable.yellowface);

        findViewById(img_result).setVisibility(View.INVISIBLE);
        findViewById(answerTxt).setVisibility(View.INVISIBLE);

    }
}
