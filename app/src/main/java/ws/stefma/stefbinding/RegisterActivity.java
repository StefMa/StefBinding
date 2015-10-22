package ws.stefma.stefbinding;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ws.stefma.stefbinding.databinding.ActivityRegisterBinding;
import ws.stefma.stefbinding.models.RegisterModel;

public class RegisterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRegisterBinding view = DataBindingUtil.setContentView(this, R.layout.activity_register);
        view.setRegisterModel(new RegisterModel());
    }
}
