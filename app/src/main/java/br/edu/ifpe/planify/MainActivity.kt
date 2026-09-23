package br.edu.ifpe.planify

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.edu.ifpe.planify.ui.navigation.NavGraph
import br.edu.ifpe.planify.ui.theme.PlanifyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlanifyTheme {
                NavGraph()
            }
        }
    }
}