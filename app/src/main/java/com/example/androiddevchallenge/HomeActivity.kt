package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import com.example.androiddevchallenge.ui.theme.montserratTypography
import com.example.androiddevchallenge.ui.theme.shapes
import com.example.androiddevchallenge.ui.theme.typography

class HomeActivity : AppCompatActivity()
{
  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)
    setContent {
      MyTheme {
        homeScreen()
      }
    }
  }
}

@Composable
fun homeScreen()
{
  Surface(color = MaterialTheme.colors.surface) {}

  ConstraintLayout(modifier = Modifier.fillMaxSize())
  {
    val (button, balance_text, balance_number) = createRefs()

    Text(
      text = "Balance",
      //style = montserratTypography.subtitle1,
      color = MaterialTheme.colors.onBackground,
      modifier = Modifier
        .constrainAs(balance_text) {
          top.linkTo(parent.top)
          bottom.linkTo(parent.bottom)
          start.linkTo(parent.start)
          end.linkTo(parent.end)
        }
    )

    Text(
      text = "$73,589.01",
      modifier = Modifier
        .constrainAs(balance_number){
          top.linkTo(balance_text.bottom)
          start.linkTo(parent.start)
          end.linkTo(parent.end)
        },
      //style = montserratTypography.h1,
      color = MaterialTheme.colors.onBackground,
      fontWeight = FontWeight.ExtraBold,
      fontSize = 40.sp /*fontFamily = FontFamily.montserratFamily,*/
    )
  }
/*
  Box(modifier = Modifier.fillMaxSize()) {
    Text(
      text = "Balance",
      style = montserratTypography.subtitle1,
      color = MaterialTheme.colors.onBackground,
      modifier = Modifier
        .offset(x = 30.dp, y = 50.dp)
    )

    Text(
      text = "$73,589.01",
      style = montserratTypography.h1,
      color = MaterialTheme.colors.onBackground,
      fontWeight = FontWeight.ExtraBold,
      fontSize = 40.sp
      /*fontFamily = FontFamily.montserratFamily,*/
    )
  }*/
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun HomeScreenLightPreview()
{
  MyTheme()
  {
    homeScreen()
  }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun HomeScreenDarkPreview()
{
  MyTheme(darkTheme = true)
  {
    homeScreen()
  }
}