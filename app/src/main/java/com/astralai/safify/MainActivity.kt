package com.astralai.safify

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.astralai.safify.ui.theme.SafifyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    SafifyTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {

        }
    }
}

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "map") {
        /*composable("map") { Map(*//**//*) }
        composable("ar") { Ar(*//**//*) }
        composable("profile") { Profile(*//**//*) }*/
    }
}

@Composable
fun Map(navController: NavController) {

}

@Composable
fun Ar(navController: NavController) {

}

@Composable
fun Profile(navController: NavController) {
    /*...*/
    /*Button(onClick = { navController.navigate("friends") }) {
        Text(text = "Navigate next")
    }*/
    /*...*/
}

@Preview(showBackground = true, name = "Light Mode")
@Preview(showBackground = true, name = "Night Mode", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun DefaultPreview() {
    MyApp()
}