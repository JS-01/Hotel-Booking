
package hotelhw1;

public class Room {
    private int Size;
    private int BoardType;
    private double Price;
    
    //constructor
    public Room(int Size, int BoardType, double Price) {
        this.Size = Size;
        this.BoardType = BoardType;
        this.Price = Price;
    }

    //getter
    public int getSize() {
        return Size;
    }

    public int getBoardType() {
        return BoardType;
    }

    public double getPrice() {
        return Price;
    }

    //setter
    public void setSize(int Size) {
        this.Size = Size;
    }

    public void setBoardType(int BoardType) {
        this.BoardType = BoardType;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
    
}
