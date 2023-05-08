package com.example.menuoverlapsolved

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.menuoverlapsolved.ui.theme.MenuOverlapSolvedTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MenuOverlapSolvedTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppView()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppView (){
    Scaffold(
        topBar = {
            SmallTopAppBar(
                title = { TopBarMenu(modifier = Modifier)}
            )
        }

    ) {it
        Box(modifier = Modifier.padding(it)){
            Greeting("Android")
        }

    }
}


@Composable
fun TopBarMenu(modifier: Modifier){
    Row(
        modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = stringResource(id = R.string.app_name)
        )
        Image(painter = painterResource(id = R.drawable.baseline_check_24), contentDescription = "solved check")
    }
}

@Composable
fun Greeting(name: String) {
    Box(
        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxSize()
    ){
        Text(text = "Hello $name!")
    }
   
}

@Preview(
    showBackground = true,
    showSystemUi = true
    )
@Composable
fun DefaultPreview() {
    MenuOverlapSolvedTheme {
       AppView()
    }
}