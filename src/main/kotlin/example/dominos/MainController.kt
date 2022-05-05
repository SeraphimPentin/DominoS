package example.dominos

import javafx.application.Platform
import java.net.URL
import java.util.ResourceBundle
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.control.Alert
import javafx.scene.control.Button
import javafx.scene.control.ButtonType
import javafx.scene.control.Label
import javafx.scene.image.Image
import javafx.stage.Modality
import javafx.stage.Stage

open class MainController {

    val playController: PlayingFieldController? = Context().getInstance().getPlayFieldController()

    @FXML
    lateinit var resources: ResourceBundle

    @FXML
    private lateinit var location: URL

    @FXML
    private lateinit var exit: Button

    @FXML
    private lateinit var minusDice: Button

    @FXML
    private lateinit var numberDice: Label


    @FXML
    private lateinit var plusDice: Button

    @FXML
    private lateinit var startGame: Button

    /* геттер и сеттер для numberDice */
    fun getNumberDice(): Label {
        return numberDice
    }

    fun setNumberDice(numberDice: Label) {
        this.numberDice = numberDice
    }

    /* функция, прибавляющая еденицу, при нажатии на "плюс" */
    fun plusD(plus: Button) {
        plus.setOnAction {
            val currentNum = if (numberDice.text.toString().toInt() < 28) (numberDice.text.toString()
                .toInt() + 1).toString() else 28.toString()
            numberDice.text = currentNum
        }
    }

    /* функция, вычитающая еденицу, при нажатии на "минус" */
    fun minusD(minus: Button) {
        minus.setOnAction {
            val currentNum = if (numberDice.text.toString().toInt() > 1) (numberDice.text.toString()
                .toInt() - 1).toString() else 1.toString()
            numberDice.text = currentNum
        }
    }

    /* инициализация */
    @FXML
    private fun initialize() {
        numberDice.text = 10.toString()
        plusD(plusDice)
        minusD(minusDice)
        Context().getInstance().setMainController(this)

        startGame.setOnAction {

            val loader = FXMLLoader(MainApplication::class.java.getResource("playingField.fxml"))
            val scene = Scene(loader.load())
            val stage = Stage()
            stage.scene = scene
            stage.isResizable = false
            stage.initModality(Modality.APPLICATION_MODAL)
            stage.icons.add(Image("logo.png"))
            startGame.scene.window.hide()
            stage.show()
        }

        /* кнопка вызода из программы */
        exit.setOnAction {
            val alert = Alert(Alert.AlertType.CONFIRMATION)
            alert.title = "Подтвердите выход"
            alert.headerText = "Выйти из игры?"
            alert.showAndWait().filter { r -> r == ButtonType.OK }
                .ifPresent { Platform.exit() }
        }
    }
}