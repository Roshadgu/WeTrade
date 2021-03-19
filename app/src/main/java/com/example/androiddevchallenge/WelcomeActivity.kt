package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.shapes

class WelcomeActivity : AppCompatActivity()
{
  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)
    setContent {
      welcomeScreen()
    }
  }
}

@Composable
fun logInButon()
{
  val yellow = Color(0xFFE3DA00)
  //val clear = Color(transparent)

  OutlinedButton(
    onClick ={/*Toast.makeText(applicationContext, "Time to sign up!", Toast.LENGTH_LONG).show()*/},
    modifier = Modifier
      .offset(x = 200.dp, y = 550.dp)
      .width(150.dp)
      .height(48.dp),
    border = BorderStroke(2.dp, yellow),
    shape = RoundedCornerShape(50),
    colors = ButtonDefaults.outlinedButtonColors(Color.Transparent)
  )
  {
    Text(text = "LOG IN", color = yellow,)
  }
}

@Composable
fun signUpButton()
{
  val yellow = Color(0xFFE3DA00)

  Button(
    onClick ={/*Toast.makeText(applicationContext, "Time to sign up!", Toast.LENGTH_LONG).show()*/},
    modifier = Modifier
      .offset(x = 20.dp, y = 550.dp)
      .width(150.dp)
      .height(48.dp),
    colors = ButtonDefaults.buttonColors(backgroundColor = yellow),
    shape = RoundedCornerShape(50)
  )
  {
    Text(text = "GET STARTED")
  }
}

@Composable
fun welcomeScreen()
{
  Box(modifier = Modifier.fillMaxHeight())
  {
    Image(
      painter = painterResource(id = R.drawable.welcome_bg),
      contentDescription = null,
      modifier = Modifier.fillMaxWidth(),
      contentScale = ContentScale.FillWidth
    )

    Image(
      painter = painterResource(id = R.drawable.logo),
      contentDescription = null,
      modifier = Modifier.offset(x = 100.dp, y = 300.dp)
    )

    signUpButton()
    logInButon()
  }
}

@Preview(heightDp = 640, widthDp = 360)
@Composable
fun PreviewWelcomeScreen()
{
  welcomeScreen()
}
