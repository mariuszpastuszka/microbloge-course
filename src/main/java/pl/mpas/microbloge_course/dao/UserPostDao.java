package pl.mpas.microbloge_course.dao;

import pl.mpas.microbloge_course.model.UserPost;

public interface UserPostDao {
    public boolean addNewPost(UserPost newPost);
    public boolean updatePost(UserPost userPost);
    public boolean deletePost(UserPost userPost);
}
