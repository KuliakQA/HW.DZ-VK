package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private int data;
    private int comments;
    private int signerId;
    private int postponedId;
    private boolean friendsOnly;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private String text;
    private String copyright;
    private String postType;
    private LikesInfo likesInfo;
    private Place place;
    private ViewsInfo viewsInfo;
    private RepostsInfo repostsInfo;
    private Geo geo;
    private PostSource postSource;
    private CommentsInfo commentsInfo;
    private Donut donut;
}
