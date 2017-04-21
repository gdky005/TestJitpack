package team.zhuoke.testjitpack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import team.zhuoke.jitpack.Contanst;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "内容： " + Contanst.name, Toast.LENGTH_SHORT).show();
    }
}
