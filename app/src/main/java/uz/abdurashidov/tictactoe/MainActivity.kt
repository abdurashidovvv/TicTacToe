package uz.abdurashidov.tictactoe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import uz.abdurashidov.tictactoe.ui.GameScreen
import uz.abdurashidov.tictactoe.ui.theme.TicTacToeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TicTacToeTheme {
                val viewModel= viewModel<GameViewModel>()
                GameScreen(viewModel)
            }
        }
    }
}


