package com.example.androiddevchallenge

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.ui.graphics.Color
import androidx.compose.material.icons.materialIcon
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.Icon
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Password
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.runtime.*
import com.example.androiddevchallenge.ui.theme.MontserratTypography
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun loginScreen()
{
 // Icon(Icons.Filled., contentDescription = null)
  val negativeXoffest = 134.dp
  var value = ""
  var value2 = ""
  val offsetValue = 100.dp
  var ph = "Email address"
  var username by remember { mutableStateOf("") }
  var passwd by remember { mutableStateOf("") }

  MaterialTheme(typography = MontserratTypography) {}

  Box(modifier = Modifier.fillMaxHeight())
  {
    Image(
      painter = painterResource(id = R.drawable.login_bg),
      contentDescription = null,
      modifier = Modifier.fillMaxWidth(),
      contentScale = ContentScale.FillWidth
    )
    
    Text(
      text = "WELCOME BACK",
      color = Color.White,
      fontSize = 36.sp,
      style = MaterialTheme.typography.h2,
      modifier = Modifier
        .offset(x = 50.dp, y = 150.dp)
      )

    OutlinedTextField( //Email textfield
      value = username,
      onValueChange = { username = it },
      placeholder = { Text("Email address")},
      leadingIcon = { Icon(Icons.Outlined.Email, contentDescription = "Localized description") },
      colors = TextFieldDefaults.textFieldColors(unfocusedIndicatorColor = Color.Gray),
      modifier = Modifier
        .offset(x = 15.dp, y = 326.dp)
        .width(328.dp)
        .padding(bottom = 16.dp)
    )

    OutlinedTextField( //Password textfield
      value = passwd,
      onValueChange = { passwd = it },
      colors = TextFieldDefaults.textFieldColors(unfocusedIndicatorColor = Color.Gray),
      placeholder = { Text("Password") },
      leadingIcon = { Icon(Icons.Outlined.Password, contentDescription = "Localized description") },
      modifier = Modifier
        .offset(x = 15.dp, y = 406.dp)
        .width(328.dp)
        .padding(bottom = 16.dp)
    )

    loginButton()
  }
}

@Composable
fun loginButton()
{
  val yellow = Color(0xFFE3DA00)

  Button(
    onClick ={/*Toast.makeText(applicationContext, "Time to sign up!", Toast.LENGTH_LONG).show()*/},
    modifier = Modifier
      .offset(x = 6.dp, y = 500.dp)
      .width(340.dp)
      .height(48.dp),
    colors = ButtonDefaults.buttonColors(backgroundColor = yellow),
    shape = RoundedCornerShape(50)
  )
  {
    Text(text = "LOG IN")
  }
}

@Preview(heightDp = 640, widthDp = 360, showBackground = true, backgroundColor = 0xf5f7fa, showSystemUi = true)
@Composable
fun LoginScreenPreview()
{
  loginScreen()
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightLoginScreenPreview()
{
  MyTheme()
  {
    homeScreen()
  }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkLoginScreenPreview()
{
  MyTheme(darkTheme = true)
  {
    homeScreen()
  }
}