package prog6115_practical_assessment;

/**
 *
 * @author SYLVESTER FIRMINO
 */

    // Data model for TV Series
    class SeriesModel {

        public int SeriesId;
        public String SeriesName;
        public int SeriesAge;
        public int SeriesNumberOfEpisodes;

        public SeriesModel( int SeriesId, String SeriesName, int age, int episodes) {
            this.SeriesId = SeriesId;
            this.SeriesName = SeriesName;
            this.SeriesAge = age;
            this.SeriesNumberOfEpisodes = episodes;
        }


    public void setEpisodes(int newEpisodes) {
        this.SeriesNumberOfEpisodes = newEpisodes;

    }

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

    public String getAge() {
        return SeriesAge + "+";
    }

    public String getEpisodes() {
        return SeriesNumberOfEpisodes + " episodes";
    }
}