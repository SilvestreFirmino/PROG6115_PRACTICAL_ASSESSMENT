package prog6112_practical_assessment;

/**
 *
 * @author SYLVESTER FIRMINO
 */

    // Data model for TV Series
    class SeriesModel {

        public int SeriesId; // Unique identifier for the series
        public String SeriesName;
        public int SeriesAge;
        public int SeriesNumberOfEpisodes;

        // Constructor to initialize a SeriesModel object
        public SeriesModel( int SeriesId, String SeriesName, int age, int episodes) { //
            this.SeriesId = SeriesId;
            this.SeriesName = SeriesName;
            this.SeriesAge = age;
            this.SeriesNumberOfEpisodes = episodes;
        }

// Setters to update the series attributes
    public void setEpisodes(int newEpisodes) {
        this.SeriesNumberOfEpisodes = newEpisodes;

    }
// Setters to update the series attributes
    public void setAge(int newAge) {
        this.SeriesAge = newAge;
    }

    public void setName(String newName) {
        this.SeriesName = newName;
    }

    public int getId() {
        return SeriesId;
    }

    public String getName() {
        return SeriesName;
    }

    // Returns age with a "+" sign
    public String getAge() {
        return SeriesAge + "+";
    }

    public String getEpisodes() {
        return SeriesNumberOfEpisodes + " episodes";
    }
}