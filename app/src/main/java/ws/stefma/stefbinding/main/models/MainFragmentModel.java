package ws.stefma.stefbinding.main.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.net.Uri;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import ws.stefma.stefbinding.BR;
import ws.stefma.stefbinding.R;

@SuppressWarnings("unused")
public class MainFragmentModel extends BaseObservable {

    private String paypal = "Paypal";
    private String cash = "Cash";
    private String creditCard = "Credit Card";
    private int radioPos = -1;

    private String switchMe = "Switch";
    private boolean isSwitched = false;

    private String checkMe = "Check me :)";
    private boolean isChecked = true;

    public String getPaypal() {
        return paypal;
    }

    public void setPaypal(String paypal) {
        this.paypal = paypal;
    }

    public String getCash() {
        return cash;
    }

    public void setCash(String cash) {
        this.cash = cash;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getSwitchMe() {
        return switchMe;
    }

    public void setSwitchMe(String switchMe) {
        this.switchMe = switchMe;
    }

    public String getCheckMe() {
        return checkMe;
    }

    public void setCheckMe(String checkMe) {
        this.checkMe = checkMe;
    }

    public boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

    public void checkChangeListener(CompoundButton view, boolean value) {
        this.isChecked = value;
        notifyPropertyChanged(BR.textText);
    }

    public void radioChangeListener(RadioGroup radioGroup, int position) {
        this.radioPos = position;
        notifyPropertyChanged(BR.textText);
        notifyPropertyChanged(BR.loadImage);
    }

    public void switchChangeListener(CompoundButton compoundButton, boolean value) {
        this.isSwitched = value;
        notifyPropertyChanged(BR.textText);
    }

    @Bindable
    public Uri getLoadImage() {
        String uri = "https://media2.wnyc.org/i/620/372/l/80/1/blackbox.jpeg";
        switch (this.radioPos) {
            case R.id.credit_card:
                uri = "http://i.imgur.com/citrr4S.jpg";
                break;
            case R.id.cash:
                uri = "http://i.imgur.com/SoMf5uc.jpg";
                break;
            case R.id.paypal:
                uri = "http://i.imgur.com/kpvRgUI.jpg";
                break;
        }
        return Uri.parse(uri);
    }

    @SuppressWarnings("StringBufferReplaceableByString")
    @Bindable
    public String getTextText() {
        StringBuilder builder = new StringBuilder()
                .append("Checkbox: ")
                .append(String.valueOf(this.isChecked))
                .append("\n")
                .append("RadioPos: ")
                .append(getRadioPos())
                .append("\n")
                .append("Switch: ")
                .append(String.valueOf(this.isSwitched));
        return builder.toString();
    }

    private String getRadioPos() {
        switch (this.radioPos) {
            case R.id.credit_card:
                return this.creditCard;
            case R.id.cash:
                return this.cash;
            case R.id.paypal:
                return this.paypal;
            default:
                return "Nothing";
        }
    }
}
