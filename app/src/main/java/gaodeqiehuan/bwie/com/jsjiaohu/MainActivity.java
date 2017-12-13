package gaodeqiehuan.bwie.com.jsjiaohu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBt;
    private Button mBt2;
    private WebView mwv;
    private String url = "file:///android_asset/a.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initin();
        WebSettings settings = mwv.getSettings();
        settings.setJavaScriptEnabled(true);
        mwv.addJavascriptInterface(this,"hello");
        mwv.loadUrl(url);
    }

    private void initin() {
        mBt = (Button) findViewById(R.id.bt);
        mBt.setOnClickListener(this);
        mBt2 = (Button) findViewById(R.id.bt2);
        mwv = (WebView) findViewById(R.id.wv);
        mBt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            default:
                break;
            case R.id.bt:

                break;
            case R.id.bt2:
                mwv.loadUrl("javascript:show('123')");
                break;
        }

    }
}
