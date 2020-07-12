package guru.springframework.config;

public class DataSourceConfiguration {

    String firstName;

    String password;

    String url;

    public DataSourceConfiguration(String firstName, String password, String url) {
        this.firstName = firstName;
        this.password = password;
        this.url = url;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + "\npassword: " + password + "\nurl: " + url;
    }
}
