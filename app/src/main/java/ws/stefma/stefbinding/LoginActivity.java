package ws.stefma.stefbinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.backends.pipeline.Fresco;

import ws.stefma.stefbinding.databinding.ActivityLoginBinding;
import ws.stefma.stefbinding.models.LoginModel;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        ActivityLoginBinding view = DataBindingUtil.setContentView(this, R.layout.activity_login);
        view.setLoginModel(new LoginModel());
    }
}
