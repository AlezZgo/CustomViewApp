package com.example.customviewapp

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.example.customviewapp.databinding.ViewTapperBinding
import kotlin.random.Random

class TapperView : LinearLayout {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    private val binding : ViewTapperBinding = ViewTapperBinding.inflate(
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater,
        this,
        true)

    fun setOnButtonClickListener(block : ()->Unit){
        binding.button.setOnClickListener {
            block.invoke()
        }
    }

}