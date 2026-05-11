package nested_classes;

public class Human {
    private Passport passport;

    @Override
    public String toString() {
        return "Human = " + passport;
    }

    public Human(String series, String number, PassportType passportType) {
        this.passport = new Passport(series, number, passportType);
    }

    public static class Passport {
        private String series;
        private String number;
        private PassportType passportType;

        public Passport(String series, String number, PassportType passportType) {
            this.series = series;
            this.number = number;
            this.passportType = passportType;
        }

        public String getSeries() {
            return series;
        }

        public void setSeries(String series) {
            this.series = series;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public PassportType getPassportType() {
            return passportType;
        }

        public void setPassportType(PassportType passportType) {
            this.passportType = passportType;
        }

        @Override
        public String toString() {
            return "Passport{" +
                    "series='" + series + '\'' +
                    ", number='" + number + '\'' +
                    ", passportType=" + passportType +
                    '}';
        }
    }
}
