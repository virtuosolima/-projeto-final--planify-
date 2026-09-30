package br.edu.ifpe.planify.navigation

sealed class NavTarget(val route: String) {
    object Home : NavTarget("home")
}