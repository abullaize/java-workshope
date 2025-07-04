public class Location {
    public static void main(String[]agrs){
     private String Name;
     private double latitude; 
     private double longitude;
     private String address; 
     private String postalCode; 
     private String contact; 
      public Location(String name, double latitude, double longitude, String address, String postalCode, String contact) { 
        this.name = name; 
        this.latitude = latitude; 
        this.longitude = longitude; 
        this.address = address; 
        this.postalCode = postalCode; 
        this.contact = contact; 
        } 
        public String getName() {
             return Name; 
             } 
             public double getLatitude() { 
                return latitude;
                 }
                 public double getLongitude() { 
                    return longitude; 
                    } 
                    public String getAddress() { 
                        return address; 
                        }
                         public String getPostalCode() { 
                            return postalCode; 
                            } 
                            public String getContact() {
                                 return contact; 
                                 }

                 @Override
public String toString() {
    return "Name: " + Name + 
    "\nLatitude: " + latitude + 
    "\nLongitude: " + longitude +
           "\nAddress: " + address + 
           "\nPostal Code: " + postalCode + 
           "\nContact: " + contact;
        }
   }    
}