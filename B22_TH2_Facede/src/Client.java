public class Client {
    public static void share(String message) {
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(), new Facebook(), new LinkedIn());
        socialMediaFacade.share(message);
    }
}
