package com.example.uikit.presentation.buttons

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uikit.presentation.Primary
import com.example.uikit.presentation.Theme

//13.05.2026
//11
//функция отображения primary button. Принимает текст, модификатор, метод нажатия, флаг активности,
//флаг загрузки
@Composable
fun PrimaryButton(
    text: String,
    modifier: Modifier = Modifier,
    onCLick: () -> Unit,
    isEnable: Boolean = true,
    isLoading: Boolean = false
) {
    Button(
        onClick = {
            Log.i("click", "пользователь нажал на primary button")
            onCLick()
        },
        enabled = isEnable,
        modifier = modifier
            .fillMaxWidth()
            .height(48.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(
                color = if (isEnable) {
                    Primary
                } else {
                    Primary.copy(alpha = 0.5f)
                }
            ),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            disabledContainerColor = Color.Transparent
        ),
        contentPadding = PaddingValues(0.dp)
    ) {
        if (isLoading) {
            CircularProgressIndicator(
                color = Color.White,
                trackColor = Color(0xFF5D84D6),
                modifier = Modifier
                    .size(20.dp),
                strokeCap = StrokeCap.Square,
                strokeWidth = 2.dp,
                gapSize = 0.dp
            )
        } else {
            Text(
                text = text,
                style = Theme.typography.subheader,
                fontSize = 16.sp,
                color = Color.White
            )
        }
    }
}