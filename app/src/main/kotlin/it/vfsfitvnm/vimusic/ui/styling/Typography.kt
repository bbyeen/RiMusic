package it.vfsfitvnm.vimusic.ui.styling

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import it.vfsfitvnm.vimusic.R

@Immutable
data class Typography(
    val xxs: TextStyle,
    val xs: TextStyle,
    val s: TextStyle,
    val m: TextStyle,
    val l: TextStyle,
)

val LocalTypography = staticCompositionLocalOf<Typography> { TODO() }

@Composable
fun rememberTypography(color: Color): Typography {
    return remember(color) {
        TextStyle(
            fontFamily = FontFamily(
                Font(
                    resId = R.font.poppins_w300,
                    weight = FontWeight.Light
                ),
                Font(
                    resId = R.font.poppins_w400,
                    weight = FontWeight.Normal
                ),
                Font(
                    resId = R.font.poppins_w400_italic,
                    weight = FontWeight.Normal,
                    style = FontStyle.Italic
                ),
                Font(
                    resId = R.font.poppins_w500,
                    weight = FontWeight.Medium
                ),
                Font(
                    resId = R.font.poppins_w600,
                    weight = FontWeight.SemiBold
                ),
                Font(
                    resId = R.font.poppins_w700,
                    weight = FontWeight.Bold
                ),
            ),
            fontWeight = FontWeight.Normal,
            color = color
        ).run {
            Typography(
                xxs = copy(fontSize = 12.sp),
                xs = copy(fontSize = 14.sp),
                s = copy(fontSize = 16.sp),
                m = copy(fontSize = 18.sp),
                l = copy(fontSize = 20.sp),
            )
        }
    }
}
