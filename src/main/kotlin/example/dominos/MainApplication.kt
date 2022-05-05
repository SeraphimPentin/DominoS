package example.dominos

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.image.Image
import javafx.stage.Stage

class MainApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(MainApplication::class.java.getResource("firstWindow.fxml"))
        val scene = Scene(fxmlLoader.load(), 1000.0, 700.0)
        stage.title = "DoMiNo"
        stage.centerOnScreen()
        stage.icons.add(Image("logo.png"))
        stage.scene = scene
        stage.show()
    }
}

/* запуск программы */
fun main() {
    Application.launch(MainApplication::class.java)
}