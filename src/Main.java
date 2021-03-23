import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main {
    private static final String TOKEN = Token.TOKEN;
    public static void main(String[] args) throws LoginException {
        JDA jda = new JDABuilder(AccountType.BOT)
                .createDefault(TOKEN)
                .setStatus(OnlineStatus.DO_NOT_DISTURB)
                .setActivity(Activity.playing("Putting dirt in your eyes"))
                .build();
        jda.addEventListener(new Responder());
        jda.addEventListener(new Reactor());
    }
}
