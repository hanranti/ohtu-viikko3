package ohtu;

public class Submission {

    private String student_number;
    private String week;
    private String hours;
    private boolean a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14,
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

    public void setA1(boolean a1) {
        this.a1 = a1;
    }

    public void setA2(boolean a2) {
        this.a2 = a2;
    }

    public void setA3(boolean a3) {
        this.a3 = a3;
    }

    public void setA4(boolean a4) {
        this.a4 = a4;
    }

    public void setA5(boolean a5) {
        this.a5 = a5;
    }

    public void setA6(boolean a6) {
        this.a6 = a6;
    }

    public void setA7(boolean a7) {
        this.a7 = a7;
    }

    public void setA8(boolean a8) {
        this.a8 = a8;
    }

    public void setA9(boolean a9) {
        this.a9 = a9;
    }

    public void setA10(boolean a10) {
        this.a10 = a10;
    }

    public void setA11(boolean a11) {
        this.a11 = a11;
    }

    public void setA12(boolean a12) {
        this.a12 = a12;
    }

    public void setA13(boolean a13) {
        this.a13 = a13;
    }

    public void setA14(boolean a14) {
        this.a14 = a14;
    }

    public void setA15(boolean a15) {
        this.a15 = a15;
    }

    public void setA16(boolean a16) {
        this.a16 = a16;
    }

    public void setA17(boolean a17) {
        this.a17 = a17;
    }

    public void setA18(boolean a18) {
        this.a18 = a18;
    }

    public void setA19(boolean a19) {
        this.a19 = a19;
    }

    public void setA20(boolean a20) {
        this.a20 = a20;
    }

    public void setA21(boolean a21) {
        this.a21 = a21;
    }

    private int setTehtyjaTehtavia() {
        tehtyjaTehtavia = 0;
        if (a1) {
            tehtyjaTehtavia++;
        }
        if (a2) {
            tehtyjaTehtavia++;
        }
        if (a3) {
            tehtyjaTehtavia++;
        }
        if (a4) {
            tehtyjaTehtavia++;
        }
        if (a5) {
            tehtyjaTehtavia++;
        }
        if (a6) {
            tehtyjaTehtavia++;
        }
        if (a7) {
            tehtyjaTehtavia++;
        }
        if (a8) {
            tehtyjaTehtavia++;
        }
        if (a9) {
            tehtyjaTehtavia++;
        }
        if (a10) {
            tehtyjaTehtavia++;
        }
        if (a11) {
            tehtyjaTehtavia++;
        }
        if (a12) {
            tehtyjaTehtavia++;
        }
        if (a13) {
            tehtyjaTehtavia++;
        }
        if (a14) {
            tehtyjaTehtavia++;
        }
        if (a15) {
            tehtyjaTehtavia++;
        }
        if (a16) {
            tehtyjaTehtavia++;
        }
        if (a17) {
            tehtyjaTehtavia++;
        }
        if (a18) {
            tehtyjaTehtavia++;
        }
        if (a19) {
            tehtyjaTehtavia++;
        }
        if (a20) {
            tehtyjaTehtavia++;
        }
        if (a21) {
            tehtyjaTehtavia++;
        }

        return tehtyjaTehtavia;
    }

    public int getTehtyjaTehtavia() {
        return tehtyjaTehtavia;
    }

    @Override
    public String toString() {
        String s = "viikko " + week + ": tehtyjä tehtäviä yhteensä: " + setTehtyjaTehtavia() + " aikaa kului "
                + hours + " tuntia, tehdyt tehtävät: ";
        if (a1) {
            s += "1 ";
        }
        if (a2) {
            s += "2 ";
        }
        if (a3) {
            s += "3 ";
        }
        if (a4) {
            s += "4 ";
        }
        if (a5) {
            s += "5 ";
        }
        if (a6) {
            s += "6 ";
        }
        if (a7) {
            s += "7 ";
        }
        if (a8) {
            s += "8 ";
        }
        if (a9) {
            s += "9 ";
        }
        if (a10) {
            s += "10 ";
        }
        if (a11) {
            s += "11 ";
        }
        if (a12) {
            s += "12 ";
        }
        if (a13) {
            s += "13 ";
        }
        if (a14) {
            s += "14 ";
        }
        if (a15) {
            s += "15 ";
        }
        if (a16) {
            s += "16 ";
        }
        if (a17) {
            s += "17 ";
        }
        if (a18) {
            s += "18 ";
        }
        if (a19) {
            s += "19 ";
        }
        if (a20) {
            s += "20 ";
        }
        if (a21) {
            s += "21 ";
        }
        return s;
    }

}
