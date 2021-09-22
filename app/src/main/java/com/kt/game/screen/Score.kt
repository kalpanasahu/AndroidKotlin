package com.kt.game.screen

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.kt.androidkotlinstart.R
import com.kt.androidkotlinstart.databinding.LayoutScoreBinding


class Score: Fragment(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding:LayoutScoreBinding=DataBindingUtil.inflate(inflater,R.layout.layout_score,container,false)

        return binding.root
    }

}