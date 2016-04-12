package gwt.material.design.demo.client.application.addins.autocomplete.base;

import com.google.gwt.user.client.ui.SuggestOracle;

/**
 * Created by Mark Kevin on 4/12/2016.
 */
public class UserSuggestion implements SuggestOracle.Suggestion {

    private User user;

    public UserSuggestion(User user) {
        this.user = user;
    }

    @Override
    public String getDisplayString() {
        return getReplacementString();
    }

    @Override
    public String getReplacementString() {
        return user.getName();
    }

    public User getUser() {
        return user;
    }
}

