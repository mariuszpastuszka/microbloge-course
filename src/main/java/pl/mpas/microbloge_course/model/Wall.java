package pl.mpas.microbloge_course.model;

import java.util.List;

public class Wall {
    private List<UserPost> wallPosts;

    public Wall() {
        // empty
    }

    public Wall(List<UserPost> wallPosts) {
        this.wallPosts = wallPosts;
    }

    public List<UserPost> getWallPosts() {
        return wallPosts;
    }

    public void setWallPosts(List<UserPost> wallPosts) {
        this.wallPosts = wallPosts;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "wallPosts=" + wallPosts +
                '}';
    }
}
