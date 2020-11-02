package com.tugastengahsemester.rikihikmianto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_detail1.view.*

class DetailFragment1 : Fragment() {

    var displayText1: String? = ""

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_detail1, container, false)

        displayText1 = arguments?.getString("message")

        view.displayText1.text = displayText1

        return view
    }

}