import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Reactor extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        if(!event.getAuthor().isBot()) {
            if(event.getMessage().getContentRaw().toLowerCase().contains("pog")) {
                    event.getMessage().addReaction(Emotes.WOOHOO.getIDForReaction()).complete();
            }
        }
    }
}
