package com.tugastengahsemester.rikihikmianto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Communicator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val daftarFragment = DaftarFragment()
        val fragment = supportFragmentManager.findFragmentByTag(DaftarFragment::class.java.simpleName)

        button_open_fragment.setOnClickListener {
            if (fragment !is DaftarFragment){
                button_open_fragment.visibility = View.GONE
                supportFragmentManager.beginTransaction()
                    .add(R.id.daftar, daftarFragment, DaftarFragment::class.java.simpleName)
                    .commit()
            }
        }
    }


    override fun passData(textView: String) {
        val budle = Bundle()

        budle.putString("message", textView)

        val detailFragment = DetailFragment()
        detailFragment.arguments = budle
            supportFragmentManager.beginTransaction()
                .add(R.id.daftar, detailFragment, DaftarFragment::class.java.simpleName)
                .addToBackStack(DaftarFragment::class.java.simpleName)
                .commit()
    }
    override fun passData1(textView: String){
        val budle = Bundle()

        budle.putString("message", textView)

        val detailFragment1 = DetailFragment1()
        detailFragment1.arguments = budle
        supportFragmentManager.beginTransaction()
            .add(R.id.daftar1, detailFragment1, DaftarFragment::class.java.simpleName)
            .addToBackStack(DaftarFragment::class.java.simpleName)
            .commit()
    }
}