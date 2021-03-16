package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.ui.theme.typography
class LogInActivity : AppCompatActivity()
{
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
        LoginScreen()
    }
  }
}

@Preview(showBackground = true, backgroundColor = 0xFF322049, heightDp = 640, widthDp = 360)
@Composable
fun LoginScreen()
{
  Row(verticalAlignment = Alignment.CenterVertically) {
    Column(
      horizontalAlignment = Alignment.CenterHorizontally,
      modifier = Modifier
        .border(1.dp, Color.Red, RectangleShape)
        .fillMaxWidth()
        .padding(20.dp))
    {
      Text( "Welcome bbbbbback",
        style = typography.h1,
        fontFamily = montserratFamily,
        fontWeight = FontWeight.ExtraBold,
        color = Color.White,
        fontSize = 96.sp
      )
      //TextField(value = "email address", onValueChange = { /*TODO*/ })
    }
  }
}
/*
@Preview(showBackground = true, backgroundColor = 0xFF322049, heightDp = 640, widthDp = 360)
@Composable
fun PreviewThis()
{
  LoginScreen()
}
*/

/*
* @Preview(
    widthDp = 420
)
@Composable
fun SpotifyCardPreview() {
    SpotifyCard()
}

@Composable
fun SpotifyCard(color: Color = Color(0xFF8398DB)) {}
* */

val montserratFamily = FontFamily(
  Font(R.font.montserrat_black, FontWeight.Black),
  Font(R.font.montserrat_black_italic, FontWeight.Black),
  Font(R.font.montserrat_bold, FontWeight.Bold),
  Font(R.font.montserrat_extrabold, FontWeight.ExtraBold),
  Font(R.font.montserrat_semi_bold, FontWeight.SemiBold),
  Font(R.font.montserrat_medium, FontWeight.Medium),
  Font(R.font.montserrat_light, FontWeight.Light)
)