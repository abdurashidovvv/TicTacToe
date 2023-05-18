package uz.abdurashidov.tictactoe

sealed class UserActions{
    object PlayAgainButtonClick:UserActions()
    data class BoardTapped(val cellNo:Int):UserActions()
}