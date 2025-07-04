 public interface sensar {
    public float getReading(); 
    public class Sensor {
    private double currentReading;

    
    public Sensor() {
        this.currentReading = 0.0; 
        System.out.println("Sensor initialized with default reading: " + this.currentReading);
    }

    
    public Sensor(double initialReading) {
        this.currentReading = initialReading;
        System.out.println("Sensor initialized with reading: " + this.currentReading);
    }

    
    public double getReading() {
        return this.currentReading;
    }

    
    public void setReading(double newReading) {
        this.currentReading = newReading;
        System.out.println("Sensor reading updated to: " + this.currentReading);
    }

    public static void main(String[] args) {
        
        Sensor sensor1 = new Sensor();
        System.out.println("Sensor 1 current reading: " + sensor1.getReading());

        
        Sensor sensor2 = new Sensor(25.5);
        System.out.println("Sensor 2 current reading: " + sensor2.getReading());

        
        sensor1.setReading(15.2);
        System.out.println("Sensor 1 updated reading: " + sensor1.getReading());
    }
}
    
}

