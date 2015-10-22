package ws.stefma.stefbinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ws.stefma.stefbinding.databinding.ActivityLoginBinding;
import ws.stefma.stefbinding.models.LoginModel;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding view = DataBindingUtil.setContentView(this, R.layout.activity_login);
        view.setLoginModel(new LoginModel());
    }
}
