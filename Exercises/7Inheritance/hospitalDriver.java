public class hospitalDriver {
    public static void main(String[] args) {

        Hospital nurse_1 = new Hospital("Emily Rivera", 10122, "A&E");
        Hospital nurse_2 = new Hospital("Mary Oscar", 10121, "Oncology");
        Hospital doctor_1 = new Hospital("Dr. Robert Winslow", 20012, "Dermatology");
        Hospital doctor_2 = new Hospital("Jesus Christ", 20000, "Paediatrics");
        Hospital cleaner_1 = new Hospital("Vanessa O'Reiley", 30016, "HDU");
        Hospital sectary_1 = new Hospital("Harry Potter", 43011, "A&E");


        nurse_1.display();
        nurse_2.display();
        doctor_1.display();
        doctor_2.display();
        cleaner_1.display();
        sectary_1.display();
    }
}
