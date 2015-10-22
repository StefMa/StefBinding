package ws.stefma.stefbinding.main.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import ws.stefma.stefbinding.BR;

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
    }

    public void switchChangeListener(CompoundButton compoundButton, boolean b) {
        this.isSwitched = b;
        notifyPropertyChanged(BR.textText);
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
            case 1:
                return this.creditCard;
            case 2:
                return this.cash;
            case 3:
                return this.paypal;
            default:
                return "Nothing";
        }
    }
}
