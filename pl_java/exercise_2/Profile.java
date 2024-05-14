package pl_java.exercise_2;

public class Profile {

/*
 * Attributes
 */
    String name;
    String countryCode;
    String phoneNo;
    String profilePhotoUrl;
    String about;
    String lastSeen;


/*
 * Constructors
 */


/*
 * Getters
 */


/*
 * Setters
 */
    public void setName(String name){
            this.name = name;
    }

    public void setPhoneNo(String countryCode, String phoneNo){
            this.countryCode = countryCode;
            this.phoneNo = phoneNo;
    }

    public void setProfilePhotoUrl(String profilePhotoUrl){
        this.profilePhotoUrl = profilePhotoUrl;
    }

    public void setAbout(String about){
            this.about = about;
    }


/*
 * Methods
 */
    public void updateLastSeen(String lastSeen){
            this.lastSeen = lastSeen;
    }
}