package ws.stefma.stefbinding.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ws.stefma.stefbinding.R;
import ws.stefma.stefbinding.databinding.FragmentMainBinding;
import ws.stefma.stefbinding.main.models.MainFragmentModel;

public class MainFragment extends Fragment {

    private FragmentMainBinding viewBinding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        viewBinding = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.fragment_main, container, false);
        viewBinding.getRoot().setBackgroundResource(R.color.colorPrimaryDark);
        viewBinding.setFragmentModel(new MainFragmentModel());
        return viewBinding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

    }
}
