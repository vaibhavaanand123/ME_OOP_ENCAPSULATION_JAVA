package pl_java.exercise_2;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;

public class Profile {

        /*
         * Attributes
         */
        private String name;
        private String countryCode;
        private String phoneNo;
        private URI profilePhotoUrl;
        private String about;
        private LocalDateTime lastSeen;

        /*
         * Constructors
         */
        public Profile(String name, String countryCode, String phoneNo, String profilePhotoUrl) throws URISyntaxException{
                setName(name);
                setPhoneNo(countryCode, phoneNo);
                setProfilePhotoUrl(profilePhotoUrl);
                this.lastSeen = LocalDateTime.now();
        }

        public Profile(String name, String countryCode, String phoneNo) throws URISyntaxException{
                setName(name);
                setPhoneNo(countryCode, phoneNo);
                setProfilePhotoUrl("https://pps.whatsapp.net/v/noDp.jpg");
                this.lastSeen = LocalDateTime.now();
                setAbout("Hey there! I an using WhatsApp");
        }

        /*
         * Getters
         */
        public String getName() {
                return name;
        }

        public String getCountryCode() {
                return countryCode;
        }

        public String getPhonNo() {
                return phoneNo;
        }

        public String getProfilePhotoUrl() {
                return profilePhotoUrl.toString();
        }

        public String getAbout() {
                return about;
        }

        public LocalDateTime getLastSeen() {
                return lastSeen;
        }

        /*
         * Setters
         */
        public void setName(String name) {
                if (name.isBlank()) {
                        System.out.println("Error!!: Name can't be blank");
                } else {
                        this.name = name;
                }
        }

        public void setPhoneNo(String countryCode, String phoneNo) {
                if (phoneNo.length() < 10) {
                        System.out.println("Error!: Enter valid phone No.");
                } else {
                        this.countryCode = countryCode;
                        this.phoneNo = phoneNo;
                }
        }

        public void setProfilePhotoUrl(String profilePhotoUrl) throws URISyntaxException {
                this.profilePhotoUrl = new URI(profilePhotoUrl);
        }

        public void setAbout(String about) {
                if (about.isBlank()) {
                        System.out.println("Error!: about cannot be Blank");
                } else {
                        this.about = about;
                }
        }

        /*
         * Methods
         */
        public void updateLastSeen(LocalDateTime lastSeen) {
                if (this.lastSeen.isAfter(lastSeen)) {
                        System.out.println("Error!: current lastseen cannot be more than input lastSeen!");
                } else {
                        this.lastSeen = lastSeen;
                }
        }
}