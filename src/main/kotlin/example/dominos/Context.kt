package example.dominos

/* класс Context, позволяющий передавать данные из одного label
 * в другой label, находящийся в другом контроллере */

open class Context {
    companion object {
        val instance = Context()
    }

    fun getInstance(): Context {
        return instance
    }

    private lateinit var controller: MainController
    fun setMainController(controller: MainController) {
        this.controller = controller
    }

    fun getMainController(): MainController {
        return controller
    }

    private  var playingFieldController: PlayingFieldController? = null
    fun setPlayFieldController(playingFieldController: PlayingFieldController) {
        this.playingFieldController = playingFieldController
    }

    fun getPlayFieldController(): PlayingFieldController? {
        return playingFieldController
    }
}