package S14_FileHandling.SerializationOfObjectsInFileOperation;

import java.io.Serializable;

class Vehicle implements Serializable {
    private static final long serialVersionUID = 3912296833143258226l;
    private final String type;
    private final int number;

    public Vehicle(String type, int number){
        this.type = type;
        this.number = number;
    }

    @Override
    public String toString(){
        return "Vehicle{" +
                "type='" +  type + '\'' +
                ", no='" + number +
                '}';
    }
}