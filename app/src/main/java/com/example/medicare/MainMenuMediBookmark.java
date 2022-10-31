package com.example.medicare;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.ktmedicare.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainMenuMediBookmark#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainMenuMediBookmark extends Fragment {
    private View view;
    private TextView page_bookmark;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MainMenuMediBookmark() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainMenuMediBookmark.
     */
    // TODO: Rename and change types and number of parameters
    public static MainMenuMediBookmark newInstance(String param1, String param2) {
        MainMenuMediBookmark fragment = new MainMenuMediBookmark();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_main_menu_medi_bookmark,container,false);

        page_bookmark = (TextView) view.findViewById(R.id.page_bookmark);
        //fragment에서 findViewById는 view.을 이용해서 사용

        page_bookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),MediSubBookmark.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        return view;
        //return inflater.inflate(R.layout.fragment_main_menu_medi_bookmark, container, false);
    }

}