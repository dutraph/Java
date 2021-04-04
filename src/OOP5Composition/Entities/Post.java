package OOP5Composition.Entities;

import java.text.SimpleDateFormat;
import java.util.*;
public class Post {

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<PostComment> postComment = new ArrayList<>();
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public Post() {
    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<PostComment> getPostContent(PostComment comment) {
        return postComment;
    }

    public void addComment(PostComment comment){
        postComment.add(comment);
    }

    public void removeComment(PostComment comment){
        postComment.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        sb.append(likes).append(" Likes  - ").append(sdf.format(moment)).append("\n");
        sb.append(content).append("\n");
        sb.append("Comments:\n");
        for (PostComment c: postComment) {
           sb.append(c.getText()).append("\n");
        }
        return sb.toString();
    }
}