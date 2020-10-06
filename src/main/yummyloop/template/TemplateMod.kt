package yummyloop.template

import net.fabricmc.api.ModInitializer
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

class TemplateMod : ModInitializer {

    private val logger: Logger = LogManager.getFormatterLogger("LoggerTest")

    override fun onInitialize() {
        logger.info("**************************")
        logger.info("      Hello World !       ")
        logger.info("**************************")

    }
}