package testdemo.test.com.jenkens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2017/3/10.
 */

public class StartMain extends BaseAty{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    /**
     * 登录
     * @param view
     */
    public void  onLogin(View view){
        startActivity(new Intent(StartMain.this,LoginAty.class));
        //this.finish();
    }

    /**
     * 注册
     * @param view
     */
    public void onRegister(View view){
        startActivity(new Intent(this,RegisterAty.class));
        //this.finish();
    }

}
