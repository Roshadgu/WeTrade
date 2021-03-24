package com.example.androiddevchallenge

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
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
import com.example.androiddevchallenge.ui.theme.typography
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu

class LogInActivity : AppCompatActivity()
{
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
        LoginScreen()
    }
  }
}

@Composable
fun loginUI()
{
 // Icon(Icons.Filled., contentDescription = null)
  val negativeXoffest = 134.dp

  //Password Material Icon
  Image(
    painter = painterResource(id = R.drawable.password_black_18dp),
    contentDescription = null,
    Modifier
      .height(30.dp)
      .width(30.dp)
      .offset(x = -negativeXoffest, y = 127.dp),
    contentScale = ContentScale.Inside
  )

  //Mail Material Icon
  Image(
    painter = painterResource(id = R.drawable.mail_outline_24px),
    contentDescription = null,
    Modifier
      .height(30.dp)
      .width(30.dp)
      .offset(x = -negativeXoffest, y = 56.dp),
    contentScale = ContentScale.Inside
  )

  Box(modifier = Modifier.fillMaxHeight())
  {
    Image(
      painter = painterResource(id = R.drawable.login_bg),
      contentDescription = null,
      modifier = Modifier.fillMaxWidth(),
      contentScale = ContentScale.FillWidth
    )
  }
}

@Composable
fun loginButton()
{
  val yellow = Color(0xFFE3DA00)

  Button(
    onClick ={/*Toast.makeText(applicationContext, "You've Logged In!", Toast.LENGTH_LONG).show()*/},
    modifier = Modifier
      .offset(y = 100.dp)
      .width(350.dp)
      .height(48.dp)
      .clip(shape = RoundedCornerShape(20.dp)),
    colors = ButtonDefaults.buttonColors(backgroundColor = yellow)
  )
  {
    Text(text = "LOG IN")
  }
}

@Composable
fun LoginScreen()
{
  var value = ""
  var value2 = ""
  val offsetValue = 100.dp
  var ph = "Email address"

  Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxHeight()) {
    Column(
      horizontalAlignment = Alignment.CenterHorizontally,
      modifier = Modifier
        .border(1.dp, Color.Red, RectangleShape)
        .fillMaxWidth()
        .padding(20.dp))
    {
      Text( "Welcome back",
        style = typography.h2,
        //fontFamily = montserratFamily,
        //fontWeight = FontWeight.ExtraBold,
        color = Color.White,
        //fontSize = 50.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier.offset(y = -offsetValue)
      )
      //Email Address Text Field
      OutlinedTextField(
        value = value,
        label = {Text("Email address",  modifier = Modifier.offset(x = 30.dp))},
        onValueChange = { value = it },
        maxLines = 1,
        textStyle = TextStyle(color = Color.Gray, fontWeight = FontWeight.Light),
        modifier = Modifier
          .width(350.dp)
          .height(60.dp)
          .offset(y = 40.dp)
          .clip(shape = RoundedCornerShape(4.dp)),
        colors = TextFieldDefaults.outlinedTextFieldColors(focusedBorderColor = Color.Black, unfocusedBorderColor = Color.Gray)
      )
      //Password Text Field
      OutlinedTextField(
        value = value2,
        placeholder = {"Password"},
        onValueChange = { value2 = it },
        label = { Text("Password", modifier = Modifier.offset(x = 30.dp))},
        maxLines = 1,
        textStyle = TextStyle(color = Color.Gray, fontWeight = FontWeight.Light),
        modifier = Modifier
          .width(350.dp)
          .height(60.dp)
          .offset(y = 48.dp)
          .clip(shape = RoundedCornerShape(4.dp))
      )

      loginButton()
    }
  }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF, heightDp = 640, widthDp = 360)
@Composable
fun LoginScreenPreview()
{
  loginUI()
  LoginScreen()
}