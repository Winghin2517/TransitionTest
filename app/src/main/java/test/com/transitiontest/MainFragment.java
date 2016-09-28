package test.com.transitiontest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by WingHinChan on 2016/09/28.
 */

public class MainFragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view, container,false);
        final ImageView dot = (ImageView) view.findViewById(R.id.image_circle);
        Picasso.with(getContext()).load(R.drawable.snow).transform(new PureCircleTransformation()).into(dot);
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), SecondActivity.class);
                View sharedView = dot;
                String transitionName = getString(R.string.blue_name);
                ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), sharedView, transitionName);
                startActivity(i, transitionActivityOptions.toBundle());
            }
        });
        return view;
    }
}
