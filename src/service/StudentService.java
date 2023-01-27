package service;

import model.Student;

import java.util.Scanner;

public class StudentService {

    public Student createStudent() {
        Scanner scanner = new Scanner(System.in);

        Student studentObj = new Student();
        System.out.println("Please enter student's name");
        studentObj.setName(scanner.nextLine());
        System.out.println("Please enter student's surname");
        studentObj.setSurname(scanner.nextLine());
        System.out.println("Please enter student's age");
        studentObj.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Please enter student's gender");
        String gender = scanner.nextLine();

        while (!gender.equalsIgnoreCase("female") && !gender.equalsIgnoreCase("male") &&
                !gender.equalsIgnoreCase("f") && !gender.equalsIgnoreCase("m")) {
            System.out.println("Wrong gender. Please try again");
            gender = scanner.nextLine();
        }

        studentObj.setGender(gender.charAt(0));
        System.out.println("Please enter student's average mark");
        studentObj.setMark(scanner.nextDouble());
        System.out.println("Please enter whether student has a PhD degree or not");
        studentObj.setPhd(scanner.nextBoolean());

        return studentObj;
    }


    public void findYoungestFemaleStudent(Student[] studentArray) {
        int count = 0;

        for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i].getGender() == 'f') {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No female students found!");
        } else {
            Student[] femaleArray = new Student[count];
            int x = 0;
            for (int i = 0; i < studentArray.length; i++) {
                if (studentArray[i].getGender() == 'f') {
                    femaleArray[x] = studentArray[i];
                    x++;
                }
            }

            int min = femaleArray[0].getAge();
            int index = 0;
            int youngestCount = 1;

            for (int i = 0; i < femaleArray.length; i++) {
                if (femaleArray[i].getAge() < min) {
                    min = femaleArray[i].getAge();
                    index = i;
                } else if (femaleArray[i].getAge() == min) {
                    youngestCount++;
                }
            }

                System.out.println("The youngest female student is: ");
                femaleArray[index].printAll();


                /*Վիգեն ջան էս հատվածում ուզում էի պայման ավելացնեի եթե նույն ամենափոքր տարիքով 1-ից ավելի աղջիկ ուսանող կա
                * ուրեմն թող ինչքան կան, էդքանին էլ տպի, բայց ինչ արեցի կոդը չաշխատեց, ասումա nullPointerException because
                * youngestFemalesArray[k] is null*/

//                if (youngestCount>0){
//                int youngestIndex = 0;
//                Student[] youngestFemalesArray = new Student[youngestCount];
//                for (int j = 0; j < femaleArray.length; j++) {
//                    if(femaleArray[j].getAge()==min){
//                        youngestFemalesArray[youngestIndex] = femaleArray[j];
//                        youngestIndex++;
//                    }
//                }
//
//                System.out.println("There are more than 1 female students with the youngest age");
//                for (int k = 0; k < youngestFemalesArray.length; k++) {
//                    youngestFemalesArray[k].printAll();
//                }
//            }

        }
    }
}
