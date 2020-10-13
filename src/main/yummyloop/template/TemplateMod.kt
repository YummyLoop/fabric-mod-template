package yummyloop.template

import net.fabricmc.api.ModInitializer
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import yummyloop.template.config.ModConfigSetup

object TemplateMod : ModInitializer {
    const val id : String = "TemplateMod"
    private val logger: Logger = LogManager.getLogger(id)
    val modConfig = ModConfigSetup()

    override fun onInitialize() {
        logger.info("**************************")
        logger.info("      Hello World !       ")
        logger.info("**************************")

    }
}