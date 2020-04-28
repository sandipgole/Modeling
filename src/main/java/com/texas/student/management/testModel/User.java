package com.texas.student.management.testModel;

/*
* no need of all these things
*
*
*
*
*  @Entity
   @Table(name = "")
   @Autowired
   @OneToMany()
   @JoinTable()
   @Column(name = "")
*
*
*
* if you want to study all these you can, but dont include in the initial stage
*
* Just include normal fields with datatype including getter and setter
*
*
* if you are aware of builder pattern you can used it too
*
*
*
* this is basic guideline for you all but go beyond this.....
*
*
* */

public class User {

    private String name;
    private String key;
    private Address address;
    private Type userType;



    public static class Address{
        private String country;
        private String city;
        private int homeNumber;
        private String streetName;
        private String district;

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

        public int getHomeNumber() {
            return homeNumber;
        }

        public void setHomeNumber(int homeNumber) {
            this.homeNumber = homeNumber;
        }

        public String getStreetName() {
            return streetName;
        }

        public void setStreetName(String streetName) {
            this.streetName = streetName;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }
    }

    public enum Type{
        STUDENT,
        TEACHER,
        ADMIN,
        MANAGER,
        HEAD
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Type getUserType() {
        return userType;
    }

    public void setUserType(Type userType) {
        this.userType = userType;
    }
}
