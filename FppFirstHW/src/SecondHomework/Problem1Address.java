package SecondHomework;

public class Problem1Address {


        private String street;
        private String city;
        private String state;
        private String zip;
        public Problem1Address(String str, String cit, String st, String z) {
            street = str;
            city = cit;
            state = st;
            zip = z;
        }
        /**
         * Provides a string representation of an address.
         */
        public String toString()
        {
            String s = street + ", " + city + ", " + state + " " + zip;
            return s;
        }
        public String getStreet() {
            return street;
        }
        public String getCity() {
            return city;
        }
        public String getState() {
            return state;
        }
        public String getZip() {
            return zip;
        }
    }


