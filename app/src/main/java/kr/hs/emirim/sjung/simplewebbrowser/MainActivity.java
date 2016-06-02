package kr.hs.emirim.sjung.simplewebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText editurl;
    Button butMove, butPrev;
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editurl=(EditText)findViewById(R.id.edit_url);
        butMove=(Button)findViewById(R.id.but_move);
        butPrev=(Button)findViewById(R.id.but_prev);
        web=(WebView)findViewById(R.id.web);
        butMove.setOnClickListener(this);

    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

    }
}
