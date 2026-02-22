package jobsheet2;

public class StudentMain {
    public static void main(String [] args){

        mahasiswa17 mhs1 = new mahasiswa17();
        mhs1.name = "Muhamad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.Class = "SI 2J";
        mhs1.GPA = 3.55;

        mhs1.displayInformation();
        mhs1.changeClaas("SI 2K");
        mhs1.updateGPA(3.60);
        mhs1.displayInformation();

        mahasiswa17 mhs2 = new mahasiswa17("Annisa Nabila", "2141720160" , 3.25 , "TI 2L");
        mhs2.updateGPA(3.30);
        mhs2.displayInformation();
    }
}
