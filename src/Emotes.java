public enum Emotes {

    TOBEY_CRYING("<:Tobeycrying:793614814353817601>"),

    MISSED_THE_PART_WHERE_THATS_MY_PROBLEM("<:MissedThePartWhereThatsMyProblem:793613832585084968>"),

    GET_RIGHT_BACK_ON_THE_HORSE01("<:Getrightbackonthehorse01:793756106785685514>"),

    STILL_GOT_THE_MOVES("<:Stillgotthemoves:793757070112718878>"),

    DANCE_2("<:dance2:793781835502321664>"),

    DARTH_BULLY_MAGUIRE("<:DarthBullyMaguire:793610029609386004>"),

    YOU_SERIOUS("<:Youserious:793620809457205258>"),

    GIVE_ME_RENT("<:givemerent:793761108602388480>"),

    AH_ROSIE_I_LOVE_THIS_BOY("<:AhRosieIlovethisboy:793618536445509652>"),

    JAMESON_LAUGH("<:JamesonLaugh:793619831261888513>"),

    EVIL_SMILE("<:Evilsmile:793776502386851890>"),

    FINGER_GUN("<:fingergun:793786040267178004>"),

    SCREAM("<:Scream:793624409621397534>"),

    DANCE_WITH_HJOLNIR("<:DancewithMjolnir:793611095109140481>"),

    ACCOMPLISHED_SMILE("<:Accomplishedsmile:793785722616283137>"),

    SOMETHING_OF_A_SCIENTIST_MYSELF("<:SomethingOfAScientistMyself:793612151075504138>"),

    PIZZA_TIME("<:PizzaTime:793617647266037791>"),

    SO_GOOD("<:Sogood:793764902540017665>"),

    HEY_EVERYONE("<:Heyeveryone:793615419532378172>"),

    THIS_IS_SOMETHING_ELSE("<:thisissomethingelse:793759697977999411>"),

    WOOHOO("<:woohoo:793837476703633438>"),

    YOU_SHOULD_HAVE_THOUGHT_OF_THAT_EARLIER("<:YouShouldOfThoughtOfThatEarlier:793775224288968715>"),

    FINGER_GUNS_2("<:fingerguns2:793787708014198804>"),

    I_HAD_TO_BEAT_AN_OLD_LADY_WITH_A_STICK("<:IHadToBeatAnOldLadyWithAStick:793616544089243709>"),

    IM_GONNA_PUT_SOME_DIRT_IN_YOUR_EYE("<:Imgonnaputsomedirtinyoureye:793768271501197322>"),

    THEY_LOVE_ME("<:theyloveme:793785492344143873>"),

    WEIRD_FACE("<:Wierdface:793753992470462474>"),

    STING_DOESNT_IT("<:stingsdoesntit:793766706492735508>"),

    I_DONT_REALY_KNOW("<:Idontreallyknow:793619241290039346>"),

    FIX_THIS_DAMN_DOOR("<:fixthisdamndoor:793762348565135360>"),

    STRAWBERRIES("<:strawberries:793765846807609355>"),

    GONNA_CRY("<:gonnacry:793767159397482517>"),

    I_DONT_BELIEVE_YOU("<:Idontbelieveyou:793764369511088138>"),

    SNAP("<:Snap:793794162524684290>"),

    HOTDOG("<:Hotdog:793622070093283338>"),

    SEE_YA_CHUMP("<:Seeyachump:793760358560432171>"),

    NO_NOT_EXACTLY("<:Nonotexactly:793612975050719253>"),

    I_NEVER_THOUGHT_HED_REALLY_DO_THAT("<:INeverThoughtHedReallyDoThat:793770051709698108>"),

    FINGER_GUNS_1("<:fingerguns1:793782615701979147>"),

    YEAH_GREAT("<:Yeahgreat:793755123968901180>"),

    DANCE_3("<:dance3:793794961098276874>"),

    PLEASE_DONT_DAY_THAT("<:pleasedontsaythat:793763776511344661>"),

    I_GUESS_IVE_BECOME_SOMETHING_OF_AN_ICON("<:IGuessIveBecomeSomethingOfAnIcon:793758860782338048>"),

    OF_COURSE_NOT("<:ofcoursenot:793777244170223646>"),

    YOU_WANT_FORGIVENESS_GET_RELIGION("<:YouWantForgivenessGetReligion:93774399307251733>"),

    IM_BACK("<:Imback:793622731517591604>"),

    DANCE_1("<:dance1:793780565886894101>");



    private String id;

    Emotes(String id) {
        this.id = id;
    }

    public String getID() {
        return id;
    }

    /** returns the ID without > at the end because reactions don't use it*/
    public String getIDForReaction() {
        return id.replace(">","");
    }
}
