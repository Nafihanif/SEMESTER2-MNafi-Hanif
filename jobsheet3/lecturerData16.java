package jobsheet3;

public class lecturerData16 {

// Method 1 : to display all lecturer data
    public void allLecturerData(lecturer16[] arrayOfLecturer){
        System.out.println("\n===== ALL LECTURER DATA =====");
        for (lecturer16 lctr : arrayOfLecturer){
            System.out.println("CODE   : " + lctr.code);
            System.out.println("NAME   : " + lctr.name);
            System.out.println("GENDER : " + (lctr.gender ? "Man" : "Woman"));
            System.out.println("AGE    : " + lctr.age);
            System.out.println("----------------------------------");
        }
    }

// Method 2 : to display number of lecturers by gender
    public void numberOfLecturersByGender (lecturer16[] arrayOfLecturer){
        int manCount = 0;
        int womanCount = 0;
        for (lecturer16 lctr : arrayOfLecturer){
            if (lctr.gender == true ){
                manCount++;
            } else {
                womanCount++;
            }
        }

        System.out.println("\n===== NUMBER OF LECTURERS BY GENDER =====");
        System.out.println("MAN   : " + manCount);
        System.out.println("WOMAN : " + womanCount);
    }

// Method 3 : to display average age of lecturers by gender
    public void averageAgeOfLecturersEachGender (lecturer16[] arrayOfLecturer){
        int manAgeTotal = 0,womanAgeTotal = 0;
        int manTotal = 0,womanTotal = 0;

        for (lecturer16 lctr : arrayOfLecturer){
            if (lctr.gender){
                manAgeTotal += lctr.age;
                manTotal++;
            }else{
                womanAgeTotal += lctr.age;
                womanTotal++;
            }
        }
        System.out.println("\n===== AVERAGE AGE OF LECTURERS BY GENDER =====");
        if (manTotal > 0){
            System .out.println(" Man  : " + (double)manAgeTotal / manTotal);
        } else {
            System.out.println(" Man  : (0) No data");
        }

        if (womanTotal > 0){
            System.out.println(" Woman : " + (double)womanAgeTotal / womanTotal);
        } else {
            System.out.println(" Woman : (0) No data");
        }

        System.out.println("----------------------------------");
    }

// Method 4 : to display the oldest lecturer
    public void oldestLecturer (lecturer16[] arrayOfLecturer){
        if (arrayOfLecturer.length == 0)return;
        
        lecturer16 oldest = arrayOfLecturer[0];
        for (lecturer16 lctr : arrayOfLecturer){
            if (lctr.age > oldest.age){
                oldest = lctr;
            }
        }
        System.out.println("\n===== OLDEST LECTURER =====");
        System.out.println("Name   : " + oldest.name + " (age : " + oldest.age + ")");
        System.out.println("----------------------------------");
    }

// Method 5 : to display the yougest lecturer
    public void youngestLecturer (lecturer16[] arrayOfLecturer){
        if (arrayOfLecturer.length == 0)return;
        
        lecturer16 youngest = arrayOfLecturer[0];
        for (lecturer16 lctr : arrayOfLecturer){
            if (lctr.age < youngest.age){
                youngest = lctr;
            }
        }
        System.out.println("\n===== YOUNGEST LECTURER =====");
        System.out.println("Name   : " + youngest.name + " (age : " + youngest.age + ")");
        System.out.println("----------------------------------");
    }
}