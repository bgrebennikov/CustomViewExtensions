package com.github.bgrebennikov.customviewextensions.customViews

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.github.bgrebennikov.customviewextensions.R
import com.github.bgrebennikov.customviewextensions.databinding.CustomToolbarBinding

class CustomToolbarView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {

    private val binding by lazy {
        CustomToolbarBinding.bind(
            LayoutInflater.from(context).inflate(
                R.layout.custom_toolbar, this, true
            )
        )
    }

    init{

        val attrArray: TypedArray = context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.CustomToolbarView,
            0, 0
        )

        setupToolbar(attrArray)

    }

    private fun setupToolbar(attrsArray: TypedArray) {
        with(binding){
            title.text = attrsArray.getString(ATTR_TITLE)
            subtitle.text = attrsArray.getString(ATTR_SUBTITLE)
        }
    }

    fun setTitle(title: String){
        binding.title.text = title
    }

    fun setSubtitle(subtitle: String){
        binding.subtitle.text = subtitle
    }

    companion object{
        const val ATTR_TITLE = R.styleable.CustomToolbarView_title
        const val ATTR_SUBTITLE = R.styleable.CustomToolbarView_subtitle
    }


}