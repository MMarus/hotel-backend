package eu.mmarusic.hotel.backend.data;

/**
 * Created by Marek Marusic <mmarusic@redhat.com> on 3/28/18.
 */
public class UserrAndToken {
    private Userr user;
    private String authToken;

    public UserrAndToken() {}

    public UserrAndToken(Userr user, String authToken) {
        this.user = user;
        this.authToken = authToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserrAndToken that = (UserrAndToken) o;

        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        if (authToken != null ? !authToken.equals(that.authToken) : that.authToken != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = user != null ? user.hashCode() : 0;
        result = 31 * result + (authToken != null ? authToken.hashCode() : 0);
        return result;
    }

    public Userr getUserr() {
        return user;
    }

    public void setUserr(Userr user) {
        this.user = user;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}
