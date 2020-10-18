public class Record {
    private final String tconst;
    private final double averageRating;
    private final int numVotes;
    
    private static final int RECORD_SIZE = 25;

    public Record(String tconst, double averageRating, int numVotes) {
        this.tconst = tconst;
        this.averageRating = averageRating;
        this.numVotes = numVotes;
    }

    public static void main(String[] args) {
        Record rec = new Record("tt0000001", 5.6, 1645);
    }
}
