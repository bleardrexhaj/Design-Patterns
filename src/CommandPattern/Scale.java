package CommandPattern;

public class Scale implements Command{
    private int scale;

    public int getScale() {
        return scale;
    }

    public Scale(int scale) {
        this.scale = scale;
    }

    @Override
    public boolean execute() {
        System.out.println("Scaling the square by " + getScale());
        return false;
    }

    @Override
    public boolean undo() {
        System.out.println("Rescaling the square back.......");
        return false;
    }

}
