public class Cloning implements Cloneable{

    int id;
    String description;

    public Cloning(int id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Cloning)super.clone();
    }
}

class TestClone
{
    public static void main(String[] args) throws CloneNotSupportedException {
        Cloning cloning = new Cloning(1,"Desc for 1");
        Cloning cloning1 = (Cloning) cloning.clone();

        System.out.println(cloning == cloning1);
        System.out.println(cloning.id == cloning1.id);

    }
}


