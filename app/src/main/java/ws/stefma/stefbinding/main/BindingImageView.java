package ws.stefma.stefbinding.main;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class BindingImageView extends ImageView {
    public BindingImageView(Context context) {
        super(context);
    }

    public BindingImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setImageURI(Uri uri) {
        Glide.with(getContext()).load(uri).into(this);
    }
}
