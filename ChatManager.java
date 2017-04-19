package me.clonalejandro.Minemcore.utils.api.colors;

import org.spongepowered.api.text.format.TextColor;
import org.spongepowered.api.text.format.TextColors;

/**
 * Created by alejandrorioscalera on 18/4/17.
 */
public class ChatManager implements Colors {


    /** SMALL CONSTRUCTORS **/

    private static ChatManager chatManager;
    
    public static ChatManager Color(){
        
        return chatManager;
    }
    
    
    /** REST **/

    @Override
    public TextColor BLACK(){
        return TextColors.BLACK;
    }

    @Override
    public TextColor DARK_BLUE(){
        return TextColors.DARK_BLUE;
    }

    @Override
    public TextColor DARK_GREEN(){
        return TextColors.DARK_GREEN;
    }

    @Override
    public TextColor DARK_AQUA(){
        return TextColors.DARK_AQUA;
    }

    @Override
    public TextColor DARK_RED(){
        return TextColors.DARK_RED;
    }

    @Override
    public TextColor DARK_PURPLE(){
        return TextColors.DARK_PURPLE;
    }

    @Override
    public TextColor GOLD(){
        return TextColors.GOLD;
    }

    @Override
    public TextColor GRAY(){
        return TextColors.GRAY;
    }

    @Override
    public TextColor DARK_GRAY(){
        return TextColors.DARK_GRAY;
    }

    @Override
    public TextColor BLUE() {
        return TextColors.BLUE;
    }

    @Override
    public TextColor GREEN() {
        return TextColors.GREEN;
    }

    @Override
    public TextColor AQUA() {
        return TextColors.AQUA;
    }

    @Override
    public TextColor RED() {
        return TextColors.RED;
    }

    @Override
    public TextColor LIGHT_PURPLE() {
        return TextColors.LIGHT_PURPLE;
    }

    @Override
    public TextColor YELLOW() {
        return TextColors.YELLOW;
    }

    @Override
    public TextColor WHITE() {
        return TextColors.WHITE;
    }


}
