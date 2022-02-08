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
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.androiddevchallenge.ui.theme.MontserratTypography
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun LoginScreen()
{
  var username by remember { mutableStateOf("") }
  var passwd by remember { mutableStateOf("") }

  ConstraintLayout(modifier = Modifier.fillMaxSize())
  {
    val (button, welcome, email, password, image) = createRefs()
    val yellow = Color(0xFFE3DA00)

    Image(
      painter = painterResource(id = R.drawable.login_bg),
      contentDescription = null,
      modifier = Modifier.fillMaxWidth().constrainAs(image){},
      contentScale = ContentScale.FillWidth
    )

    Text(
      text = "WELCOME BACK",
      textAlign = TextAlign.Center,
      style = MaterialTheme.typography.h2,
      color = Color.White,
      //fontSize = 36.sp,
      modifier = Modifier
        .constrainAs(welcome) {
          top.linkTo(parent.top, margin = 160.dp)
          bottom.linkTo(email.top, margin = 16.dp)
          start.linkTo(parent.start, margin = 40.dp)
          end.linkTo(parent.end, margin = 40.dp)
        }
    )

    OutlinedTextField(
      value = username,
      onValueChange = { username = it },
      placeholder = { Text("Email address")},
      leadingIcon = { Icon(Icons.Outlined.Email, contentDescription = "Localized description") },
      colors = TextFieldDefaults.textFieldColors(unfocusedIndicatorColor = Color.Gray),
      modifier = Modifier
        .width(328.dp)
        .padding(bottom = 16.dp)
        .constrainAs(email) {
          top.linkTo(welcome.bottom, margin = 160.dp)
          //bottom.linkTo(password.top)
          start.linkTo(parent.start, margin = 16.dp)
          end.linkTo(parent.end, margin = 16.dp)
        }
    )

    OutlinedTextField(
      value = passwd,
      onValueChange = { passwd = it },
      colors = TextFieldDefaults.textFieldColors(unfocusedIndicatorColor = Color.Gray),
      placeholder = { Text("Password") },
      leadingIcon = { Icon(Icons.Outlined.Password, contentDescription = "Localized description") },
      modifier = Modifier
        .width(328.dp)
        .padding(bottom = 16.dp)
        .constrainAs(password) {
          top.linkTo(email.bottom)
          //bottom.linkTo(button.top)
          start.linkTo(parent.start, margin = 16.dp)
          end.linkTo(parent.end, margin = 16.dp)
        }
    )

    Button(
      onClick ={},
      modifier = Modifier
        .constrainAs(button){
          top.linkTo(password.bottom)
//          bottom.linkTo(parent.bottom)
          start.linkTo(parent.start, margin = 16.dp)
          end.linkTo(parent.end, margin = 16.dp)
        }
        .width(340.dp)
        .height(48.dp),
      colors = ButtonDefaults.buttonColors(backgroundColor = yellow),
      shape = RoundedCornerShape(50)
    )
    {
      Text(text = "LOG IN")
    }
  }
}

@Preview("Light Theme", showBackground = true, device = "Pixel 5a")
@Composable
fun LoginScreenLightPreview()
{
  LoginScreen()
}

@Preview("Dark Theme")
@Composable
fun LoginScreenDarkPreview()
{
  LoginScreen()
}