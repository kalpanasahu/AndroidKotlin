package com.kt.game.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.kt.androidkotlinstart.R

import com.kt.androidkotlinstart.databinding.LayoutGameBinding

class Game : Fragment() {
    // The current word
    private var word = ""
    private lateinit var wordList: MutableList<String>
    // The current score
    private var score = 0
    private lateinit var binding:LayoutGameBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate view and obtain an instance of the binding class
        binding=DataBindingUtil.inflate(inflater, R.layout.layout_game,container,false)
        resetList()
        nextWord()
        binding.correctButton.setOnClickListener { onCorrect() }
        binding.skipButton.setOnClickListener { onSkip() }
        updateScoreText()
        updateWordText()

        return binding.root
    }

    private fun onSkip() {

        score--;
        nextWord()
    }

    private fun onCorrect() {

       score++;
        nextWord()
    }

    private fun updateWordText() {

        binding.wordIsText.text=word;
    }

    private fun updateScoreText() {

        binding.scoreText.text=score.toString();
    }

    fun resetList(){
        wordList = mutableListOf(
            "queen",
            "hospital",
            "basketball",
            "cat",
            "change",
            "snail",
            "soup",
            "calendar")
        wordList.shuffle()
    }
    fun nextWord(){
        if(!wordList.isEmpty()){
            word=wordList.removeAt(0);
        }

        updateWordText();
        updateScoreText();
    }
}