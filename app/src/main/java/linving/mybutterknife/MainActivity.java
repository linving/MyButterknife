package linving.mybutterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import butterknife.Butterknife;
import butterknife.annotation.BindView;
import butterknife.annotation.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(id = R.id.tv_name)
    private TextView tv_name;

    long startTime, endTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startTime = System.currentTimeMillis();
        Butterknife.bind(this);
        endTime = System.currentTimeMillis();
        tv_name.setText(" Time =  "  +(endTime - startTime));
    }

    @OnClick(id = R.id.tv_name)
    private void onClick() {
        tv_name.setText(" onClick ");
    }

}
