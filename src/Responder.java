import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * This class reads the chat messages and responses based on pre-defined values
 */
public class Responder extends ListenerAdapter {

    /**
     *  the character that is used to define multiple options for triggers and responses in the same String
     *  This should not be a character that is meant to be said or used by the bot
     */
    private static final String splitter = "/";
    private String authorID;
    private String botID;
    //private static final String MATAN_SERVER_ID = "793572404579794986";

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {

        // checks if the person who triggers the event is a human
        // this is done to avoid infinite loops and bot discussions
        if (!event.getAuthor().isBot()) {
            String message = event.getMessage().getContentRaw().toLowerCase();
            String response = "";
            HashMap<String, String> reactions = new HashMap<>();

            authorID = event.getAuthor().getId();
            botID = event.getJDA().getSelfUser().getId();

            reactions.put("rent", "You'll get your rent when you FIX THIS DAMN DOOR" + splitter + "Leave me alone" + splitter +
                    "I'm sorry <@" + authorID + "> all I got is this 20 for the rest of the week" + splitter + "Not now");
            reactions.put(Emotes.YOU_SERIOUS.getID() + splitter + Emotes.JAMESON_LAUGH.getID(), "Could you pay me in advance?");
            reactions.put("bye" + splitter + "see ya" + splitter + "goodbye" + splitter + "cya", "See ya chump");
            reactions.put("sorry" + splitter + "apology", "You want forgiveness? Get religion" + splitter + "I forgive you");
            reactions.put(Emotes.DANCE_1.getID() + splitter + Emotes.DANCE_2.getID() + splitter + Emotes.DANCE_3.getID(),
                    "Still got the moves" + splitter + Emotes.DANCE_1.getID() + splitter + Emotes.DANCE_2.getID() + splitter + Emotes.DANCE_3.getID() + splitter + Emotes.STILL_GOT_THE_MOVES.getID());
            reactions.put(Emotes.TOBEY_CRYING.getID(), Emotes.GONNA_CRY.getID());
            reactions.put(Emotes.GONNA_CRY.getID(), Emotes.TOBEY_CRYING.getID());
            reactions.put("stop", "Look at little <@" + authorID + "> junior, gonna cry?" + splitter + Emotes.GONNA_CRY.getID());
            reactions.put("pog", Emotes.WOOHOO.getID());
            reactions.put("MJ" + splitter + "Mary Jane", "Mary Jane Watson the girl I've loved since before I even liked girls");
            reactions.put("Ditkovitch", Emotes.SCREAM.getID());
            reactions.put("pizza" + splitter + "time", "pizza time" + splitter + Emotes.PIZZA_TIME.getID());
            reactions.put("ouch" + splitter + "Stings", "Stings doesn't it?" + splitter + Emotes.STING_DOESNT_IT.getID());
            reactions.put("Money" + splitter + "cash" + splitter + "doller" + splitter + "buck", "100 bucks? The ad said 300");
            reactions.put("hello" + splitter + "good morning" + splitter + "Hey",
                    "Hey <@" + authorID + ">! Sorry, I'm late it's a jungle out there I had to beat an old lady with a stick." + splitter + Emotes.HEY_EVERYONE.getID());
            reactions.put("dirt", "I'm gonna put some dirt in your eyes" + splitter + Emotes.IM_GONNA_PUT_SOME_DIRT_IN_YOUR_EYE.getID());
            reactions.put("orange", "no thanks");
            reactions.put("oh", "oh boy yeah");
            reactions.put("your fired", "you're*");
            reactions.put("hotdog",Emotes.HOTDOG.getID());

            //TODO: make this work
                // will only mute people if in Matan's discord
//            if(event.getGuild().getId() == MATAN_SERVER_ID)
//                reactions.put("you're fired", "?mute <@" + authorID + "> 1 no u");

            //checks if the entered message matches a value in the list
            for (Map.Entry<String, String> reaction : reactions.entrySet()) {
                // if one response has many trigger we need to check them all
                String[] subReactions = reaction.getKey().split(splitter);
                for (String subReaction : subReactions) {
                    if (message.toLowerCase().contains(subReaction.toLowerCase())) {
                        response = reaction.getValue();
                    }
                }
            }

            //if the code does not check this the bot will say it is typing all the time
            if (!response.equals("")) {
                // the code selects a random response from the responses for the trigger
                response = response.split(splitter)[new Random().nextInt(response.split(splitter).length)];

                // if it does not already mention the user than it will mention him at the end
                if(!response.contains("@"))
                    response += " <@" + authorID + ">";
                event.getChannel().sendTyping().queue();
                event.getChannel().sendMessage(response).complete();
            }
        }
    }
}
