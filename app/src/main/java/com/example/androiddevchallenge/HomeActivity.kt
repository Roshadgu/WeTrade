package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.MontserratTypography
import com.example.androiddevchallenge.ui.theme.shapes
import com.example.androiddevchallenge.ui.theme.yellow

@Composable
fun HomeScreen()
{
  Box(modifier = Modifier
    .fillMaxSize()
    .background(Color.Transparent))
  {
    Column(Modifier.fillMaxSize().background(Color.Transparent))
    {
      Row( //Top Tabs
        Modifier
          .fillMaxWidth()
          .padding(top = 64.dp), horizontalArrangement = Arrangement.Center)
      {
        Text(text = "ACCOUNT", style = MaterialTheme.typography.button, color = Color.White, modifier = Modifier.padding(end = 40.dp))
        Text(text = "WATCHLIST", style = MaterialTheme.typography.button, color = Color.White, modifier = Modifier.padding(end = 40.dp))
        Text(text = "PROFILE", style = MaterialTheme.typography.button, color = Color.White)
      }

      Row( //Balance Title
        Modifier
          .fillMaxWidth()
          .height(32.dp)
          .padding(top = 40.dp), horizontalArrangement = Arrangement.Center)
      {
        Text(text = "Balance", style = MaterialTheme.typography.subtitle1, color = Color.White)
      }

      Row( //Balance Number
        Modifier
          .fillMaxWidth()
          .padding(top = 8.dp), horizontalArrangement = Arrangement.Center)
      {
        Text(text = "$73,598.01", /*style = MaterialTheme.typography.h1,*/ fontWeight = FontWeight.ExtraBold, fontSize = 40.sp, color = Color.White)
      }

      Row( //Portfolio Support
        Modifier
          .fillMaxWidth()
          .padding(top = 24.dp), horizontalArrangement = Arrangement.Center)
      {
        Text("+412.35 today", style = MaterialTheme.typography.subtitle1, color = Color(0xFF39A844))
      }

      Row ( //Transact Button
        Modifier
          .fillMaxWidth()
          .padding(32.dp), horizontalArrangement = Arrangement.Center
        ){
        Transact_button()
      }

      Row( //Row of Assets
        Modifier
          .fillMaxWidth()
          .horizontalScroll(rememberScrollState())
          .padding(top = 16.dp, start = 16.dp), horizontalArrangement = Arrangement.Center
      ){
        Asset (text = "Week")
        Asset (text = "ETFs")
        Asset (text = "Stocks")
        Asset (text = "Funds")
        Asset (text = "Cash")
        Asset (text = "Debt")
        Asset (text = "Property")
        Asset (text = "Commodities")
        Asset (text = "Alternatives")
      }

      Image(
        painter = painterResource(id = R.drawable.home_illos),
        contentDescription = "portforlio graph",
        modifier = Modifier
          .fillMaxSize()
          .padding(start = 16.dp, bottom = 32.dp)
      )
    }
  }
}

@Composable
fun Asset(text: String)
{
  Button(
    onClick ={},
    modifier = Modifier
      .width(80.dp)
      .height(40.dp)
      .background(Color.Transparent),
    shape = RoundedCornerShape(50),
    border = BorderStroke(1.dp, Color.White),
  )
  {
    Text(text = text, style = MaterialTheme.typography.body1, /*color = Color(0xFF232323)*/)
  }
}

@Composable
fun Transact_button()
{
  Button(
    onClick ={},
    modifier = Modifier
      .width(340.dp)
      .height(48.dp),
    colors = ButtonDefaults.buttonColors(backgroundColor = yellow),
    shape = RoundedCornerShape(50)
  )
  {
    Text(text = "TRANSACT", style = MaterialTheme.typography.button, color = Color.Black)
  }
}

@Preview(showBackground = true, backgroundColor = 0xFF322049)
@Composable
fun HomeScreenPreview()
{
  HomeScreen()
}