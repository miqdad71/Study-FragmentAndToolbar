package com.miqdad71.arkademyandroidweek6.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.miqdad71.arkademyandroidweek6.R
import java.util.zip.Inflater

class FragmentB: Fragment() {
    private lateinit var rootView: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.fragment_b, container, false)
        return rootView

    }
}