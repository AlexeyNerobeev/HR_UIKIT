package com.example.uikit.presentation

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.uikit.R

//13.05.2026
//11
//функция отображения input. Принимает модификатор, плейсхолдер, значение, флаг ошибки, текст ошибки,
//метд изменения значения, флаг активности, флаг иконки показа пароля
@Composable
fun Input(
    modifier: Modifier = Modifier,
    value: String,
    placeholder: String,
    isError: Boolean = false,
    isEnabled: Boolean = true,
    errorMessage: String,
    showIcon: Boolean = false,
    onValueChange: (String) -> Unit
) {
    val visual = remember { mutableStateOf(true) }
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        OutlinedTextField(
            value = value,
            onValueChange = {
                Log.i("input", "пользователь ввел $it")
                onValueChange(it)
            },
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(48.dp),
            colors = OutlinedTextFieldDefaults.colors(
                disabledContainerColor = Color(0xFFFAF8FF),
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                focusedBorderColor = Primary,
                unfocusedBorderColor = Color(0xFFC3C6D7),
                focusedPlaceholderColor = Color(0xFF6B7280),
                unfocusedPlaceholderColor = Color(0xFF6B7280),
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                errorBorderColor = Error
            ),
            visualTransformation = if (showIcon && visual.value){
                PasswordVisualTransformation()
            } else{
                VisualTransformation.None
            },
            placeholder = {
                Text(text = placeholder,
                    style = Theme.typography.bodyMedium)
            },
            enabled = isEnabled,
            isError = isError,
            trailingIcon = {
                if (showIcon){
                    Icon(painter = painterResource(R.drawable.eye_icon),
                        contentDescription = null,
                        tint = Color.Unspecified,
                        modifier = Modifier
                            .clickable{
                                Log.i("click", "плользователь нажал на trailing icon")
                                visual.value = !visual.value
                            })
                }
            }
        )
        if(isError) {
            Text(
                text = errorMessage,
                color = Error,
                style = Theme.typography.bodySmall,
                modifier = Modifier
                    .padding(top = 4.dp)
            )
        }
    }
}