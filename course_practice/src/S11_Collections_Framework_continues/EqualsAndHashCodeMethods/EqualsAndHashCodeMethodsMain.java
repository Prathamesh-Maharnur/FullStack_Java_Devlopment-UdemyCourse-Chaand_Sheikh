package S11_Collections_Framework_continues.EqualsAndHashCodeMethods;

import java.util.Objects;

class Code{
    private String sectionNo;
    private String lectureNo;

    public Code(String sectionNo, String lectureNo){
        this.sectionNo = sectionNo;
        this.lectureNo = lectureNo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Code code = (Code) o;
        return Objects.equals(sectionNo, code.sectionNo) && Objects.equals(lectureNo, code.lectureNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sectionNo, lectureNo);
    }

    @Override
    public String toString(){
        return "Code{" +
                "sectionNo='" + sectionNo + '\'' +
                "lectureNo='" + lectureNo + '\'' +
                '}';
    }
}

class EqualsAndHashCodeMethodsMain{
    public static void main(String[] args){
        String x1 = "Prathamesh";
        System.out.println("x1 == \"Prathamesh\": "+(x1 == "Prathamesh"));
        x1 += "Maharnur";
        System.out.println("x1 == \"PrathameshMaharnur\": "+x1 == "PrathameshMaharnur");

        String x2 = "PrathameshMaharnur";
        System.out.println("x1 hashcode: "+x1.hashCode());
        System.out.println("x2 hashcode: "+x2.hashCode());
        System.out.println("x1 == x2: "+(x1 == x2));
        System.out.println("x1.equals(x2): "+x1.equals(x2));

        System.out.println("**********************************************");

        Code c1 = new Code("01","01");
        Code c2 = new Code("01","01");
        System.out.println("c1 hashcode: "+c1.hashCode());
        System.out.println("c2 hashcode: "+c2.hashCode());
        System.out.println("equals() and hashCode() overridden:");
        System.out.println("c1 == c2: "+(c1 == c2));
        System.out.println("c1.equals(c2): "+c1.equals(c2));

    }
}
