package com.example.uikit.presentation

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.uikit.R

//13.05.2026
//11
//класс определения типографики
data class LibraryTypography(
    val screenHeader: TextStyle = TextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight(700),
        fontFamily = FontFamily(
            Font(
                resId = R.font.manrope_bold
            )
        )
    ),
    val subheader: TextStyle = TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight(600),
        fontFamily = FontFamily(
            Font(
                resId = R.font.manrope_semibold
            )
        )
    ),
    val bodyMedium: TextStyle = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight(400),
        fontFamily = FontFamily(
            Font(
                resId = R.font.manrope_regular
            )
        )
    ),
    val bodySmall: TextStyle = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight(400),
        fontFamily = FontFamily(
            Font(
                resId = R.font.manrope_regular
            )
        )
    ),
    val fieldLabel: TextStyle = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight(600),
        fontFamily = FontFamily(
            Font(
                resId = R.font.manrope_semibold
            )
        )
    )
)

val Typography = staticCompositionLocalOf { LibraryTypography() }

//функция определения темы типографики
@Composable
fun AppTheme(
    content: @Composable () -> Unit
){
    CompositionLocalProvider(
        Typography provides LibraryTypography(),
        content = content
    )
}

//объект доступа к теме типографики
object Theme{
    val typography: LibraryTypography
        @Composable get() = Typography.current
}