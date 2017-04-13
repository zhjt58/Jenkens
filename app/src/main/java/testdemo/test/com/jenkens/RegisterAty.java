package testdemo.test.com.jenkens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2017/3/10.
 */

public class RegisterAty extends BaseAty{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    /**
     * 注册 成功
     * @param view
     */
    public void onRegisterMain(View view){
        startActivity(new Intent(this,MainActivity.class));
        this.finish();
    }
}
