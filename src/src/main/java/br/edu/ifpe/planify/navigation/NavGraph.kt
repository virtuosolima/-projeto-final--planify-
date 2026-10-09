package br.edu.ifpe.planify.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import br.edu.ifpe.planify.ui.screens.home.HomeScreen
import br.edu.ifpe.planify.ui.screens.clientes.ClienteListScreen
import br.edu.ifpe.planify.ui.screens.clientes.ClienteFormScreen
import br.edu.ifpe.planify.ui.screens.servicos.ServicoListScreen
import br.edu.ifpe.planify.ui.screens.servicos.ServicoFormScreen
import br.edu.ifpe.planify.ui.screens.compromisso.CompromissoFormScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavTarget.Home.route
    ) {
        composable(NavTarget.Home.route) {
            HomeScreen(
                onNavigateToNovoCompromisso = { navController.navigate(NavTarget.NovoCompromisso.route) },
                onNavigateToClientes = { navController.navigate(NavTarget.Clientes.route) },
                onNavigateToServicos = { navController.navigate(NavTarget.Servicos.route) }
            )
        }

        composable(NavTarget.Clientes.route) {
            ClienteListScreen(
                onNavigateBack = { navController.popBackStack() },
                onNavigateToAddCliente = { navController.navigate(NavTarget.AddCliente.route) },
                onNavigateToEditCliente = { id -> 
                    navController.navigate(NavTarget.EditarCliente.createRoute(id)) 
                }
            )
        }

        composable(NavTarget.AddCliente.route) {
            ClienteFormScreen(
                onNavigateBack = { navController.popBackStack() },
                onSave = { navController.popBackStack() }
            )
        }

        composable(
            route = NavTarget.EditarCliente.route,
            arguments = listOf(navArgument("clienteId") { type = NavType.IntType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("clienteId")
            ClienteFormScreen(
                clienteId = id,
                onNavigateBack = { navController.popBackStack() },
                onSave = { navController.popBackStack() }
            )
        }

        composable(NavTarget.Servicos.route) {
            ServicoListScreen(
                onNavigateBack = { navController.popBackStack() },
                onNavigateToAddServico = { navController.navigate(NavTarget.AddServico.route) },
                onNavigateToEditServico = { id -> 
                    navController.navigate(NavTarget.EditarServico.createRoute(id)) 
                }
            )
        }

        composable(NavTarget.AddServico.route) {
            ServicoFormScreen(
                onNavigateBack = { navController.popBackStack() },
                onSave = { navController.popBackStack() }
            )
        }

        composable(
            route = NavTarget.EditarServico.route,
            arguments = listOf(navArgument("servicoId") { type = NavType.IntType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("servicoId")
            ServicoFormScreen(
                servicoId = id,
                onNavigateBack = { navController.popBackStack() },
                onSave = { navController.popBackStack() }
            )
        }

        composable(NavTarget.NovoCompromisso.route) {
            CompromissoFormScreen(
                onNavigateBack = { navController.popBackStack() },
                onSave = { navController.popBackStack() }
            )
        }
    }
}
