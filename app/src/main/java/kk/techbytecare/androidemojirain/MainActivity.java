package kk.techbytecare.androidemojirain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.luolc.emojirain.EmojiRainLayout;

public class MainActivity extends AppCompatActivity {

    private EmojiRainLayout mContainer;

    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContainer = findViewById(R.id.activity_main);
        btnStart = findViewById(R.id.btnStart);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContainer.addEmoji(R.drawable.emoji_1_3);
                mContainer.addEmoji(R.drawable.emoji_2_3);
                mContainer.addEmoji(R.drawable.emoji_3_3);
                mContainer.addEmoji(R.drawable.emoji_4_3);
                mContainer.addEmoji(R.drawable.emoji_5_3);

                mContainer.stopDropping();
                mContainer.setPer(10);
                mContainer.setDuration(7200);
                mContainer.setDropDuration(2400);
                mContainer.setDropFrequency(500);

                mContainer.startDropping();
            }
        });
    }
}
