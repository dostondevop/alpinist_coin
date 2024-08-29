package uz.AlpinistEdu_Bot.BotService.control.interfaces;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;

import java.util.List;

public interface BaseInterface {

    ReplyKeyboard replyKeyboardStartMenu();
    ReplyKeyboard replyKeyboardSecondInnerMenu(String buttonName, Long chatId);
    SendMessage sendMessage(String buttonName, Long chatId);
}