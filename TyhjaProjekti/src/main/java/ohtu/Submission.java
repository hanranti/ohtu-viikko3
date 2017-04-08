package ohtu;

public class Submission {

    private String student_number;
    private String week;
    private String hours;
    private String a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14,
            a15, a16, a17, a18, a19, a20, a21;
    private int tehtyjaTehtavia;

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

    private int setTehtyjaTehtavia() {
        tehtyjaTehtavia = 0;
        if (a1 != null && a1.equals("true")) {
            tehtyjaTehtavia++;
        }
        if (a2 != null && a2.equals("true")) {
            tehtyjaTehtavia++;
        }
        if (a3 != null && a3.equals("true")) {
            tehtyjaTehtavia++;
        }
        if (a4 != null && a4.equals("true")) {
            tehtyjaTehtavia++;
        }
        if (a5 != null && a5.equals("true")) {
            tehtyjaTehtavia++;
        }
        if (a6 != null && a6.equals("true")) {
            tehtyjaTehtavia++;
        }
        if (a7 != null && a7.equals("true")) {
            tehtyjaTehtavia++;
        }
        if (a8 != null && a8.equals("true")) {
            tehtyjaTehtavia++;
        }
        if (a9 != null && a9.equals("true")) {
            tehtyjaTehtavia++;
        }
        if (a10 != null && a10.equals("true")) {
            tehtyjaTehtavia++;
        }
        if (a11 != null && a11.equals("true")) {
            tehtyjaTehtavia++;
        }
        if (a12 != null && a12.equals("true")) {
            tehtyjaTehtavia++;
        }
        if (a13 != null && a13.equals("true")) {
            tehtyjaTehtavia++;
        }
        if (a14 != null && a14.equals("true")) {
            tehtyjaTehtavia++;
        }
        if (a15 != null && a15.equals("true")) {
            tehtyjaTehtavia++;
        }
        if (a16 != null && a16.equals("true")) {
            tehtyjaTehtavia++;
        }
        if (a17 != null && a17.equals("true")) {
            tehtyjaTehtavia++;
        }
        if (a18 != null && a18.equals("true")) {
            tehtyjaTehtavia++;
        }
        if (a19 != null && a19.equals("true")) {
            tehtyjaTehtavia++;
        }
        if (a20 != null && a20.equals("true")) {
            tehtyjaTehtavia++;
        }
        if (a21 != null && a21.equals("true")) {
            tehtyjaTehtavia++;
        }
        return tehtyjaTehtavia;
    }

    public int getTehtyjaTehtavia() {
        return tehtyjaTehtavia;
    }

    public int getTehtavienMaara() {
        int i = 0;
        if (a1 == null) {
            System.out.println(a1);
            return i;
        }
        i++;
        if (a2 == null) {
            return i;
        }
        i++;
        if (a3 == null) {
            return i;
        }
        i++;
        if (a4 == null) {
            return i;
        }
        i++;
        if (a5 == null) {
            return i;
        }
        i++;
        if (a6 == null) {
            return i;
        }
        i++;
        if (a7 == null) {
            return i;
        }
        i++;
        if (a8 == null) {
            return i;
        }
        i++;
        if (a9 == null) {
            return i;
        }
        i++;
        if (a10 == null) {
            return i;
        }
        i++;
        if (a11 == null) {
            return i;
        }
        i++;
        if (a12 == null) {
            return i;
        }
        i++;
        if (a13 == null) {
            return i;
        }
        i++;
        if (a14 == null) {
            return i;
        }
        i++;
        if (a15 == null) {
            return i;
        }
        i++;
        if (a16 == null) {
            return i;
        }
        i++;
        if (a17 == null) {
            return i;
        }
        i++;
        if (a18 == null) {
            return i;
        }
        i++;
        if (a19 == null) {
            return i;
        }
        i++;
        if (a20 == null) {
            return i;
        }
        i++;
        if (a21 == null) {
            return i;
        }
        return 0;
    }

    @Override
    public String toString() {
        String s = "viikko " + week + ": tehtyjä tehtäviä yhteensä: " + setTehtyjaTehtavia()
                + "(maksimi " + getTehtavienMaara() + "), aikaa kului " + hours + " tuntia, tehdyt tehtävät: ";
        if (a1 != null && a1.equals("true")) {
            s += "1 ";
        }
        if (a2 != null && a2.equals("true")) {
            s += "2 ";
        }
        if (a3 != null && a3.equals("true")) {
            s += "3 ";
        }
        if (a4 != null && a4.equals("true")) {
            s += "4 ";
        }
        if (a5 != null && a5.equals("true")) {
            s += "5 ";
        }
        if (a6 != null && a6.equals("true")) {
            s += "6 ";
        }
        if (a7 != null && a7.equals("true")) {
            s += "7 ";
        }
        if (a8 != null && a8.equals("true")) {
            s += "8 ";
        }
        if (a9 != null && a9.equals("true")) {
            s += "9 ";
        }
        if (a10 != null && a10.equals("true")) {
            s += "10 ";
        }
        if (a11 != null && a11.equals("true")) {
            s += "11 ";
        }
        if (a12 != null && a12.equals("true")) {
            s += "12 ";
        }
        if (a13 != null && a13.equals("true")) {
            s += "13 ";
        }
        if (a14 != null && a14.equals("true")) {
            s += "14 ";
        }
        if (a15 != null && a15.equals("true")) {
            s += "15 ";
        }
        if (a16 != null && a16.equals("true")) {
            s += "16 ";
        }
        if (a17 != null && a17.equals("true")) {
            s += "17 ";
        }
        if (a18 != null && a18.equals("true")) {
            s += "18 ";
        }
        if (a19 != null && a19.equals("true")) {
            s += "19 ";
        }
        if (a20 != null && a20.equals("true")) {
            s += "20 ";
        }
        if (a21 != null && a21.equals("true")) {
            s += "21 ";
        }
        return s;
    }

}
