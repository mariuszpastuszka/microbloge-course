package pl.mpas.microbloge_course.service;

import pl.mpas.microbloge_course.dao.UserPostDao;

public class UserPostService {
    // TODO:MP replace with repository
    private UserPostDao postDao;

    public UserPostService() {
        // empty
    }

    public UserPostService(UserPostDao postDao) {
        this.postDao = postDao;
    }

    public UserPostDao getPostDao() {
        return postDao;
    }

    public void setPostDao(UserPostDao postDao) {
        this.postDao = postDao;
    }

    @Override
    public String toString() {
        return "UserPostService{" +
                "postDao=" + postDao +
                '}';
    }
}
