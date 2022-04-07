package com.github.bgrebennikov.customviewextensions.extensions

import androidx.fragment.app.Fragment
import com.github.bgrebennikov.customviewextensions.customViews.CustomToolbarView
import com.github.bgrebennikov.customviewextensions.databinding.CustomToolbarBinding

fun Fragment.setupMainAppbar(
    toolbarViewId : Int,
    titleText: String,
    subtitleText: String
){

    val layout = view?.findViewById<CustomToolbarView>(toolbarViewId)

    layout?.setTitle(titleText)
    layout?.setSubtitle(subtitleText)


}