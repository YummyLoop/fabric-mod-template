package yummyloop.template.config

import me.sargunvohra.mcmods.autoconfig1u.ConfigData
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config
import yummyloop.template.TemplateMod

// For reference see :
//https://shedaniel.gitbook.io/cloth-config/auto-config/introduction-to-auto-config-1u
@Config(name = TemplateMod.id)
class ModConfig : ConfigData{
    var a : Boolean = true
    var b : Boolean = false
}