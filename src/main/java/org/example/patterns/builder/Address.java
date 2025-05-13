package org.example.patterns.builder;

public class Address {
    private String street;
    private String city;
    private String zipCode;

    public Address(Builder builder) {
        this.street = builder.street;
        this.city = builder.city;
        this.zipCode = builder.zipCode;
    }
    
    public static Builder builder() {
        return new Builder();
    }
    
    public static class Builder {
        private String street;
        private String city;
        private String zipCode;
        
        public Builder street(String street) {
            this.street = street;
            return this;
        }
        
        public Builder city(String city) {
            this.city = city;
            return this;
        }
        
        public Builder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }
        
        public Address build() {
            return new Address(this);
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}