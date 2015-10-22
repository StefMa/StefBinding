package ws.stefma.stefbinding.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import ws.stefma.stefbinding.R;
import ws.stefma.stefbinding.databinding.ActivityMainBinding;
import ws.stefma.stefbinding.main.models.MainModel;

public class MainActivity extends AppCompatActivity {

    public static final String INTENT_KEY_USER = "user";
    public static final String INTENT_KEY_PASSWORD = "pass";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding view = DataBindingUtil.setContentView(this, R.layout.activity_main);
        view.setMainModel(new MainModel(getIntentKeyUser(), getIntentKeyPassword()));

        getSupportFragmentManager().beginTransaction().add(view.container.getId(), new MainFragment()).commit();
    }

    private String getIntentKeyUser() {
        return "Username: " + getIntent().getStringExtra(INTENT_KEY_USER);
    }

    private String getIntentKeyPassword() {
        return "Password: " + getIntent().getStringExtra(INTENT_KEY_PASSWORD);
    }
}
