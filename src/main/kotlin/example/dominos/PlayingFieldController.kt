package example.dominos

import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.image.ImageView
import javafx.scene.layout.GridPane
import javafx.stage.Modality
import javafx.stage.Stage
import model.Domino

open class PlayingFieldController : MainController() {

    val listDomino = mutableListOf<Domino>()
    val mainCont = Context().getInstance().getMainController()
    var maxLength = 0

    @FXML
    lateinit var numberDomino: Label

    @FXML
    lateinit var comeBack: Button

    @FXML
    lateinit var count: Label

    @FXML
    lateinit var five: ImageView

    @FXML
    lateinit var fiveSix: ImageView

    @FXML
    lateinit var four: ImageView

    @FXML
    lateinit var fourFive: ImageView

    @FXML
    lateinit var fourSix: ImageView

    @FXML
    var gameField: GridPane = GridPane()

    @FXML
    lateinit var one: ImageView

    @FXML
    lateinit var oneFive: ImageView

    @FXML
    lateinit var oneFour: ImageView

    @FXML
    lateinit var oneSix: ImageView

    @FXML
    lateinit var oneThree: ImageView

    @FXML
    lateinit var oneTwo: ImageView

    @FXML
    lateinit var restart: Button

    @FXML
    lateinit var six: ImageView

    @FXML
    lateinit var three: ImageView

    @FXML
    lateinit var threeFive: ImageView

    @FXML
    lateinit var threeFour: ImageView

    @FXML
    lateinit var threeSix: ImageView

    @FXML
    lateinit var two: ImageView

    @FXML
    lateinit var twoFive: ImageView

    @FXML
    lateinit var twoFour: ImageView

    @FXML
    lateinit var twoSix: ImageView

    @FXML
    lateinit var twoThree: ImageView

    @FXML
    lateinit var zero: ImageView

    @FXML
    lateinit var zeroFive: ImageView

    @FXML
    lateinit var zeroFour: ImageView

    @FXML
    lateinit var zeroOne: ImageView

    @FXML
    lateinit var zeroSix: ImageView

    @FXML
    lateinit var zeroThree: ImageView

    @FXML
    lateinit var zeroTwo: ImageView

    /*  Кнопки clickNN() - кнопка выбора нужной домино.
    *   Нажатая домино добавляется в список выбнанных домино,
    *   затем этот список идет на обработку в функцию
    *   checkingCompatibility(listDomino).
    *   При нажатии на кнопку она исчезает и у нее подключается параметр
    *   onMouseClicked = null, говорящий, что она больше не будет отвечать на нажатие кнопки
    */

    @FXML
    fun click00() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(0, 0, zero))
            zero.opacity = 0.0
        }
        zero.onMouseClicked = null
    }

    @FXML
    fun click01() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(0, 1, zeroOne))
            zeroOne.opacity = 0.0
        }
        zeroOne.onMouseClicked = null
    }

    @FXML
    fun click02() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(0, 2, zeroTwo))
            zeroTwo.opacity = 0.0
        }
        zeroTwo.onMouseClicked = null
    }

    @FXML
    fun click03() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(0, 3, zeroThree))
            zeroThree.opacity = 0.0
        }
        zeroThree.onMouseClicked = null
    }

    @FXML
    fun click04() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(0, 4, zeroFour))
            zeroFour.opacity = 0.0
        }
        zeroFour.onMouseClicked = null
    }

    @FXML
    fun click05() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(0, 5, zeroFive))
            zeroFive.opacity = 0.0
        }
        zeroFive.onMouseClicked = null
    }

    @FXML
    fun click06() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(0, 6, zeroSix))
            zeroSix.opacity = 0.0
        }
        zeroSix.onMouseClicked = null
    }

    @FXML
    fun click11() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(1, 1, one))
            one.opacity = 0.0
        }
        one.onMouseClicked = null
    }

    @FXML
    fun click12() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(1, 2, oneTwo))
            oneTwo.opacity = 0.0
        }
        oneTwo.onMouseClicked = null
    }

    @FXML
    fun click13() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(1, 3, oneThree))
            oneThree.opacity = 0.0
        }
        oneThree.onMouseClicked = null
    }

    @FXML
    fun click14() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(1, 4, oneFour))
            oneFour.opacity = 0.0
        }
        oneFour.onMouseClicked = null
    }

    @FXML
    fun click15() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(1, 5, oneFive))
            oneFive.opacity = 0.0
        }
        oneFive.onMouseClicked = null
    }

    @FXML
    fun click16() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(1, 6, oneSix))
            oneSix.opacity = 0.0
        }
        oneSix.onMouseClicked = null
    }

    @FXML
    fun click22() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(2, 2, two))
            two.opacity = 0.0
        }
        two.onMouseClicked = null
    }

    @FXML
    fun click23() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(2, 3, twoThree))
            twoThree.opacity = 0.0
        }
        twoThree.onMouseClicked = null
    }

    @FXML
    fun click24() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(2, 4, twoFour))
            twoFour.opacity = 0.0
        }
        twoFour.onMouseClicked = null
    }

    @FXML
    fun click25() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(2, 5, twoFive))
            twoFive.opacity = 0.0
        }
        twoFive.onMouseClicked = null
    }

    @FXML
    fun click26() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(2, 6, twoSix))
            twoSix.opacity = 0.0
        }
        twoSix.onMouseClicked = null
    }


    @FXML
    fun click33() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(3, 3, three))
            three.opacity = 0.0
        }
        three.onMouseClicked = null
    }

    @FXML
    fun click34() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(3, 4, threeFour))
            threeFour.opacity = 0.0
        }
        threeFour.onMouseClicked = null
    }

    @FXML
    fun click35() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(3, 5, threeFive))
            threeFive.opacity = 0.0
        }
        threeFive.onMouseClicked = null
    }

    @FXML
    fun click36() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(3, 6, threeSix))
            threeSix.opacity = 0.0
        }
        threeSix.onMouseClicked = null
    }

    @FXML
    fun click44() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(4, 4, four))
            four.opacity = 0.0
        }
        four.onMouseClicked = null
    }

    @FXML
    fun click45() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(4, 5, fourFive))
            fourFive.opacity = 0.0
        }
        fourFive.onMouseClicked = null
    }

    @FXML
    fun click46() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(4, 6, fourSix))
            fourSix.opacity = 0.0
        }
        fourSix.onMouseClicked = null
    }

    @FXML
    fun click55() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(5, 5, five))
            five.opacity = 0.0
        }
        five.onMouseClicked = null
    }

    @FXML
    fun click56() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(5, 6, fiveSix))
            fiveSix.opacity = 0.0
        }
        fiveSix.onMouseClicked = null
    }

    @FXML
    fun click66() {
        if (getNumberDominoToInt() > 0) {
            addToSelected(Domino(6, 6, six))
            six.opacity = 0.0
        }
        six.onMouseClicked = null
    }

    // функция передающая выбранное количество домино
    @FXML
    fun passDomino() {
        numberDomino.text = mainCont.getNumberDice().text
    }

    /*
    преобразование количество выбранных домино из String -> Int
    для дальнейшей работы с числом  */
    @FXML
    fun getNumberDominoToInt(): Int {
        return numberDomino.text.toString().toInt()
    }

    /* вычитание единицы number - количество выбранных домино */
    @FXML
    fun dec(number: Label): Label {
        number.text = (number.text.toString().toInt() - 1).toString()
        return number
    }

    @FXML
    // добавление выбранных домино в список
    fun addToSelected(domino: Domino) {
        if (getNumberDominoToInt() > 0) {
            dec(numberDomino)
            listDomino.add(domino)
        }
        if (getNumberDominoToInt() == 0) {
            val sortedList = checkingCompatibility(listDomino)
            addToField(sortedList)
        }
    }

    /* функция, проверяющая все выбранные домино и формирует выходной список,
    *  в котором расположенны поочереди все опдходящие домино */
    @FXML
    fun checkingCompatibility(list: List<Domino>): List<Domino> {

        var currentMaxLength = 0
        val resultSequenceDomino = mutableListOf<Domino>()
        val currentSequenceDomino = mutableListOf<Domino>()
        val setDiscardedDomino = mutableSetOf<Domino>()

        for (domino in list) {

            currentSequenceDomino.add(domino)
            val newListDomino =
                list.subList(list.indexOf(domino) + 1, listDomino.size) // список домино без первого элемента
            var leftN = domino.getLeftVal()
            var rightN = domino.getRightVal()

            for (nextDomino in newListDomino) {

                val dominoIsDouble = nextDomino.isDouble()

                if (dominoIsDouble) {
                    val rnd = nextDomino.rotate90()
                    if (rightN == nextDomino.getRightVal() && rightN == nextDomino.getLeftVal()) {
                        currentSequenceDomino.add(rnd)
                    }
                } else if (dominoIsDouble) {
                    val rnd = nextDomino.rotate90()
                    if (leftN == nextDomino.getLeftVal() && leftN == nextDomino.getRightVal()) {
                        currentSequenceDomino.add(0, rnd)
                    }
                } else if (rightN == nextDomino.getLeftVal()) {
                    currentSequenceDomino.add(nextDomino)
                    rightN = nextDomino.getRightVal()
                } else if (rightN == nextDomino.getRightVal()) {
                    val nd = nextDomino.flip()
                    nd.imageView?.rotate = -180.0
                    currentSequenceDomino.add(nd)
                    rightN = nd.getRightVal()
                } else if (leftN == nextDomino.getRightVal()) {
                    currentSequenceDomino.add(0, nextDomino)
                    leftN = nextDomino.getLeftVal()
                } else if (leftN == nextDomino.getLeftVal()) {
                    val nd = nextDomino.flip()
                    nd.imageView?.rotate = -180.0
                    currentSequenceDomino.add(0, nd)
                    leftN = nd.getLeftVal()
                }
            }
            // обновил новый максимум и сохранил его
            currentMaxLength = currentSequenceDomino.size
            if (currentMaxLength > maxLength) {
                maxLength = currentMaxLength
                resultSequenceDomino.clear()
                resultSequenceDomino.addAll(currentSequenceDomino)
                currentSequenceDomino.clear()
            }
            count.text = maxLength.toString()
            currentSequenceDomino.clear() // освободили текущую последовательность для прохода след. домино
        }
        for (d in list) {
            if (resultSequenceDomino.contains(d)) continue
            else setDiscardedDomino.add(d)
        }
        return resultSequenceDomino
    }

    /* Функция выводящая домино на "ировое поле".
    *  Принимает отсортированный список домино и отображает их.
    *  */
    @FXML
    fun addToField(listDomino: List<Domino>) {
        val valueCount = count.text.toString().toInt()
        var down = 2
        if (valueCount <= 14) {
            for (item in 0..valueCount) {
                val imageView = listDomino[item].getImageView()
                if (imageView != null) {
                    imageView.opacity = 1.0
                }
                gameField.add(imageView, item, 8)
            }
        } else {
            for (item in 0 until 15) {
                val imageView = listDomino[item].getImageView()
                if (imageView != null) {
                    imageView.opacity = 1.0
                }
                gameField.add(imageView, item, 1)
            }
            for (item in 15..valueCount) {
                val imageView = listDomino[item].getImageView()
                if (imageView != null) {
                    imageView.opacity = 1.0
                    imageView.rotate = 90.0
                }
                gameField.add(imageView, 14, down)
                down++
            }
        }
    }

    /* инициализация */
    @FXML
    fun initialize() {
        passDomino()
        Context().getInstance().setMainController(this)

        comeBack.setOnAction {
            val loader = FXMLLoader(MainApplication::class.java.getResource("firstWindow.fxml"))
            val scene = Scene(loader.load())
            val stage = Stage()
            stage.scene = scene
            stage.isResizable = false
            stage.initModality(Modality.APPLICATION_MODAL)
            comeBack.scene.window.hide()
            stage.show()
        }
    }
}