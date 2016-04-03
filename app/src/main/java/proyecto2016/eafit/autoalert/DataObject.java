package proyecto2016.eafit.autoalert;

public class DataObject {
    String name;
    String age;
    int photoId;

    public static final String LOGIN_URL = "http://webserverandroid.site88.net/UserRegistration/volleyLogin.php";
    public static final String REGISTER_URL = "http://webserverandroid.site88.net/UserRegistration/volleyRegister.php";
    public static final String KEY_USERNAME = "username";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_PASSWORD = "password";
    public static final String LOGIN_SUCCESS = "success";
    public static final String REGISTRE_SUCCESS = "successfully registered";
    public static final String SHARED_PREF_NAME = "myloginapp";
    public static final String EMAIL_SHARED_PREF = "email";
    public static final String LOGGEDIN_SHARED_PREF = "loggedin";

    public DataObject(String name, String age, int photoId) {
        this.name = name;
        this.age = age;
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getPhoto() {
        return photoId;
    }

}
