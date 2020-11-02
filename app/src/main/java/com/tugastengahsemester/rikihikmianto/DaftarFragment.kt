package com.tugastengahsemester.rikihikmianto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_daftar.view.*


class DaftarFragment : Fragment() {

    private lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_daftar, container, false)

        communicator = activity as Communicator
        view.btn_detail1.setOnClickListener {
            communicator.passData(view.text_fragement2.text.toString())
        }
        view.btn_detail2.setOnClickListener {
            communicator.passData1(view.text_fragement3.text.toString())
        }
        return view
    }
}