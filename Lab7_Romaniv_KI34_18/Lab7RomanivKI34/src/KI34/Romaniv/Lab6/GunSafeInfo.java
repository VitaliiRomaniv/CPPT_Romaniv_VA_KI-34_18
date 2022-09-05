package KI34.Romaniv.Lab6;

public interface GunSafeInfo extends Comparable<GunSafeInfo>{
    double getSize();
    int getCapacity();
    double getWeight();
    double getPrice();

    String getMaterial();
    void print_info();
}
