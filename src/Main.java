import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String myString = "Nick x Sean x Fido x Sara";
        //split cuts right before whatever you split on and right after, stuff in the string is removed
        String[] splitString = myString.split(" x ");
        System.out.println(Arrays.toString(splitString));


        //this will print some empty strings because the 's' is twice in a row
        //this happens because it's empty between the two 's' characters
        String river = "Mississippi";
        String[] splitIt = river.split("s");
        System.out.println(Arrays.toString(splitIt));


        //subStrings
        String myFavorites = "cheeselegocandyballoons";
        //start index inclusive, stop index exclusive, number difference is length of string
        String favoritePart = myFavorites.substring(6, 10);
        System.out.println(favoritePart);

        //subStrings with regex (regular expressions)
        String myRivers = "MississippiMississippiMississippi";
        //takes the parts between the first and last parts
        Pattern p = Pattern.compile("Mi(.*?)pi");
        Matcher m = p.matcher(myRivers);

        while (m.find()) {
            System.out.println(m.group(1));
        }

        //practice with html example, get the URL, get the celebrity name
        String html = "<div class=\"image\"><img src=\"http://cdn.posh24.se/images/:profile/0ecaee6d0139afcad8da914c5c495ca44\" alt=\"Lindsay Lohan\"/></div>";
        Pattern p2 = Pattern.compile("<img src=\"(.*?)\"");
        Matcher m2 = p2.matcher(html);
        while(m2.find()) {
            System.out.println("Image URL: " + m2.group(1));
        }

        p2 = Pattern.compile("alt=\"(.*?)\"");
        m2 = p2.matcher(html);
        while(m2.find()) {
            System.out.println("Celebrity Name: " + m2.group(1));
        }
    }
}
