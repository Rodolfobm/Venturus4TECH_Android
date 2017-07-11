package br.org.venturus.venturus4tech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChatActivity extends AppCompatActivity {

    private TextView mNickName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        String name = getIntent().getStringExtra("nickname");
        mNickName = (TextView) findViewById(R.id.chat_nickname);
        mNickName.setText(name);
    }
}
