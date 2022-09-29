package com.gdscmmdu.materialuiapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.gdscmmdu.materialuiapp.ui.theme.MaterialUiAPPTheme
import androidx.compose.material.IconButton
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialUiAPPTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Home()
                }
            }
        }
    }
}

@Composable
fun Home(){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("News Application") },
                navigationIcon = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(Icons.Filled.Menu, contentDescription = null)
                    }
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.Notifications, contentDescription = "Localized description")
                    }
                }
            )
        },
        floatingActionButton = { FloatingActionButton(onClick = { }, backgroundColor = MaterialTheme.colors.primary) {
            Icon(Icons.Filled.Call, contentDescription = "Chat Icon")
        }},

        content = {
                  Column(modifier = Modifier.padding(16.dp)) {
                      Card(modifier = Modifier.fillMaxWidth(), shape = MaterialTheme.shapes.medium, elevation = 3.dp) {
                        Column(modifier = Modifier.padding(10.dp)){
                            Image(painter = painterResource(R.drawable.newsone), contentDescription = null)
                            Spacer(modifier = Modifier.height(10.dp))


                            Text(text = "Choked by the plastic ban, MSME units gasp to find an answer", fontSize = 22.sp, fontWeight = FontWeight.W600)
                            Spacer(modifier = Modifier.height(10.dp))


                            Text(text = "Centre sets stiffer 40% air pollution reduction target for cities by 2026. air pollution may increase hospitalisation risk for autistic children: Study.")
                            Spacer(modifier = Modifier.height(20.dp))


                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ){
                                Icon(Icons.Filled.Share, contentDescription = null)
                                Button(onClick = { /*TODO*/ }) {
                                    Text(text = "Read More")
                                }
                            }
                        }
                      }
                  }
        },
    )
}