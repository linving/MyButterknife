package linving.mybutterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Butterknife;
import butterknife.annotation.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(id = R.id.tv_name)
    private TextView tv_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Butterknife.bind(this);
        tv_name.setText(" hao ho ");
    }
}
