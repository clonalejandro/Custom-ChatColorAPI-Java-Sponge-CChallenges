package me.clonalejandro.Minemcore.utils.api.colors;

import org.spongepowered.api.text.format.TextColor;

/**
 * Created by alejandrorioscalera on 18/4/17.
 */

public enum ChatColor {


    /** ENUMS **/

    BLACK(ChatManager.Color().BLACK()),
    DARK_BLUE(ChatManager.Color().DARK_BLUE()),
    DARK_GREEN(ChatManager.Color().DARK_GREEN()),
    DARK_AQUA(ChatManager.Color().DARK_AQUA()),
    DARK_RED(ChatManager.Color().DARK_RED()),
    DARK_PURPLE(ChatManager.Color().DARK_PURPLE()),
    GOLD(ChatManager.Color().GOLD()),
    GRAY(ChatManager.Color().GRAY()),
    DARK_GRAY(ChatManager.Color().DARK_GRAY()),
    BLUE(ChatManager.Color().BLUE()),
    GREEN(ChatManager.Color().GREEN()),
    AQUA(ChatManager.Color().AQUA()),
    RED(ChatManager.Color().RED()),
    LIGHT_PURPLE(ChatManager.Color().LIGHT_PURPLE()),
    YELLOW(ChatManager.Color().YELLOW()),
    WHITE(ChatManager.Color().WHITE());


    /** SMALL CONSTRUCTORS **/

    private TextColor type;

    ChatColor(TextColor color){
        this.type = color;
    }


}
