package by.khmel.dealerstat.service;

import by.khmel.dealerstat.entity.Advert;
import by.khmel.dealerstat.entity.Comment;
import by.khmel.dealerstat.entity.Profile;
import by.khmel.dealerstat.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfileService {
    private final AdvertService advertService;
    private final CommentService commentService;

    @Autowired
    public ProfileService(AdvertService advertService, CommentService commentService) {
        this.advertService = advertService;
        this.commentService = commentService;
    }

    public Profile getUserProfile(User user) {
        List<Advert> advertList = advertService.getUserAdverts(user.getUsername());
        List<Comment> commentList = commentService.getUserComments(user.getUsername());
        return new Profile(user, advertList, commentList);
    }


    public List<Profile> getAllUsersProfile(List<User> users) {
        List<Profile> allUsersProfilesList = new ArrayList<>();
        for (User user : users) {
            allUsersProfilesList.add(getUserProfile(user));
        }
        return allUsersProfilesList.stream().sorted(Comparator.comparing(Profile::getRating).reversed()).collect(Collectors.toList());
    }
}
