package model
import javafx.scene.image.ImageView

/* класс Domino */
class Domino(left: Int, right: Int, var imageView: ImageView?) {
    val min = 0
    val max = 6

    private var leftVal = min
    private var rightVal = min
    private var isDouble = false

    // мнеятет местами левое и правое значения и переворачивает картинку на 180 градусов
    fun flip(): Domino {
        val temp = rightVal
        rightVal = leftVal
        leftVal = temp
        return Domino(leftVal, rightVal, imageView)
    }

    /* поворачивает домино на 90 градусов */
    fun rotate90(): Domino {
        imageView?.rotate = 90.0
        return Domino(leftVal, rightVal, imageView)
    }

    @JvmName("setImageView1")
    fun setImageView(imageView: ImageView?) {
        this.imageView = imageView
    }

    @JvmName("getImageView1")
    fun getImageView(): ImageView? {
        return imageView
    }

    override fun toString(): String {
        val leftStr: String = if (leftVal in 1..max) "[$leftVal" else "[ "
        val rightStr: String = if (rightVal in 1..max) "$rightVal]" else " ]"
        return "$leftStr|$rightStr"
    }

    fun toValue(): String {
        var left = ""
        var right = ""
        left += leftVal
        right += rightVal
        return left + right
    }

    companion object {
        const val min = 0 //minimum value of numbers on domino
        const val max = 6 //maximum value of numbers on domino
    }


    fun getLeftVal(): Int = leftVal

    fun getRightVal(): Int = rightVal

    fun isDouble(): Boolean = isDouble


    init {
        if (left in min..max) {
            leftVal = left
        }
        if (right in min..max) {
            rightVal = right
        }
        if (right == left) {
            isDouble = true
        }
    }
}