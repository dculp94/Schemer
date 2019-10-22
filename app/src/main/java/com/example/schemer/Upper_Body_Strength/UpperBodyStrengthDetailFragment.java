package com.example.schemer.Upper_Body_Strength;

import android.app.Activity;
import android.os.Bundle;

import com.example.schemer.R;
import com.google.android.material.appbar.CollapsingToolbarLayout;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.google.android.youtube.player.YouTubeBaseActivity;



import com.example.schemer.Upper_Body_Strength.dummy.DummyContent;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import static android.content.ContentValues.TAG;

/**
 * A fragment representing a single Upper_Body_Strength detail screen.
 * This fragment is either contained in a {@link UpperBodyStrengthListActivity}
 * in two-pane mode (on tablets) or a {@link UpperBodyStrengthDetailActivity}
 * on handsets.
 */


public class UpperBodyStrengthDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */

    YouTubePlayerView mYoutubePlayerView;

    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public UpperBodyStrengthDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.content);
            }
        }
    }

    // Subfield for each individual item display
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.upperbodystrength_detail, container, false);


        if (mItem != null) {
            mYoutubePlayerView = mYoutubePlayerView.findViewById(R.id.YoutubeVideo);
            mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
                @Override
                public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                    youTubePlayer.loadVideo("XSza8hVTlmM");
                }

                @Override
                public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                    Log.d(TAG,"Failed to initialize");
                }
            };
        }

        return rootView;
    }
}
