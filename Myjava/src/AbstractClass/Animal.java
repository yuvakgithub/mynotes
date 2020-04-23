package AbstractClass;

public abstract class Animal {
    private int id;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public abstract void makeSound();

}
