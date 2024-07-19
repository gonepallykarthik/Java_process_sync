package PrototypeDesignPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Prototype pattern");
        StudentPrototype apr_batch = new StudentPrototype();
        apr_batch.setAvgPSP("90");
        apr_batch.setYearOfgrad("2022");
        apr_batch.setBatchName("2024-apr-batch");

        StudentPrototype s1 = apr_batch.clone();
    }
}
