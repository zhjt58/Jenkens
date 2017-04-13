package testdemo.test.com.jenkens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2017/3/7.
 */

public class LoginAty extends BaseAty{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    /**
     * 登录成功
     * @param view
     */
    public void onLoginMain(View view){
        startActivity(new Intent(this,MainActivity.class));
        this.finish();
    }
}
