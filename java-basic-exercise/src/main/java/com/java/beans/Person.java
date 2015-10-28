    package com.java.beans;

    import java.text.SimpleDateFormat;
    import java.util.Date;

    /**
     * Created by gbv on 10/26/2015.
     */
    public class Person {

        private String firstName;
        private String lastName;
        private Long personId;
        private Date startDate;
        private Date endDate;


        public static void main(String[] args) {
            PersonObject.printPersonObject();
        }


        private static class PersonBuilder{
           //Required Parameters
            private String firstName;
            private String lastName;
            private Long personId;

            //Optional Parameter
            private Date startDate;
            private Date endDate;


            public PersonBuilder(String firstName,String lastName, Long personId){
                this.firstName = firstName;
                this.lastName = lastName;
                this.personId = personId;
            }

            public PersonBuilder startDate(Date startDate){
                this.startDate = startDate;
                return this;
            }

            public PersonBuilder endDate(Date endDate){
                this.endDate = endDate;
                return this;
            }

            public Person build(){
                return new Person(this);
            }

        }

        private Person(PersonBuilder personBuilder){
            firstName = personBuilder.firstName;
            lastName = personBuilder.lastName;
            personId = personBuilder.personId;
            startDate = personBuilder.startDate;
            endDate = personBuilder.endDate;
        }

        public String getFirstName(){
            return firstName;
        }

        public String getLastName(){
            return lastName;
        }

        public Long getPersonId(){
            return personId;
        }

        public Date getStartDate(){
            return startDate;
        }

        public Date getEndDate() {
            return endDate;
        }

        private static class PersonObject{

                public static void printPersonObject() {
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");

                    Date stDate = new Date();
                    Date enDate = new Date();
                    try{
                        stDate = format.parse("2015-10-26");
                        enDate = format.parse("2015-10-27");
                    }catch (Exception ex){
                        ex.printStackTrace();
                    }

                    Person personObjectStartDate = new Person.PersonBuilder("Vinay","G B",1234L).startDate(stDate).build();
                    Person personObjectEndDate = new Person.PersonBuilder("Ahmed","M",5678L).endDate(enDate).build();
                    System.out.println("personObjectStartDate : "+personObjectStartDate.getFirstName());
                    System.out.println("personObjectEndDate : "+personObjectEndDate.getFirstName());
                }
        }

    }

