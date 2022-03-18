package com.example.customviewapp

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlin.random.Random

class TapperView : LinearLayout {

    private val button: Button
    private val textView: TextView
    private var currentScore : MutableLiveData<Int>? = null

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )
    init {
        orientation = VERTICAL
        (context
            .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
            .inflate(R.layout.view_tapper,this,true)

        textView = findViewById<TextView?>(R.id.textView)

        button = findViewById<Button?>(R.id.button).apply {
            setOnClickListener {
                textView.text = Random.nextInt(0,1000).toString()
            }
        }
    }

}