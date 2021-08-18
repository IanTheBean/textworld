package textworld;

import java.util.Random;

public class Grammar {
    private static String[][] sentences = new String[][]{
            new String[]{},new String[]{},
            new String[]{
                    "you see [sight]. When you hear [sound], you turn towards the noise and see [sight]"
            },
            new String[]{
                    "you get a faint waft of [smell] as you stand in between [sight] and [sight] past [sight]"
            },
            new String[]{
                    "the air smells of [smell], [smell], and faintly of [smell]. A few feet ahead of you is [sight], and to your left [sight]"
            },
            new String[]{
                    "you look to your right and see a [sight]. It is a nice break from the [sight] and [sight] you are so used to seeing. Also you notice [sound] for the first time in a while. Smells of [smell] and [smell] fill the air."
            },

    };
    public static String getSentenceTemplate(int complexity){
        String[] templates = sentences[complexity - 1];
        Random rand = new Random();
        return templates[rand.nextInt(templates.length)];
    }
}
    