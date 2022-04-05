public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y){
        setX(x);
        setY(y);
    }

    public Punto(){
        this(0, 0);
    }

    //do per scontato che punto sia diverso da null
    public Punto(Punto punto){
        this(punto.x, punto.y);
    }

    public void setX(int x){
        if(x > 0){
            this.x = x;
        }
    }

    public void setY(int y){
        if(y > 0){
            this.y = y;
        }
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public boolean equals(Punto punto){
        if(punto == null){
            return false;
        }
        if(this == punto){
            return true;
        }
        if(x == punto.x && y == punto.y){
            return true;
        }
        return false;
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
