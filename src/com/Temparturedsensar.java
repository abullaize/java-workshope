public class Temparturedsensar  implements Sensar{
    private float temparture;
    public Temparturedsensar(float atemparture){
        temparture=atemparture;
    }
    public float getReading(){
        return temparture;
    }
}
