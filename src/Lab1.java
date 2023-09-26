public class Lab1 {
    public void ex1(int n, int k, int s, int m, int v) {
        double C = Math.pow(n, k);
        double t = C / s;
        double T, T_Final, T_Min, T_Hours, T_Days, T_Years;
        if (m == 0) T = 0;
        else T = t * v / m;
        T_Final = t + T;
        T_Min = T_Final / 60;
        T_Hours = T_Min / 60;
        T_Days = T_Hours / 24;
        T_Years = T_Days / 365;
        System.out.printf("При n = %d, k = %d, s = %d, m = %d, v = %d\n", n, k, s, m, v);
        System.out.printf("Час перебору всіх паролів = %.0f сек = %.0f днів = %.0f років\n", T_Final, T_Days, T_Years);
    }

    public void ex2(int n, int t, int s) {
        long C = (long) t * s * 365 * 24 * 60 * 60;
        double k = Math.log(C) / Math.log(n);
        System.out.printf("При n = %d, t = %d, s = %d\n", n, t, s);
        System.out.printf("Довжина паролю = %.0f\n", Math.ceil(k));
    }

    public void ex3(int k, int t, int s) {
        long C = (long) t * s * 365 * 24 * 60 * 60;
        double n = Math.exp(Math.log(C) / k);
        System.out.printf("При k = %d, t = %d, s = %d\n", k, t, s);
        System.out.printf("Розмір алфавіту: %.0f\n", Math.ceil(n));
    }
}
