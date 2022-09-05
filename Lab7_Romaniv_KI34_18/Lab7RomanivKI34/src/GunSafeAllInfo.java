import KI34.Romaniv.Lab6.*;

public class GunSafeAllInfo {
    public static void main(String[] args) {
        GunSafe<? super GunSafeInfo> safe = new GunSafe<GunSafeInfo>();
        safe.WriteToPC(new PistolSafe());
        safe.WriteToPC(new HuntingWeaponSafe());
        safe.WriteToPC(new AmmunitionSafe());
        safe.WriteToPC(new PistolSafe(16, 99.34, 400, 5600));
        GunSafeInfo smallestsafe = safe.findMinCapacity();
        System.out.print("The lowest weight is in this:\n");
        smallestsafe.print_info();
    }

}
