package ohtu;

public class Submission {

    private String student_number;
    private String week;
    private String hours;
    private boolean a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14,
            a15, a16, a17, a18, a19, a20, a21;
    private boolean a[];

    public Submission() {
        a = new boolean[21];
    }

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public void setA1(boolean a1) {
        this.a1 = a1;
        this.a[0] = a1;
    }

    public void setA2(boolean a2) {
        this.a2 = a2;
        this.a[1] = a2;
    }

    public void setA3(boolean a3) {
        this.a3 = a3;
        this.a[2] = a3;
    }

    public void setA4(boolean a4) {
        this.a4 = a4;
        this.a[3] = a4;
    }

    public void setA5(boolean a5) {
        this.a5 = a5;
        this.a[4] = a5;
    }

    public void setA6(boolean a6) {
        this.a6 = a6;
        this.a[5] = a6;
    }

    public void setA7(boolean a7) {
        this.a7 = a7;
        this.a[6] = a7;
    }

    public void setA8(boolean a8) {
        this.a8 = a8;
        this.a[7] = a8;
    }

    public void setA9(boolean a9) {
        this.a9 = a9;
        this.a[8] = a9;
    }

    public void setA10(boolean a10) {
        this.a10 = a10;
        this.a[9] = a10;
    }

    public void setA11(boolean a11) {
        this.a11 = a11;
        this.a[10] = a11;
    }

    public void setA12(boolean a12) {
        this.a12 = a12;
        this.a[11] = a12;
    }

    public void setA13(boolean a13) {
        this.a13 = a13;
        this.a[12] = a13;
    }

    public void setA14(boolean a14) {
        this.a14 = a14;
        this.a[13] = a14;
    }

    public void setA15(boolean a15) {
        this.a15 = a15;
        this.a[14] = a15;
    }

    public void setA16(boolean a16) {
        this.a16 = a16;
        this.a[15] = a16;
    }

    public void setA17(boolean a17) {
        this.a17 = a17;
        this.a[16] = a17;
    }

    public void setA18(boolean a18) {
        this.a18 = a18;
        this.a[17] = a18;
    }

    public void setA19(boolean a19) {
        this.a19 = a19;
        this.a[18] = a19;
    }

    public void setA20(boolean a20) {
        this.a20 = a20;
        this.a[19] = a20;
    }

    public void setA21(boolean a21) {
        this.a21 = a21;
        this.a[20] = a21;
    }

    @Override
    public String toString() {
        String s = "viikko " + week + ": tehtyjä tehtäviä yhteensä: " + " aikaa kului "
                + hours + " tuntia, tehdyt tehtävät: ";
        for (int i = 0; i < a.length; i++) {
            System.out.println(i);
            if (a[i]) {
                System.out.println(a[i]);
                s += i + 1 + " ";
            }
        }
        System.out.println(a1);
        return s;
    }

}
