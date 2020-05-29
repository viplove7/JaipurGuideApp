package com.example.viplove.jaipur;

public class Tourist {

        private int image;
        private String description;
        private String name;
        private String location;
        public Tourist(int timage,String tdescription,String tname,String tlocation){
            image=timage;
            description=tdescription;
            name=tname;
            location=tlocation;
        }

        public String getDescription() {
            return description;
        }

        public int getImage() {
            return image;
        }

        public String getLocation() {
            return location;
        }

        public String getName() {
            return name;
        }
}
