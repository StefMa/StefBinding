package ws.stefma.stefbinding.models;

import android.content.Intent;
import android.databinding.BindingAdapter;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import ws.stefma.stefbinding.RegisterActivity;
import ws.stefma.stefbinding.main.MainActivity;

@SuppressWarnings("unused")
public class LoginModel {

    private String log = "";
    private String pass = "";

    private String button = "Login";
    private String register = "Register";
    private String usernameHint = "Username";
    private String passwordHint = "Password";

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public String getUsernameHint() {
        return usernameHint;
    }

    public void setUsernameHint(String usernameHint) {
        this.usernameHint = usernameHint;
    }

    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }

    public void buttonClick(View view) {
        Intent intent = new Intent(view.getContext(), MainActivity.class);
        intent.putExtra(MainActivity.INTENT_KEY_USER, log);
        intent.putExtra(MainActivity.INTENT_KEY_PASSWORD, pass);
        view.getContext().startActivity(intent);
    }

    public void registerClick(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), RegisterActivity.class));
    }

    public TextWatcher passwordChange() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                pass = editable.toString();
            }
        };
    }

    public TextWatcher loginChange() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                log = editable.toString();
            }
        };
    }

    @BindingAdapter("defaultImage")
    public static void setLoadDefaultImage(ImageView imageView, String uri) {
        Glide.with(imageView.getContext()).load(uri).into(imageView);
    }

}
