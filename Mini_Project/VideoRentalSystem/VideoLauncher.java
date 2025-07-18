public class VideoLauncher {
    public static void main(String[] args) {
        VideoStore store = new VideoStore();

        store.addVideo("The Matrix");
        store.addVideo("Godfather");
        store.addVideo("Star Wars");

        store.receiveRating("The Matrix", 5);
        store.receiveRating("Godfather", 4);
        store.receiveRating("Star Wars", 3);

        store.doCheckout("The Matrix");
        store.doReturn("The Matrix");

        store.listInventory();
    }
}
