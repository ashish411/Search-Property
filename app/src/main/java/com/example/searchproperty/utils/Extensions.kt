package com.example.searchproperty.utils

import android.view.View
import androidx.navigation.findNavController

object Extensions {

    fun View.moveToNextScreen(moveBack: Boolean, screenId: Int) {
        if (moveBack) {
            this.findNavController().navigate(screenId)
        } else {
            this.findNavController().navigateUp()
        }
    }

}