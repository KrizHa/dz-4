public class Printdz4 {
    public int toPrintInt = 10;

    public String print() {
        String valueForDz = String.format("\"---<%d>---\"%n", toPrintInt);
        System.out.println(valueForDz);
        return valueForDz;
    }
}
