public class Address {
    /*
    - реализовать доступ к полям через методы set и get
    - страна
    - город
    - улица
    - номер дома
    - номер квартиры
    */
    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;

    public Address(String country, String city, String street, int house, int apartment) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public void printAddress(/*String country, String city, String street, int house, int apartment*/) {
        System.out.print(country+", ");
        System.out.print(city+", ");
        System.out.print(street+", ");
        if (getApartment()!=0) {
            System.out.print(house + "-");
            System.out.println(apartment);
        } else System.out.println(house);
    }

    public Address(String country, String city, String street, int house) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }





}
