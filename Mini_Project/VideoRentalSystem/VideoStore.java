import java.util.ArrayList;

public class VideoStore {
    private ArrayList<Video> store;

    public VideoStore() {
        store = new ArrayList<>();
    }

    public void addVideo(String name) {
        store.add(new Video(name));
    }

    public void doCheckout(String name) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.doCheckout();
                System.out.println(name + " has been checked out.");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void doReturn(String name) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.doReturn();
                System.out.println(name + " has been returned.");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void receiveRating(String name, int rating) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.receiveRating(rating);
                System.out.println("Rating " + rating + " has been set for " + name);
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void listInventory() {
        System.out.println("\nCurrent Inventory:");
        for (Video v : store) {
            System.out.println("Name: " + v.getName() + 
                               ", Checked out: " + v.getCheckout() + 
                               ", Rating: " + v.getRating());
        }
    }
}
