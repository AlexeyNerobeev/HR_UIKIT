package com.example.hr_uikit

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.example.uikit.presentation.buttons.DestructiveButton
import com.example.uikit.presentation.buttons.PrimaryButton
import com.example.uikit.presentation.buttons.SecondaryButton

//13.05.2026
//11
//функции отображения элементов в storybook
@ShowkaseComposable
@Composable
fun ShowPrimaryButton(){
    PrimaryButton(
        text = "enable",
        modifier = Modifier
            .height(70.dp) ,
        onCLick = {  },
        isEnable = true
    )
}

@ShowkaseComposable
@Composable
fun ShowPrimaryButtonDisabled(){
    PrimaryButton(
        text = "text",
        modifier = Modifier,
        onCLick = {  },
        isEnable = false
    )
}

@ShowkaseComposable
@Composable
fun ShowButtonLoading(){
   PrimaryButton(
       text = "text",
       onCLick = {},
       isEnable = true,
       isLoading = true
   )
}

@ShowkaseComposable
@Composable
fun ShowSecondaryButton(){
    SecondaryButton(
        modifier = Modifier,
        text = "text"
    ) { }
}

@ShowkaseComposable
@Composable
fun ShowDestructiveButton(){
    DestructiveButton(
        modifier = Modifier,
        text = "text"
    ) { }
}