package OOP5Composition.Application;

import OOP5Composition.Entities.Post;
import OOP5Composition.Entities.PostComment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class ProgPost {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Post p1,p2;
        PostComment comment1P1,comment2P1, comment1P2, comment2P2;
        Date d1,d2;

        d1 = sdf.parse("21/06/2020 13:05:44");
        String title = "Traveling to New Zealand";
        String content = "I'm going to visit this wonderful country";
        Integer likes = 12;
        p1 = new Post(d1,title, content, likes);
        comment1P1 = new PostComment("Have a nice trip");
        comment2P1 = new PostComment("Wow that's awesome!");
        p1.addComment(comment1P1);
        p1.addComment(comment2P1);

        d2 = sdf.parse("28/07/2020 23:15:37");
        String titleP2 = "Good night guys";
        String contenP2 = "See you tomorrow";
        Integer likeP2 = 5;
        p2 = new Post(d2,titleP2, contenP2, likeP2);
        comment1P2 = new PostComment("May the Force be with you");
        comment2P2 = new PostComment("Good night");
        p2.addComment(comment1P2);
        p2.addComment(comment2P2);

        System.out.println("Post 1");
        System.out.println(p1);
        System.out.println();
        System.out.println("Post 2");
        System.out.println(p2);


    }
}
