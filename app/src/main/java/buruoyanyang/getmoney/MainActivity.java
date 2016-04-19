package buruoyanyang.getmoney;

import android.os.Bundle;
import com.jaeger.library.StatusBarUtil;


public class MainActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StatusBarUtil.setTransparent(this);
    }
}
