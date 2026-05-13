package com.example.hr_uikit

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.example.uikit.presentation.Input
import com.example.uikit.presentation.Select
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

@ShowkaseComposable
@Composable
fun ShowDefaultInput(){
    Input(
        modifier = Modifier,
        value = "",
        placeholder = "jsdkfsjdf",
        isError = false,
        isEnabled = true,
        errorMessage = "error",
        showIcon = false
    ) { }
}

@ShowkaseComposable
@Composable
fun ShowErrorInput(){
    Input(
        value = "sjkdklfjskd",
        placeholder = "jsldfjksdhk",
        isError = true,
        isEnabled = true,
        errorMessage = "error",
        showIcon = false
    ) { }
}

@ShowkaseComposable
@Composable
fun ShowDisabledInput(){
    Input(
        value = "",
        placeholder = "jsdlkfhskdjf",
        isError = false,
        isEnabled = false,
        showIcon = false,
        errorMessage = "error"
    ) { }
}

@ShowkaseComposable
@Composable
fun ShowPasswordInput(){
    Input(
        modifier = Modifier,
        value = "dlk;fsd",
        placeholder = "ksdklflsdk",
        isError = false,
        isEnabled = true,
        errorMessage = "error",
        showIcon = true
    ) { }
}

@ShowkaseComposable
@Composable
fun ShowSelect(){
    Select(
        modifier = Modifier,
        onCLick = {},
        header = "header",
        value = "value",
        items = listOf("djfksj", "dfslks;a", "dljfsdjfld")
    )
}