package ws.stefma.stefbinding.models;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

@SuppressWarnings("unused")
public class RegisterModel {

    private String username = "";
    private String password = "";
    private String mail = "";

    private String button = "Register";
    private String usernameHint = "Username";
    private String passwordHint = "Password";
    private String mailHint = "Mail";

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
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

    public String getMailHint() {
        return mailHint;
    }

    public void setMailHint(String mailHint) {
        this.mailHint = mailHint;
    }

    public void registerClick(final View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext())
                .setTitle("Want register:")
                .setMessage(getMessageText())
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(view.getContext(), "Register Clicked, register user...", Toast.LENGTH_LONG).show();
                        Activity activity = (Activity) view.getContext();
                        activity.finish();
                    }
                })
                .setNegativeButton("No", null);
        builder.create().show();

    }

    @NonNull
    private String getMessageText() {
        return "Username: " + username + "\n" +
                "Password: " + password + "\n" +
                "Mail: " + mail;
    }

    public TextWatcher usernameChanged() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                username = editable.toString();
            }
        };
    }

    public TextWatcher passwordChanged() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                password = editable.toString();
            }
        };
    }

    public TextWatcher mailChanged() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                mail = editable.toString();
            }
        };
    }
}
