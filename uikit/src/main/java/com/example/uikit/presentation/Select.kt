package com.example.uikit.presentation

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.uikit.R

//13.05.2026
//11
//функция для отображения select. Принимает модификатор, метод клика, заголовок,
//значение, список компонентов
@Composable
fun Select(
    modifier: Modifier = Modifier,
    onCLick: (String) -> Unit,
    header: String,
    value: String,
    items: List<String>
) {
    val showItems = remember { mutableStateOf(false) }
    Column(modifier = modifier
        .fillMaxWidth()) {
        Text(text = header,
            color = Color.Black,
            style = Theme.typography.fieldLabel)
        Box(
            modifier = modifier
                .padding(top = 5.dp)
                .fillMaxWidth()
                .border(
                    width = 1.dp,
                    color = Color(0xFFC3C6D7),
                    shape = RoundedCornerShape(8.dp)
                )
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(8.dp)
                )
                .clickable{
                    showItems.value = !showItems.value
                }
        ){
            Row(modifier = Modifier
                .padding(vertical = 11.dp)
                .padding(horizontal = 16.dp)
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically) {
                Text(text = value,
                    color = Color.Black,
                    style = Theme.typography.fieldLabel)
                Icon(painter = painterResource(R.drawable.arrow_down),
                    contentDescription = null,
                    tint = Color.Unspecified)
            }
        }
        DropdownMenu(
            expanded = showItems.value,
            onDismissRequest = {
                showItems.value = false
            }
        ) {
            items.forEach {
                DropdownMenuItem(
                    text = {
                        Text(text = it)
                    },
                    onClick = {
                        Log.i("select", "пользователь выбрал $it")
                        onCLick(it)
                    }
                )
            }
        }
    }
}