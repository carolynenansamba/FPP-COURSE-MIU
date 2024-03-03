package Asignment5Qtn2;


    public class Secretary extends DeptEmployee {
        private double overtimeHours;

        // Professor Constructor
        Secretary(String dName, double dSalary, int dYear, int dMonth, int dDay) {
            super(dName, dSalary, dYear, dMonth, dDay);

        }
        // Accessor OverTimeHours
        public double getOvertimeHours() {
            return overtimeHours;
        }
        // Mutator OverTimeHours
        public  void setOverTimeHours(double overTimeHours){
            this.overtimeHours= overTimeHours;
        }

        @Override
        public  double computeSalary(){
            double sal = super.computeSalary();
            return sal + (12 * overtimeHours);
        }
}
